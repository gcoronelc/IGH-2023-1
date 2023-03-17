package com.igh.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.igh.demo.service.spec.VentaSpec;

@Service
@Qualifier("VentaConDescuento")
public class Venta2 implements VentaSpec {

	@Override
	public double calcVenta(double precio, int cantidad) {
		return precio * cantidad * 0.85;
	}

}
