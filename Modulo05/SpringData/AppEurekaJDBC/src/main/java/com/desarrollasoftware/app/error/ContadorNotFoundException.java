package com.desarrollasoftware.app.error;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ContadorNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2512963181461787324L;

	public ContadorNotFoundException() {
		super("No ha sido posible encontrar el contador de clientes.");
	}

	public ContadorNotFoundException(String id) {
		super("No ha sido posible encontrar el contador con Id: " + id);
	}

}
