package com.igh.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.igh.demo.service.MateService;
import com.igh.demo.service.spec.CalculadoraSpec;
import com.igh.demo.service.spec.VentaSpec;

import jakarta.annotation.Resource;

@RestController
public class AppController {
	
	@Autowired
	@Resource(name = "calculadora2")
	private CalculadoraSpec calculadora;
	
	@Autowired
	@Qualifier("VentaConDescuento")
	private VentaSpec venta;

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
	public String sumar(int n1,  int n2) {
		String respuesta = "Suma de " + n1 + " + " + n2 + " = " + mateService.suma(8, 5);
		return respuesta;
	}

	@PostMapping("/calcSuma")
	public String calcSuma( @RequestParam  int n1,@RequestParam  int n2) {
		String respuesta = "Suma de " + n1 + " + " + n2 + " = " + calculadora.suma(8, 5);
		return respuesta;
	}
	
	@PostMapping("/calcVenta")
	public String calcVenta( @RequestParam  double precio,@RequestParam  int cantidad) {
		String respuesta = "Venta: " + venta.calcVenta(precio, cantidad);
		return respuesta;
	}
}
