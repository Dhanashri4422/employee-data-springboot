package com.ibm.employeedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.employeedata.entity.EmployeeEntity;

@Repository
public interface EmployeeDataRepo extends JpaRepository<EmployeeEntity, Long>{

}
