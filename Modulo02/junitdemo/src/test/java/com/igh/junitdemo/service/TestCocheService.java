package com.igh.junitdemo.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class TestCocheService {
	
	@BeforeAll
	public static void antesDePruebas() {
		System.out.println("INICIO DE PRUEBAS");
		System.out.println("");
	}
	
	@AfterAll
	public static void despuesDePruebas() {
		System.out.println("");
		System.out.println("FIN DE PRUEBAS");
		System.out.println("");
	}
	
	@BeforeEach
	public void antesDePrueba() {
		System.out.println("Inicio de prueba");
	}
	
	@AfterEach
	public void despuesDePrueba() {
		System.out.println("Fin de prueba");
		System.out.println("");
	}
	

	@Test
	public void testPrecioFinal1() {
		System.out.println("Coche sin descuento.");
		double precioBase = 4000.0;
		double descuento = 10.0;
		CocheService cocheService = new CocheService();
		CocheService.impuesto = 20.0;
		double expResult = 4800.0;
		double result = cocheService.precioFinal(precioBase, descuento);
		Assertions.assertEquals(expResult, result, "Los precios son diferentes.");
	}

	@Test
	public void testPrecioFinal2() {
		System.out.println("Coche con descuento.");
		double precioBase = 8000.0;
		double descuento = 10.0;
		CocheService instance = new CocheService();
		CocheService.impuesto = 20.0;
		double expResult = 8640.0;
		double result = instance.precioFinal(precioBase, descuento);
		Assertions.assertEquals(expResult, result, "Los precios son diferentes.");
	}
	
	@Test
	public void testPrecioFinal3() throws Exception {
		System.out.println("Prueba con descuento incorrecto.");
		double precioBase = 4000.0;
		double descuento = 200.0;
		CocheService instance = new CocheService();
		CocheService.impuesto = 20.0;
		Assertions.assertThrows(Exception.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				instance.precioFinal(precioBase, descuento);
			}
		});
	}


}
