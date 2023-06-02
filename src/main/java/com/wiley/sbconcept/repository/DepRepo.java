package com.wiley.sbconcept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiley.sbconcept.model.Department;

@Repository
public interface DepRepo extends JpaRepository<Department, Long>{

	public Department findByDepartmentName(String departmentName);


}
