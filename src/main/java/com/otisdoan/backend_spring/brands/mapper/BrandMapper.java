package com.otisdoan.backend_spring.brands.mapper;

import com.otisdoan.backend_spring.brands.dto.BrandResponse;
import com.otisdoan.backend_spring.brands.entity.Brand;

public class BrandMapper {
    public static BrandResponse toResponse(Brand brand) {
        return new BrandResponse(
                brand.getId(),
                brand.getName(),
                brand.getSlug(),
                brand.getLogoUrl(),
                brand.getDescription(),
                brand.isActive()
        );
    }
}
