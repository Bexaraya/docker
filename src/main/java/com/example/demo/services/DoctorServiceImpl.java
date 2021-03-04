package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.persistence.entity.Doctor;
import com.example.demo.persistence.repository.DoctorRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService {

	private final DoctorRepository doctorRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Doctor> findByLocationAndSpeciality(String location, String speciality) {
		return doctorRepository.findByLocationAndSpeciality(location, speciality);
	}

}
