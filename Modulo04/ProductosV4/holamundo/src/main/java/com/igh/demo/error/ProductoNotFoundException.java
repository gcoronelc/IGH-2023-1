package com.igh.demo.error;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductoNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 165041598228221897L;

	public ProductoNotFoundException(int id) {
		super("No se ha encontrado el producto con ID: " + id);
	}
	
	public ProductoNotFoundException(int[] lista) {
		super("No se han encontrado los productos con ID: " + Arrays.toString(lista));
	}

}
