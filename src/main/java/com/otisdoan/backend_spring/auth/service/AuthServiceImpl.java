package com.otisdoan.backend_spring.auth.service;

import com.otisdoan.backend_spring.auth.dto.AuthLogin;
import com.otisdoan.backend_spring.auth.dto.AuthRegister;
import com.otisdoan.backend_spring.auth.repository.AuthRepository;
import com.otisdoan.backend_spring.users.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private AuthRepository authRepository;


    @Override
    @Transactional
    public Optional<User> login(AuthLogin authLogin) {
        if (authRepository.existsByPhone(authLogin.phone())) {
            throw new IllegalArgumentException("Phone is exists!");
        }
        return authRepository.findByPhone(authLogin.phone());
    }

    @Override
    @Transactional
    public AuthRegister register(AuthRegister authRegister) {
        return null;
    }
}
