package com.psycontrol.dao;

import org.springframework.data.repository.CrudRepository;

import com.psycontrol.entity.Patient;

public interface PatientDAO extends CrudRepository<Patient, Integer>{

}
