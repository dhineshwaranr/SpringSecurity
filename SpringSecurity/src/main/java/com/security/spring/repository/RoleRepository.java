package com.security.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.spring.modals.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByRole(String role);
	
}
