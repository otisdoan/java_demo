package com.otisdoan.backend_spring.brands.service;

import com.otisdoan.backend_spring.brands.dto.BrandResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BrandService {
    Page<BrandResponse> list(Pageable pageable);
}
