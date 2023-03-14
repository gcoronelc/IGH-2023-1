package com.igh.junitdemo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCocheService {

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

}
