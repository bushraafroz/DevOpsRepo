package com.tmobile.trackingapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingRepository extends JpaRepository<Patient, Long> {

	List<Patient> findByZipcode(String code);

	List<Patient> findByVaccinated(boolean check);

}
