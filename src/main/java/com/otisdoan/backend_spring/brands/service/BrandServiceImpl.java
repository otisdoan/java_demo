package com.otisdoan.backend_spring.brands.service;

import com.otisdoan.backend_spring.brands.dto.BrandResponse;
import com.otisdoan.backend_spring.brands.mapper.BrandMapper;
import com.otisdoan.backend_spring.brands.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<BrandResponse> list(Pageable pageable) {
        return brandRepository.findAll(pageable).map(BrandMapper::toResponse);
    }
}
