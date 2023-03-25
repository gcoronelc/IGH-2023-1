package com.desarrollasoftware.app.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/")
	public String home(Authentication authentication) {
		String cadena = "Hola " + authentication.getName();
		cadena += ", tienes el ROL " + authentication.getAuthorities().toString();
		return cadena;
	}

	@GetMapping("/user")
	public String user(Authentication authentication) {
		String cadena = "Hola " + authentication.getName();
		cadena += ", tienes el ROL " + authentication.getAuthorities().toString();
		return cadena;
	}

	@GetMapping("/admin")
	public String admin(Authentication authentication) {
		String cadena = "Hola " + authentication.getName();
		cadena += ", tienes el ROL " + authentication.getAuthorities().toString();
		return cadena;
	}
	
	@GetMapping("/todos")
	public String todos(Authentication authentication) {
		String cadena = "Hola " + authentication.getName();
		cadena += ", tienes el ROL " + authentication.getAuthorities().toString();
		return cadena;
	}
	
	

}
