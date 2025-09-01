package com.otisdoan.backend_spring.categories.dto;


import java.time.Instant;

public record CategoryResponse(
        Long id,
        String name,
        String slug,
        String description,
        Long parentId,
        String imageUrl,
        int sortOrder,
        boolean isActive,
        Instant createdAt,
        Instant updatedAt
) {
}
