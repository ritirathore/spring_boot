package com.wiley.sbconcept.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue
	private int bookId;
	private String name;
	private String isbn;
	
	@OneToMany(targetEntity= Book.class,fetch =FetchType.LAZY,
			cascade= CascadeType.ALL)
	private List<Book> books;
	

}
