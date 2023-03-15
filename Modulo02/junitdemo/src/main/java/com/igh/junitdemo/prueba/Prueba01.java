package com.igh.junitdemo.prueba;

import com.igh.junitdemo.service.CocheService;

/**
 * 
 * @author Gustavo Coronel
 *
 * Prueba 1: No aplica descuento.
 * 
 */
public class Prueba01 {

	public static void main(String[] args) {

		System.out.println("Prueba sin descuento");
		CocheService cocheService = new CocheService();
		CocheService.impuesto = 20.0;
		double precioCoche = cocheService.precioFinal(4000.0, 10.0);
		System.out.println("Precio final: " + precioCoche);

	}

}
