package com.doctor.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.model.Doctor;

public interface DoctorService extends JpaRepository<Doctor,Long>{

}
