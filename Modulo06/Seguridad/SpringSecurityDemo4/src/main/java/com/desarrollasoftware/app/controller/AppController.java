package com.desarrollasoftware.app.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/")
	public String home() {
		return "Hola todos.";
	}

	@GetMapping("/user")
	public String user(Authentication authentication) {
		return "Hola " + authentication.getName() + ", te has autenticado correctamente.";
	}

	@GetMapping("/admin")
	public String admin(Authentication authentication) {
		return "Hola, no tienes acceso.";
	}

}
