package com.wiley.sbconcept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiley.sbconcept.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{

}
