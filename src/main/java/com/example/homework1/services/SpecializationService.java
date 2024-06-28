package com.example.homework1.services;

import com.example.homework1.dto.SpecializationDTOResponse;
import com.example.homework1.repository.DoctorRepository;
import com.example.homework1.repository.SpecializationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpecializationService {
    private final SpecializationRepository specializationRepository;
    private final DoctorRepository doctorRepository;

    public SpecializationService(SpecializationRepository specializationRepository, DoctorRepository doctorRepository) {
        this.specializationRepository = specializationRepository;
        this.doctorRepository = doctorRepository;
    }

    public List<SpecializationDTOResponse> specializationDTOResponse() {

        return specializationRepository.findByIsActiveFalse().stream().map(specialization -> {
            int specializationId = specialization.getId();
            return new SpecializationDTOResponse(
                    specialization,
                    doctorRepository.countDoctorsByIsActiveAndSpecializationsId(true, specializationId),
                    doctorRepository.countDoctorsByIsActiveAndSpecializationsId(false, specializationId)
            );
        }).collect(Collectors.toList());
    }
}
