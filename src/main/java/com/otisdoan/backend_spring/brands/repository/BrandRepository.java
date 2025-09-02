package com.otisdoan.backend_spring.brands.repository;

import com.otisdoan.backend_spring.brands.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
