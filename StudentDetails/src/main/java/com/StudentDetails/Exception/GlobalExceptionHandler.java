package com.StudentDetails.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> displayThis(AgeException ae) {
		return new ResponseEntity<Object>("Age is Below 18",HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
	}
	

}
