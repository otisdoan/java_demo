package com.otisdoan.backend_spring.auth.dto;

public record AuthLogin(
        String phone,
        String passwordLogin
) {
}
