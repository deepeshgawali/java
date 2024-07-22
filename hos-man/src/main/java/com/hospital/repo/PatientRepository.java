package com.hospital.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.model.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long>{

}