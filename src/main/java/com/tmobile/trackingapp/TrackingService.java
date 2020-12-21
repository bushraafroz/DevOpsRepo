package com.tmobile.trackingapp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class TrackingService {

	TrackingRepository repo;

	public TrackingService(TrackingRepository repo) {
		this.repo = repo;
	}

	public Patient addPatient(Patient patient) {
		return repo.save(patient);
	}

	public List<Patient> getAllPatients() {
		return repo.findAll();
	}
	
	public Optional<Patient> getDetailsById(long id) {
		return repo.findById(id);
	}

	public List<Patient> getAllPatientByZipCode(String code) {
		
		return repo.findByZipcode(code);
	}

	public List<Patient> getAllPatientVaccinated(boolean check) {
		return repo.findByVaccinated(check);
	}
}
