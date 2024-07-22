package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Long>{

}
