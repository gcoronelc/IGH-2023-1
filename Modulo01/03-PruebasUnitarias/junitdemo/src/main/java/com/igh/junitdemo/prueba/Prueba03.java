package com.igh.junitdemo.prueba;

import com.igh.junitdemo.service.CocheService;

/**
 * 
 * @author Gustavo Coronel
 *
 * Descuento no aplica.
 * 
 */
public class Prueba03 {

	public static void main(String[] args) {

		try {
			System.out.println("Prueba con error");
			CocheService cocheService = new CocheService();
			CocheService.impuesto = 20.0;
			double precioCoche = cocheService.precioFinal(4000.0, 200.0);
			System.out.println("Precio final: " + precioCoche);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
