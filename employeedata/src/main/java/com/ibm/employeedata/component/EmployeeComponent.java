package com.ibm.employeedata.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.employeedata.entity.EmployeeEntity;
import com.ibm.employeedata.service.EmployeeDataService;

@RestController
@RequestMapping("/employee-data")
public class EmployeeComponent {

	@Autowired
	EmployeeDataService employeeService;
	
	@PostMapping("/post-data")
	public String employeeData(@RequestBody EmployeeEntity employee) {
		
		employeeService.employeeData(employee);
		return "Data created successfully";
	}
}
