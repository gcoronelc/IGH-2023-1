package com.desarrollasoftware.app.error;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2512963181461787324L;

	public ProductoNotFoundException() {
		super("No ha sido posible encontrar el producto buscado.");
	}

	public ProductoNotFoundException(int id) {
		super("No ha sido posible encontrar el producto con Id: " + id);
	}

	public ProductoNotFoundException(int[] ids) {
		super("No ha sido posible encontrar los productos con los siguientes IDs: " + Arrays.toString(ids));
	}
}
