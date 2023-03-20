package com.desarrollasoftware.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.desarrollasoftware.app.model.Producto;

@Service
public class ProductoService {
	
	private final String SQL_SELECT_BASE = "SELECT id, nombre, precio FROM producto ";

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static Map<Integer, Producto> database;
	private static int contador;



	public List<Producto> getAll() {
		List<Producto> lista = jdbcTemplate.query(SQL_SELECT_BASE, 
				new BeanPropertyRowMapper<Producto>(Producto.class));
		return lista;
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

	public Producto crear(Producto bean) {
		bean.setId(++contador);
		database.put(contador, bean);
		return database.get(contador);
	}

	public Producto created(Producto bean) {
		int id = bean.getId();
		database.put(id, bean);
		return database.get(id);
	}

	public void deleteById(int id) {
		database.remove(id);
	}

}
