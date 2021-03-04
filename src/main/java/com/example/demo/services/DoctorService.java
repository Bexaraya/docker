package com.example.demo.services;

import java.util.List;

import com.example.demo.persistence.entity.Doctor;

public interface DoctorService {

	List<Doctor> findByLocationAndSpeciality(String location,
			String speciality);
}
