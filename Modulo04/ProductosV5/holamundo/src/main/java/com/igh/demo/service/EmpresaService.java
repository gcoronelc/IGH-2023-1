package com.igh.demo.service;

import org.springframework.stereotype.Service;

import com.igh.demo.dto.TrabajadorDto;

@Service
public class EmpresaService {

	public TrabajadorDto calcSueldo(TrabajadorDto dto) {
		// Datos
		int horasDia = dto.getHorasDia();
		int dias = dto.getDias();
		double pagoHora = dto.getPagoHora();
		int hijos = dto.getHijos();
		// Proceso
		int horasTotales = horasDia * dias;
		double sueldo = horasTotales * pagoHora;
		double asignacion = hijos * 80;
		double bono = sueldo * ((horasTotales > 150) ? 0.15 : 0.0);
		double ingresos = sueldo + asignacion + bono;
		double renta = ingresos * ((ingresos > 1500.0) ? 0.08 : 0.0);
		double neto = ingresos - renta;
		// Reporte
		dto.setHorasTrabajadas(horasTotales);
		dto.setSueldo(sueldo);
		dto.setAsignacion(asignacion);
		dto.setBono(bono);
		dto.setIngresos(ingresos);
		dto.setRenta(renta);
		dto.setNeto(neto);
		return dto;
	}

}
