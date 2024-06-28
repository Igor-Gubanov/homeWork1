package com.example.homework1.repository;

import com.example.homework1.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

//    @Query(nativeQuery = true, value = "" +
//            "SELECT COUNT(*) " +
//            "FROM doctor d " +
//            "JOIN doctor_specialization ds ON d.id = ds.doctor_id "+
//            "JOIN specialization s ON ds.specialization_id = s.id " +
//            "WHERE d.is_active = false AND s.id = :specializationId")
//    int countDoctorsIsActiveFalseBySpecializationId (int specializationId);
//
//    @Query(nativeQuery = true, value = "" +
//            "SELECT COUNT(*) " +
//            "FROM doctor d " +
//            "JOIN doctor_specialization ds ON d.id = ds.doctor_id "+
//            "JOIN specialization s ON ds.specialization_id = s.id " +
//            "WHERE d.is_active = true AND s.id = :specializationId")
//    int countDoctorsIsActiveTrueBySpecializationId (int specializationId);


    int countDoctorsByIsActiveAndSpecializationsId(boolean isActive, int specializationId);



}
