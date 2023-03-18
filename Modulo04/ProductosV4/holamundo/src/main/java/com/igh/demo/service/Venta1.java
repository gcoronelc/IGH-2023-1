package com.igh.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.igh.demo.service.spec.VentaSpec;

@Service
@Qualifier("VentaNormal")
public class Venta1 implements VentaSpec {

	@Override
	public double calcVenta(double precio, int cantidad) {
		return precio * cantidad;
	}

}
