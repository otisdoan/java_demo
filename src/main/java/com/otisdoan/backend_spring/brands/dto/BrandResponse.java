package com.otisdoan.backend_spring.brands.dto;

public record BrandResponse(
        Long id,
        String name,
        String slug,
        String logoUrl,
        String description,
        Boolean isActive
) {
}
