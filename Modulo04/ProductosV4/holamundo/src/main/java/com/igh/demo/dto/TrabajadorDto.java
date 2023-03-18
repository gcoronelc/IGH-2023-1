package com.igh.demo.dto;

import lombok.Data;

@Data
public class TrabajadorDto {

	// Datos
	private int horasDia;
	private int dias;
	private double pagoHora;
	private int hijos;
	// Resultado
	private int horasTrabajadas;
	private double sueldo;
	private double asignacion;
	private double bono;
	private double ingresos;
	private double renta;
	private double neto;

}
