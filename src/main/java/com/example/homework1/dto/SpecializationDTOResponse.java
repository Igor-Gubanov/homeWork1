package com.example.homework1.dto;

import com.example.homework1.entity.Specialization;
import com.fasterxml.jackson.annotation.JsonProperty;

public record SpecializationDTOResponse (Specialization specialization,
                                         @JsonProperty(value = "number_of_active_doctors") int numberOfActiveDoctors, @JsonProperty(value = "number_of_inactive_doctors") int numberOfInactiveDoctors){ }
