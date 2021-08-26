package com.tekarch.dockerdemoaug23.repository;

import com.tekarch.dockerdemoaug23.entity.doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<doctor, Long> {
}
