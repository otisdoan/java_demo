package com.otisdoan.backend_spring.categories.respository;

import com.otisdoan.backend_spring.categories.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
