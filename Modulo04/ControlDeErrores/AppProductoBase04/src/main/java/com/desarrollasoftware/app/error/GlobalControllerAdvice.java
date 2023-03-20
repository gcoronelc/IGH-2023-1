package com.desarrollasoftware.app.error;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fasterxml.jackson.databind.JsonMappingException;

@RestControllerAdvice
public class GlobalControllerAdvice {

	/**
	 * Controlando una excepción personalizada.
	 * 
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(ProductoNotFoundException.class)
	public ResponseEntity<ApiError> handleProductoNotFoundException(ProductoNotFoundException ex){
		ApiError bean = new ApiError(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(bean);
	}
	
	/**
	 * Controlando exciones JsonMappingException que se producen durando el mapeo de JSON por la libreria Jackson.
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(JsonMappingException.class)
	public ResponseEntity<ApiError> handleJsonMappingException(JsonMappingException ex){
		ApiError bean = new ApiError(HttpStatus.BAD_REQUEST,ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bean);
	}
	
}
