package com.tmobile.trackingapp;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Tracking")
public class TrackingController {

	TrackingService service;

	public TrackingController(TrackingService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index() {
		return "App for tracking and locating vaccinated patients";
	}

	@GetMapping("/list")
	public List<Patient> getAllPatients() {
		return service.getAllPatients();
	}

	@PostMapping("/add")
	public Patient addNewPatient(@RequestBody Patient patient) {
		return service.addPatient(patient);

	}
	
	
	@RequestMapping(value = "/id/{value:.+}", method = GET)
	public Optional<Patient> getById(@PathVariable( value = "value") Long value ) {
		return service.getDetailsById(value);
	}
	
	
	@RequestMapping("/byzipcode")
	public List<Patient>  getDetailsByZipCode(@RequestParam(value = "code") String zipcode) {
		return service.getAllPatientByZipCode(zipcode);
	}

	@RequestMapping("/vaccinated")
	public List<Patient>  getDetailsByZipCode(@RequestParam(value = "check") boolean check) {
		return service.getAllPatientVaccinated(check);
	}
	
	
}
