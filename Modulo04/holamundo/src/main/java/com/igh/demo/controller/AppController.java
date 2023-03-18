package com.igh.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.igh.demo.service.MateService;
import com.igh.demo.service.spec.CalculadoraSpec;
import com.igh.demo.service.spec.VentaSpec;

import jakarta.annotation.Resource;

@RestController
public class AppController {

	@Autowired
	private Environment environment;

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

	@GetMapping("/saludo2")
	public String saludo2() {
		return environment.getProperty("app.saludo", "No existe");
	}

	@GetMapping("/sumar")
	// @RequestMapping(value = "/sumar", method = RequestMethod.GET)
	public String sumar(int n1, int n2) {
		String respuesta = "Suma de " + n1 + " + " + n2 + " = " + mateService.suma(n1, n2);
		return respuesta;
	}

	@PostMapping("/calcSuma")
	public String calcSuma(@RequestParam int n1, @RequestParam int n2) {
		String respuesta = "Suma de " + n1 + " + " + n2 + " = " + calculadora.suma(n1, n2);
		return respuesta;
	}

	@PostMapping("/calcVenta")
	public String calcVenta(@RequestParam double precio, @RequestParam int cantidad) {
		String respuesta = "Venta: " + venta.calcVenta(precio, cantidad);
		return respuesta;
	}

	@GetMapping("/all")
	public String errorAll() {
		return "Error All";
	}

	@GetMapping(value = "/parametros")
	public Map<String,String> capturandoParametros(@RequestParam Map<String, String> datos) {
		System.out.println("PARAMETROS RECIBIDOS");
		for(String key: datos.keySet()) {
			System.out.println(key + " -> " + datos.get(key));
		}
		return datos;
	}

}
