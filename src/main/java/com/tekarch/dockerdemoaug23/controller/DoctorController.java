package com.tekarch.dockerdemoaug23.controller;

import com.tekarch.dockerdemoaug23.entity.doctor;
import com.tekarch.dockerdemoaug23.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;
    @GetMapping(value="/doctor")
    private List<doctor> getDoctor(){
        return doctorRepository.findAll();
    }
}
