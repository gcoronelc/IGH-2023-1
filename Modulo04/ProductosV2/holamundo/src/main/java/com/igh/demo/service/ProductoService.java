package com.igh.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.igh.demo.dto.ProductoDto;

import jakarta.annotation.PostConstruct;

@Service
public class ProductoService {

	private static Map<Integer, ProductoDto> database;
	private static int contador;

	/*
	 * static { database = new HashMap<Integer, ProductoDto>(); database.put(1, new
	 * ProductoDto(1, "Refrigeradora", 1890.0)); database.put(2, new ProductoDto(2,
	 * "Labadora", 1470.0)); database.put(3, new ProductoDto(3, "Televisor",
	 * 2289.0)); database.put(4, new ProductoDto(4, "Laptop", 5682.0));
	 * database.put(5, new ProductoDto(5, "Mueble 3-2-1", 1734.0)); }
	 */

	@PostConstruct
	public void initBean() {
		database = new HashMap<Integer, ProductoDto>();
		database.put(1, new ProductoDto(1, "Refrigeradora", 1890.0));
		database.put(2, new ProductoDto(2, "Labadora", 1470.0));
		database.put(3, new ProductoDto(3, "Televisor", 2289.0));
		database.put(4, new ProductoDto(4, "Laptop", 5682.0));
		database.put(5, new ProductoDto(5, "Mueble 3-2-1", 1734.0));
		contador = 5; // Ultimo valor
	}

	public List<ProductoDto> getAll() {
		return new ArrayList<>(database.values());
	}

	public ProductoDto getProducto(int id) {
		ProductoDto dto = database.get(id);
		return dto;
	}

	public List<ProductoDto> getLista(int[] lista) {
		List<ProductoDto> listado = new ArrayList<ProductoDto>();
		for (int id : lista) {
			listado.add(database.get(id));
		}
		return listado;
	}

	public List<ProductoDto> selectList(int[] lista) {
		List<ProductoDto> list = new ArrayList<ProductoDto>();
		Arrays.stream(lista).forEach(e -> list.add(database.get(e)));
		return list;
	}

	public ProductoDto crear(ProductoDto producto) {
		producto.setId(++contador);
		database.put(contador, producto);
		return database.get(contador);
	}

	public ProductoDto modificar(ProductoDto producto) {
		int id = producto.getId();
		database.put(id, producto);
		return database.get(id);
	}

	public void eliminar(int id) {
		database.remove(id);
	}

}
