package com.otisdoan.backend_spring.users.service;

import com.otisdoan.backend_spring.users.dto.UserCreateRequest;
import com.otisdoan.backend_spring.users.dto.UserResponse;
import com.otisdoan.backend_spring.users.entity.User;
import com.otisdoan.backend_spring.users.mapper.UserMapper;
import com.otisdoan.backend_spring.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public UserResponse create(UserCreateRequest req) {
        if (userRepo.existsByEmail(req.email())) {
            throw new IllegalArgumentException("Email đã tồn tại");
        }
        if (userRepo.existsByPhone(req.phone())) {
            throw new IllegalArgumentException("Số điện thoại đã tồn tại");
        }

        User user = User.builder()
                .email(req.email())
                .passwordHash(passwordEncoder.encode(req.password()))
                .phone(req.phone())
                .fullName(req.fullName())
                .dateOfBirth(req.dateOfBirth())
                .gender(req.gender())
                .avatarUrl(req.avatarUrl())
                .status("inactive")
                .role(req.role())
                .emailVerified(false)
                .phoneVerified(false)
                .build();

        user = userRepo.save(user);
        return UserMapper.toResponse(user);
    }

    @Override
    @Transactional(readOnly = true)
    public UserResponse get(Long id) {
        User user = userRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User không tồn tại"));
        return UserMapper.toResponse(user);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<UserResponse> list(Pageable pageable) {
        return userRepo.findAll(pageable).map(UserMapper::toResponse);
    }
}
