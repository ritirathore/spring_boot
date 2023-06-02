package com.wiley.sbconcept.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiley.sbconcept.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

	List<Student> findByNameContaining(String name);
}
