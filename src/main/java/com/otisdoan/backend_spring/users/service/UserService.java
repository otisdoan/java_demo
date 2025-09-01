package com.otisdoan.backend_spring.users.service;

import com.otisdoan.backend_spring.users.dto.UserCreateRequest;
import com.otisdoan.backend_spring.users.dto.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserResponse create(UserCreateRequest req);

    UserResponse get(Long id);

    Page<UserResponse> list(Pageable pageable);
}
