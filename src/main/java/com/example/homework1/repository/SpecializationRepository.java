package com.example.homework1.repository;

import com.example.homework1.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {
    List<Specialization> findByIsActiveFalse();
}
