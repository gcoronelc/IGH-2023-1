package com.igh.junitdemo.service;

public class CocheService {
	
	public static double impuesto;
	

	public CocheService() {
	}

	public double precioFinal(double precioBase, double descuento) {
		double precioConDescuento = precioBase;
		if (descuento < 0 || descuento > 100) {
			throw new RuntimeException("Descuento incorrecto, no aplica.");
		}
		if (precioBase >= 5000) {
			precioConDescuento -= (precioConDescuento * descuento / 100);
		}
		precioConDescuento += (precioConDescuento * impuesto / 100.0);
		return precioConDescuento;
	}


}
