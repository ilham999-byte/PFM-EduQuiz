package com.project.eduquiz.repository;

import com.project.eduquiz.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
