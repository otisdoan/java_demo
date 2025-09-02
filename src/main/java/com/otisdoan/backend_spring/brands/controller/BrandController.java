package com.otisdoan.backend_spring.brands.controller;


import com.otisdoan.backend_spring.brands.dto.BrandResponse;
import com.otisdoan.backend_spring.brands.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
@RequiredArgsConstructor
public class BrandController {
    private final BrandService service;

    @GetMapping
    public ResponseEntity<Page<BrandResponse>> list(@PageableDefault(size = 3, page = 0) Pageable pageable) {
        return ResponseEntity.ok(service.list(pageable));
    }
}
