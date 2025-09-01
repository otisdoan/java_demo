package com.otisdoan.backend_spring.users.dto;


import java.time.Instant;
import java.time.LocalDate;

public record UserResponse(
        Long id,
        String email,
        String phone,
        String fullName,
        LocalDate dateOfBirth,
        String gender,
        String avatarUrl,
        String status,
        String role,
        boolean emailVerified,
        boolean phoneVerified,
        Instant createdAt,
        Instant updatedAt
) {
}
