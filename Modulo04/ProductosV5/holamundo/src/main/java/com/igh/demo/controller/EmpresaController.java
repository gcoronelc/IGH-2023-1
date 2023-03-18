package com.igh.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.igh.demo.dto.TrabajadorDto;
import com.igh.demo.service.EmpresaService;

@RestController
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
	@PostMapping("/CalculaSueldo")
	public TrabajadorDto calcularSueldo( @RequestBody TrabajadorDto dto) {
		return empresaService.calcSueldo(dto);
	}

}
