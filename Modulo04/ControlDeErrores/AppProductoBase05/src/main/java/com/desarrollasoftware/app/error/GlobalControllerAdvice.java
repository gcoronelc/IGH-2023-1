package com.desarrollasoftware.app.error;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.NonNull;

/**
 * Mejorando el mensaje de error.
 * Mejorando el control de errores con ResponseEntityExceptionHandler.
 * 
 * @author Gustavo Coronel
 *
 */
@RestControllerAdvice
public class GlobalControllerAdvice extends ResponseEntityExceptionHandler{

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

	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatusCode statusCode, WebRequest request) {
		ApiError bean = new ApiError((@NonNull HttpStatus) statusCode,ex.getMessage());
		return ResponseEntity.status(statusCode).headers(headers).body(bean);
	}
	
	
}
