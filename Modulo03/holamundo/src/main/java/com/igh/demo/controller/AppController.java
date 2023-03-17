package com.igh.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igh.demo.service.MateService;

@RestController
public class AppController {

	private MateService mateService;

	@Autowired
	public void setMateService(MateService mateService) {
		this.mateService = mateService;
	}

	@GetMapping("/saludo")
	public String holaMundo() {
		return "Hola todos, bienvenidos al maravilloso mundo de Spring Boot con Coronel.";
	}

	@GetMapping("/sumar")
	public String sumar(int n1, int n2) {
		String respuesta = "Suma de " + n1 + " + " + n2 + " = " + mateService.suma(8, 5);
		return respuesta;
	}

}
