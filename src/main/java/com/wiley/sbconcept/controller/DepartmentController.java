package com.wiley.sbconcept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.sbconcept.exception.DepNOTFoundException;
import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.service.DepService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepService depService;
	
	@PostMapping("/deps")
	public Department createDepartment(@RequestBody Department dep)
	{
		return depService.createDepartment(dep);

	}
	

	@GetMapping("/deps") 
	public List<Department> getAllDepartments() {
		return depService.getAllDepartmentsList();
	}
	
	@GetMapping("/deps/{id}")
	public Department getDeptById(@PathVariable("id") Long deptIid) throws DepNOTFoundException{
		// TODO Auto-generated method stub
		return depService.getDepartmentById(deptIid);
	}
	
	@DeleteMapping("/deps/{id}")
	public String delDepById(@PathVariable("id") Long deptId) {
		depService.delDepartment(deptId);
		return "Department deleted successfully";
		
	}
	@GetMapping("/departmentsByName/{name}")
	public Department getDeptByName(@PathVariable("name") String deptName) {
		// TODO Auto-generated method stub
		return depService.getDepByName(deptName);
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long deptId,@RequestBody Department dep){
		// TODO Auto-generated method stub
		 
		 return depService.updateDepartment(deptId,dep);
	}


}
