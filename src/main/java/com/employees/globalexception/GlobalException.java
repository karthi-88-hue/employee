package com.employees.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employees.allexception.NameNotFound;

@RestControllerAdvice
public class GlobalException {
@ExceptionHandler(NameNotFound.class) 
public ResponseEntity<Object> noName(NameNotFound ne) {
	return new ResponseEntity<>("No Values Found:",HttpStatus.NOT_FOUND);
}
	

}
