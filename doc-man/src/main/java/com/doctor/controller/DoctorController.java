package com.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.doctor.model.Doctor;
import com.doctor.service.DoctorService;
@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired 
	private DoctorService doctorservice;
@PostMapping("/add")
public ResponseEntity<Doctor> addAll(@RequestBody Doctor doc){
	return ResponseEntity.ok(doctorservice.save(doc));
}

@GetMapping("/get")
public ResponseEntity<List<Doctor>> getAll() {
	return ResponseEntity.ok(doctorservice.findAll());
}

@PutMapping("/")
public ResponseEntity<Doctor> add(@RequestBody Doctor doc){
	return ResponseEntity.ok(doctorservice.save(doc));
}
@GetMapping("/get/{id}")
public ResponseEntity<Doctor> findById(@PathVariable Long id){
	return ResponseEntity.ok(doctorservice.findById(id).orElse(null));
}
@DeleteMapping("/{id}")
public ResponseEntity<Doctor>delete(@PathVariable Long id){
	doctorservice.findById(id).ifPresent(doctorservice::delete);
	return ResponseEntity.ok().build();
}


}


