package com.psycontrol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.psycontrol.dao.PatientDAO;
import com.psycontrol.entity.Patient;

@Service
public class PatientServices implements AppServices {
	
	// need to inject Patient DAO
		@Autowired
		private PatientDAO patientDAO;

		@Override
		@Transactional(readOnly=true)
		public List<Patient> getPatients() {
			return (List<Patient>) patientDAO.findAll();
		}

		@Override
		@Transactional
		public void savePatient(Patient patient) {
			patientDAO.save(patient);
		}

		@Override
		@Transactional(readOnly=true)
		public Patient getPatient(Integer pid) {
			return patientDAO.findById(pid).get();
		}

		@Override
		@Transactional
		public void deletePatient(Integer pid) {
			patientDAO.deleteById(pid);
		}

}
