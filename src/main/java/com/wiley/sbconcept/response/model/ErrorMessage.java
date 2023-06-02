package com.wiley.sbconcept.response.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    
	private HttpStatus status;
    private String message;
	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public ErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}