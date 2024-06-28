package com.example.homework1.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "experience", nullable = false)
    private int experience;

    @Column(name = "is_active",
            columnDefinition = "BOOLEAN DEFAULT true",
            insertable = false)
    private boolean isActive;

    @ManyToMany
    @JoinTable(name = "doctor_specialization",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "specialization_id"))
    private List<Specialization> specializations = new ArrayList<>();

}
