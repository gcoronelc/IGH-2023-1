package com.igh.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.igh.demo.dto.ProductoDto;

@Service
public class ProductoService {

	private static Map<Integer, ProductoDto> database;

	static {
		database = new HashMap<Integer, ProductoDto>();
		database.put(1, new ProductoDto(1, "Refrigeradora", 1890.0));
		database.put(2, new ProductoDto(2, "Labadora", 1470.0));
		database.put(3, new ProductoDto(3, "Televisor", 2289.0));
		database.put(4, new ProductoDto(4, "Laptop", 5682.0));
		database.put(5, new ProductoDto(5, "Mueble 3-2-1", 1734.0));
	}


	public List<ProductoDto> getAll() {
		return new ArrayList<>(database.values());
	}

	public ProductoDto getProducto(int id) {
		ProductoDto dto = database.get(1);
		return dto;
	}

}
