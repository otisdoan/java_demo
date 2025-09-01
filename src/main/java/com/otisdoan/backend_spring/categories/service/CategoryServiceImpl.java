package com.otisdoan.backend_spring.categories.service;

import com.otisdoan.backend_spring.categories.dto.CategoryResponse;
import com.otisdoan.backend_spring.categories.mapper.CategoryMapper;
import com.otisdoan.backend_spring.categories.respository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<CategoryResponse> list(Pageable pageable) {
        return categoryRepository.findAll(pageable).map(CategoryMapper::toResponse);
    }
}
