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
import com.hospital.model.Appointment;
import com.hospital.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
@Autowired
private AppointmentService appservice;

@GetMapping
public List<Appointment> getAllAppointments(){
	return appservice.getAllAppointments();
}
@GetMapping("/{id}")
public Appointment getAppointmentById(@PathVariable Long id) {
    return appservice.getAppointmentById(id);
}

@PostMapping
public Appointment saveAppointment(@RequestBody Appointment appointment) {
    return appservice.saveAppointment(appointment);
}

@DeleteMapping("/{id}")
public void deleteAppointment(@PathVariable Long id) {
    appservice.deleteAppointment(id);
}
}
