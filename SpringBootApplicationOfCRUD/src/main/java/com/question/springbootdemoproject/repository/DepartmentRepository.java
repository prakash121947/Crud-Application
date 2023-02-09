package com.question.springbootdemoproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.question.springbootdemoproject.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
