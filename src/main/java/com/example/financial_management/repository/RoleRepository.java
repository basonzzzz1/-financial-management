package com.example.financial_management.repository;

import java.util.Optional;

import com.example.financial_management.models.ERole;
import com.example.financial_management.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}