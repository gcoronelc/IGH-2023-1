package com.desarrollasoftware.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	private Environment environment;

	@GetMapping("/")
	public String holaMundo() {
		return "Hola mundo.";
	}

	@GetMapping("/saludo")
	public String saludo() {
		return "Hola todos, bienvenidos al maravilloso mundo de Spring Boot con Coronel!!!";
	}

	@GetMapping("/saludo2")
	public String saludo2() {
		return environment.getProperty("app.saludo", "No existe saludo.");
	}

}
