package com.wiley.sbconcept.service;

import java.util.List;

import com.wiley.sbconcept.exception.DepNOTFoundException;
import com.wiley.sbconcept.model.Department;

public interface DepService {

	public Department createDepartment( Department dep);
	
	public List<Department> getAllDepartmentsList();
	
	public Department getDepartmentById(Long departmentId) throws DepNOTFoundException;
	
	public Department updateDepartment(Long departmentId, Department dep);
	
	public void delDepartment(Long departmentId);
	
	public Department getDepByName(String depName);
}
