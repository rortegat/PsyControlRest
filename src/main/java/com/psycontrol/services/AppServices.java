package com.psycontrol.services;

import java.util.List;
import com.psycontrol.entity.Patient;

public interface AppServices {

	public List<Patient> getPatients();

	public void savePatient(Patient patient);

	public Patient getPatient(Integer pid);

	public void deletePatient(Integer pid);

	
}
