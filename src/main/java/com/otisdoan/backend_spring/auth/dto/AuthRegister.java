package com.otisdoan.backend_spring.auth.dto;

import java.time.LocalDate;

public record AuthRegister(
        String fullName,
        LocalDate dateOfBirth,
        String phone,
        String email,
        String passwordHash
) {
}
