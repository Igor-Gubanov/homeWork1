package com.example.homework1.controllers;

import com.example.homework1.dto.SpecializationDTOResponse;
import com.example.homework1.services.SpecializationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/specializations")
public class SpecializationController {

    private final SpecializationService specializationService;

    public SpecializationController(SpecializationService specializationService) {
        this.specializationService = specializationService;
    }

    @GetMapping("/inactive")
    public List<SpecializationDTOResponse> getInactiveSpecializationsList (){
        return specializationService.specializationDTOResponse();
    }

}
