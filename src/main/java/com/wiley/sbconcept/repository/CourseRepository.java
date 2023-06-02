package com.wiley.sbconcept.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiley.sbconcept.model.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{

	List<Course> findByFeeLessthan(double fee);
}
