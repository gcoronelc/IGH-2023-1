package com.desarrollasoftware.app.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.desarrollasoftware.app.model.Producto;

import jakarta.annotation.PostConstruct;

@Service
public class ProductoService {

	private static Map<Integer, Producto> database;
	private static int contador;

	@PostConstruct
	public void initBean() {
		database = new HashMap<Integer, Producto>();
		database.put(1, new Producto(1, "Refrigeradora", 1890.0));
		database.put(2, new Producto(2, "Labadora", 1470.0));
		database.put(3, new Producto(3, "Televisor", 2289.0));
		database.put(4, new Producto(4, "Laptop", 5682.0));
		database.put(5, new Producto(5, "Mueble 3-2-1", 1734.0));
		contador = 5; // Ultimo valor
	}

	public List<Producto> getAll() {
		return new ArrayList<>(database.values());
	}

	public Producto getById(int id) {
		Producto bean = database.get(id);
		return bean;
	}

	public List<Producto> getList(int[] ids) {
		List<Producto> lista = new ArrayList<Producto>();
		for (int id : ids) {
			Producto bean = database.get(id);
			if (bean != null) {
				lista.add(bean);
			}
		}
		return lista;
	}

	public Producto created(Producto bean) {
		bean.setId(++contador);
		database.put(contador, bean);
		return database.get(contador);
	}

	public Producto update(Producto bean) {
		int id = bean.getId();
		database.put(id, bean);
		return database.get(id);
	}

	public void deleteById(int id) {
		database.remove(id);
	}

}
