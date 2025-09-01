package com.otisdoan.backend_spring.categories.mapper;

import com.otisdoan.backend_spring.categories.dto.CategoryResponse;
import com.otisdoan.backend_spring.categories.entity.Category;

public class CategoryMapper {
    public static CategoryResponse toResponse(Category category) {
        return new CategoryResponse(
                category.getId(),
                category.getName(),
                category.getSlug(),
                category.getDescription(),
                category.getParentId(),
                category.getImageUrl(),
                category.getSortOrder(),
                category.isActive(),
                category.getCreatedAt(),
                category.getUpdatedAt()
        );
    }
}
