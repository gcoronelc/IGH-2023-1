package com.desarrollasoftware.app.error;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClienteNotFoundException extends RuntimeException {


	private static final long serialVersionUID = -1583954736000641800L;

	public ClienteNotFoundException() {
		super("No ha sido posible encontrar el producto buscado.");
	}

	public ClienteNotFoundException(int id) {
		super("No ha sido posible encontrar el producto con Id: " + id);
	}

	public ClienteNotFoundException(int[] ids) {
		super("No ha sido posible encontrar los productos con los siguientes IDs: " + Arrays.toString(ids));
	}
}
