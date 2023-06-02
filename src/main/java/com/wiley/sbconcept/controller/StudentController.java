package com.wiley.sbconcept.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.sbconcept.model.Course;
import com.wiley.sbconcept.model.Student;
import com.wiley.sbconcept.repository.CourseRepository;
import com.wiley.sbconcept.repository.StudentRepository;

@RestController
@RequestMapping("/api/student/course")
public class StudentController {
	
	private StudentRepository studentRepo;
	private CourseRepository courseRepo;
	
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
	
	@GetMapping
	public List<Student> findAllStudent(){
		return studentRepo.findAll();
	}
	
	@GetMapping("/{studentId}")
	public Student findStudentById(@PathVariable Long studentId) {
		return studentRepo.findById(studentId).orElse(null);
	}
	
	@GetMapping("/{studentName}")
	public List<Student> findStudentsContainingByName(@PathVariable String name){
		return studentRepo.findByNameContaining(name);
	}

	@GetMapping("/Search/{price}")
	public List<Course> findCourseLessThanFee(@PathVariable double price){
		return courseRepo.findByFeeLessthan(price);
	}
}

