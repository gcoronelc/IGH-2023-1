package com.desarrollasoftware.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CuentaDto {
	
	// Datos de entrada
	private String cliente;
	private String empleado;
	private String moneda;
	private double importe;
	private String clave;
	// Datos de salida
	private String cuenta;
	
}
