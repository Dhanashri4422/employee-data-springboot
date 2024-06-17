package com.ibm.employeedata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.employeedata.entity.EmployeeEntity;

@Service
public interface EmployeeDataService {

	public void employeeData(EmployeeEntity employee);
	
	public List<EmployeeEntity> getData();
}
