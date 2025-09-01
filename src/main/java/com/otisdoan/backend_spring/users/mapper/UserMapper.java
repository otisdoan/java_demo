package com.otisdoan.backend_spring.users.mapper;

import com.otisdoan.backend_spring.users.dto.UserResponse;
import com.otisdoan.backend_spring.users.entity.User;

public class UserMapper {
    public static UserResponse toResponse(User u) {
        return new UserResponse(
                u.getId(),
                u.getEmail(),
                u.getPhone(),
                u.getFullName(),
                u.getDateOfBirth(),
                u.getGender(),
                u.getAvatarUrl(),
                u.getStatus(),
                u.getRole(),
                u.isEmailVerified(),
                u.isPhoneVerified(),
                u.getCreatedAt(),
                u.getUpdatedAt()
        );
    }
}
