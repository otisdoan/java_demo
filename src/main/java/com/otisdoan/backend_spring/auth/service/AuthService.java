package com.otisdoan.backend_spring.auth.service;

import com.otisdoan.backend_spring.auth.dto.AuthLogin;
import com.otisdoan.backend_spring.auth.dto.AuthRegister;
import com.otisdoan.backend_spring.users.entity.User;

import java.util.Optional;

public interface AuthService {

    Optional<User> login(AuthLogin authLogin);

    AuthRegister register(AuthRegister authRegister);
}
