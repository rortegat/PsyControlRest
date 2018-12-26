package com.psycontrol.controllers;


import org.springframework.web.bind.annotation.RestController;

import com.psycontrol.entity.Patient;
import com.psycontrol.services.AppServices;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@CrossOrigin(origins = {"http://localhost:4200"})

@RestController
@RequestMapping("/api")
class HomeController {
	
	@Autowired
	private AppServices appServices;

	@GetMapping("/patients")
	public List<Patient> getPatients() {
		return appServices.getPatients();
	}
	
	@GetMapping("/patients/{pid}")
	public Patient getPatient(@PathVariable int pid ) {
		Patient patient = appServices.getPatient(pid);
		return patient;
	}
	
	@PostMapping("/patients")
	@ResponseStatus(HttpStatus.CREATED)
	public Patient addPatient(@RequestBody Patient patient) {
		patient.setPid(null);
		appServices.savePatient(patient);
		return patient;
	}
	
	@PutMapping("/patients")
	@ResponseStatus(HttpStatus.CREATED)
	public Patient updatePatient(@RequestBody Patient patient) {
		appServices.savePatient(patient);
		return patient;
	}
	
	@DeleteMapping("/patients/{pid}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable int pid) {
		appServices.deletePatient(pid);
	}
	
}
