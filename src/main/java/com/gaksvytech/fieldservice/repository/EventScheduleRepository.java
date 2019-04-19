package com.gaksvytech.fieldservice.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaksvytech.fieldservice.entity.Schedules;

public interface EventScheduleRepository extends JpaRepository<Schedules, Long> {

	List<Schedules> findAll();

	Optional<Schedules> findByScheduleDate(Date date);

}