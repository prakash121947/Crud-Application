package com.question.springbootdemoproject.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * 
 * @author Prakash Gaikwad
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long EmployeeId;
	private String EmployeeFirstName;
	private String EmployeeLastName;
	private String EmployeeEmailAddress;
	private String EmployeeAge;
	
	public Long getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Long employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return EmployeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		EmployeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return EmployeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		EmployeeLastName = employeeLastName;
	}
	public String getEmployeeEmailAddress() {
		return EmployeeEmailAddress;
	}
	public void setEmployeeEmailAddress(String employeeEmailAddress) {
		EmployeeEmailAddress = employeeEmailAddress;
	}
	public String getEmployeeAge() {
		return EmployeeAge;
	}
	public void setEmployeeAge(String employeeAge) {
		EmployeeAge = employeeAge;
	}
	
}
