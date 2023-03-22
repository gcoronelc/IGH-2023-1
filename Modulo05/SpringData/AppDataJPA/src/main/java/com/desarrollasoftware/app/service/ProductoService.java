package com.desarrollasoftware.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrollasoftware.app.model.Producto;
import com.desarrollasoftware.app.repository.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;

	/*
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
	}*/

	public Producto created(Producto bean) {
		return productoRepository.save(bean);
	}

	/*
	public Producto created(Producto bean) {
		int id = bean.getId();
		database.put(id, bean);
		return database.get(id);
	}

	public void deleteById(int id) {
		database.remove(id);
	}*/

}
