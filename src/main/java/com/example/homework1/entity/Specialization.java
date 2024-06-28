package com.example.homework1.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table (name = "specialization")
@JsonPropertyOrder({ "id", "name", "code", "description", "isActive", "createdAt" })
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 3)
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code_lat", nullable = false, unique = true)
    private String code;

    @Column(name = "description", length = 3000)
    private String description;

    @Column(name = "is_active",
            columnDefinition = "BOOLEAN DEFAULT true",
            insertable = false)
    private boolean isActive;

    @Column(name = "created_at",
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP",
            updatable = false)
    private LocalDateTime createdAt;

}
