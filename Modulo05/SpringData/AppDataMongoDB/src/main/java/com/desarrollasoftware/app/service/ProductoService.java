package com.desarrollasoftware.app.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrollasoftware.app.documents.Producto;
import com.desarrollasoftware.app.repository.ProductoRepository;

import jakarta.annotation.PostConstruct;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	public List<Producto> getAll() {
		return productoRepository.findAll();
	}

	public Producto getById(Integer id) {
		return productoRepository.findById(id).orElse(null);
	}

	public void deleteById(Integer id) {
		productoRepository.deleteById(id);
	}

}
