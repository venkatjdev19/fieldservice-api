package com.gaksvytech.fieldservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaksvytech.fieldservice.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

	List<Users> findAll();

	Optional<Users> findById(Long id);

	List<Users> findByZoneId(Integer zoneId);

	@SuppressWarnings("unchecked")
	Users save(Users entity);

}
