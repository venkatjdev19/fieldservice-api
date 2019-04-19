package com.gaksvytech.fieldservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaksvytech.fieldservice.entity.Events;

public interface EventRepository extends JpaRepository<Events, Long> {

	List<Events> findAll();

	Optional<Events> findById(Long id);

	List<Events> findByName(String username);

	@SuppressWarnings("unchecked")
	Events save(Events entity);

}