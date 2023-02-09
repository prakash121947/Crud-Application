package com.question.springbootdemoproject.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.springbootdemoproject.entity.Department;
import com.question.springbootdemoproject.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	  // Save operation
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
	 // Read operation
	@Override
	public List<Department> fetchDepartmentList() {
		return (List<Department>) departmentRepository.findAll();
	}
	 // Update operation
	@Override
	public Department updateDepartment(Department department, Long EmployeeId) {

		Department depDB = departmentRepository.findById(EmployeeId).get();

		if (Objects.nonNull(department.getEmployeeFirstName()) && !"".equalsIgnoreCase(department.getEmployeeFirstName())) {
			depDB.setEmployeeFirstName(department.getEmployeeFirstName());
		}
		if (Objects.nonNull(department.getEmployeeLastName())&& !"".equalsIgnoreCase(department.getEmployeeLastName())) {
			depDB.setEmployeeLastName(department.getEmployeeLastName());
		}

		if (Objects.nonNull(department.getEmployeeEmailAddress()) && !"".equalsIgnoreCase(department.getEmployeeEmailAddress())) {
			depDB.setEmployeeEmailAddress(department.getEmployeeEmailAddress());
		}

		if (Objects.nonNull(department.getEmployeeAge()) && !"".equalsIgnoreCase(department.getEmployeeAge())) {
			depDB.setEmployeeAge(department.getEmployeeAge());
		}

		return departmentRepository.save(depDB);
	}
	   // Delete operation
	@Override
	public void deleteDepartmentById(Long EmployeeId) {
		{
			departmentRepository.deleteById(EmployeeId);
		}
	}
}