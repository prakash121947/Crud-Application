package com.question.springbootdemoproject.service;

import java.util.List;

import com.question.springbootdemoproject.entity.Department;


public interface DepartmentService {

	// Save operation
	Department saveDepartment(Department department);

	// Read operation
	List<Department> fetchDepartmentList();

	// Update operation
	Department updateDepartment(Department department, Long EmployeeId);

	// Delete operation
	void deleteDepartmentById(Long EmployeeId);
}