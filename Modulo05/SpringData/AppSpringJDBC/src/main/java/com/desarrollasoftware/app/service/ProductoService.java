package com.desarrollasoftware.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.desarrollasoftware.app.model.Producto;

@Service
public class ProductoService {
	
	private final String SQL_SELECT_BASE = "SELECT id, nombre, precio FROM producto ";
	private final String SQL_INSERT = "INSERT INTO producto(id, nombre, precio) VALUES(?,?,?)";

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
		String SQL = SQL_SELECT_BASE + " WHERE id=?";
		Producto bean = jdbcTemplate.queryForObject(SQL, 
				new BeanPropertyRowMapper<Producto>(Producto.class),id);
		return bean;
	}

	public List<Producto> getList(int[] ids) {
		List<Producto> lista = new ArrayList<Producto>();
		for (int id : ids) {
			try {
				Producto bean = getById(id);
				lista.add(bean);
			} catch(EmptyResultDataAccessException e){
			}
		}
		return lista;
	}

	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public Producto created(Producto bean) {
		String SQL = "SELECT sq_producto.nextval id FROM DUAL";
		int id = jdbcTemplate.queryForObject(SQL,Integer.class);
		jdbcTemplate.update(SQL_INSERT,id,bean.getNombre(), bean.getPrecio());
		bean.setId(id);
		return bean;
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
