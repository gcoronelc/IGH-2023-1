package com.igh.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igh.demo.dto.ProductoDto;
import com.igh.demo.service.ProductoService;

@RestController
public class ProductoController {
	

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/all")
	public List<ProductoDto> getAll(){
		return productoService.getAll();
	}
	
}
