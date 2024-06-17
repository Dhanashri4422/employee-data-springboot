package com.ibm.employeedata.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.employeedata.entity.EmployeeEntity;
import com.ibm.employeedata.repository.EmployeeDataRepo;
import com.ibm.employeedata.service.EmployeeDataService;

@Component
public class EmployeeServiceImpl implements EmployeeDataService{

	@Autowired
	EmployeeDataRepo employeeRepo;

	@Override
	public void employeeData(EmployeeEntity employee) {
		
		employeeRepo.save(employee);
	}

	@Override
	public List<EmployeeEntity> getData() {
		
		List<EmployeeEntity> obj=new ArrayList<>();
		return obj;
	}

}
