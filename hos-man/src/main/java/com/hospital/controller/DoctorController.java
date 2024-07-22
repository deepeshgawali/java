package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Doctor;
import com.hospital.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	 @Autowired
	    private DoctorService doctorService;

	    @GetMapping
	    public List<Doctor> getAllDoctors() {
	        return doctorService.getAllDoctors();
	    }

	    @GetMapping("/{id}")
	    public Doctor getDoctorById(@PathVariable Long id) {
	        return doctorService.getDoctorById(id);
	    }

	    @PostMapping
	    public Doctor saveDoctor(@RequestBody Doctor doctor) {
	        return doctorService.saveDoctor(doctor);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteDoctor(@PathVariable Long id) {
	        doctorService.deleteDoctor(id);
	    }
}
