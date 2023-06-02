package com.wiley.sbconcept.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.wiley.sbconcept.exception.DepNOTFoundException;
import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.repository.DepRepo;

@Service
public class DepServiceImpl implements DepService{
	
	@Autowired
	private DepRepo depRepo;

	@Override
	public Department createDepartment(@RequestBody Department dep) {
		// TODO Auto-generated method stub
		return depRepo.save(dep);

	}

	@Override
	public List<Department> getAllDepartmentsList() {
		// TODO Auto-generated method stub
		return depRepo.findAll();
	}

	@Override
	public Department getDepartmentById(Long departmentId) throws DepNOTFoundException {
		// TODO Auto-generated method stub
		Optional<Department> dep= depRepo.findById(departmentId);
		if(!dep.isPresent()) {
			throw new DepNOTFoundException("Wiley dept not available with the id you are searching for");
		}
		
		return dep.get();

	}

	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		// TODO Auto-generated method stub
		Department dep = depRepo.findById(departmentId).get();

        if(Objects.nonNull(dep.getDepartmentName()) &&  !"".equalsIgnoreCase(department.getDepartmentName()))
        {
            dep.setDepartmentName(department.getDepartmentName());
        }

           if(Objects.nonNull(dep.getDepartmentCode()) &&  !"".equalsIgnoreCase(department.getDepartmentCode()))
           {
               dep.setDepartmentCode(department.getDepartmentCode());
           }

           if(Objects.nonNull(dep.getDepartmentAddress()) &&  !"".equalsIgnoreCase(department.getDepartmentAddress()))
           {
               dep.setDepartmentAddress(department.getDepartmentAddress());
           }

       return depRepo.save(department);

	}

	@Override
	public void delDepartment(Long departmentId) {
		// TODO Auto-generated method stub
		depRepo.deleteById(departmentId);
		
	}

	@Override
	public Department getDepByName(String depName) {
		// TODO Auto-generated method stub
		return depRepo.findByDepartmentName(depName);

	}
	
	

}
