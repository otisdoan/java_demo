package com.otisdoan.backend_spring.auth.repository;

import com.otisdoan.backend_spring.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<User, Long> {
    boolean existByPhone(String phone);

    Optional<User> findByPhone(String phone);

    Optional<User> findByName(String name);
}
