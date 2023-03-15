package com.igh.junitdemo.prueba;

import com.igh.junitdemo.service.CocheService;

/**
 * 
 * @author Gustavo Coronel
 * 
 * Prueba 2: Aplica descuento.
 *
 */
public class Prueba02 {
	public static void main(String[] args) {

		System.out.println("Prueba con descuento");
		CocheService cocheService = new CocheService();
		CocheService.impuesto = 20.0;
		double precioCoche = cocheService.precioFinal(8000.0, 10.0);
		System.out.println("Precio final: " + precioCoche);

	}

}
