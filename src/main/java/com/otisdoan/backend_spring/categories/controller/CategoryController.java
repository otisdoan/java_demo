package com.otisdoan.backend_spring.categories.controller;

import com.otisdoan.backend_spring.categories.dto.CategoryResponse;
import com.otisdoan.backend_spring.categories.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<Page<CategoryResponse>> list(@PageableDefault(size = 10, page = 0) Pageable pageable) {
        return ResponseEntity.ok(categoryService.list(pageable));
    }
}
