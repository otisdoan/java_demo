package com.otisdoan.backend_spring.categories.service;

import com.otisdoan.backend_spring.categories.dto.CategoryResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Page<CategoryResponse> list(Pageable pageable);
}
