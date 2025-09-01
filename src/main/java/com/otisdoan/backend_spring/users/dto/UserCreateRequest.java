package com.otisdoan.backend_spring.users.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record UserCreateRequest(
        @NotBlank @Email String email,
        @NotBlank @Size(min = 6, max = 100) String password,
        @NotBlank @Size(min = 8, max = 20) String phone,
        @NotBlank @Size(max = 120) String fullName,
        LocalDate dateOfBirth,
        String gender,                 // có thể null
        String avatarUrl,
        @NotNull String role
) {
}

