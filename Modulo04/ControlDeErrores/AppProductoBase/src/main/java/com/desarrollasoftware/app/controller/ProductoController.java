package com.desarrollasoftware.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.desarrollasoftware.app.model.Producto;
import com.desarrollasoftware.app.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping
	public List<Producto> get() {
		return productoService.getAll();
	}

	@GetMapping("/id/{id}")
	public Producto get(@PathVariable int id) {
		return productoService.getById(id);
	}

	@GetMapping("/leer")
	public Producto leer(@RequestParam(value = "id", defaultValue = "1") int id) {
		return productoService.getById(id);
	}

	@GetMapping("/lista/{lista}")
	public List<Producto> get(@PathVariable int[] lista) {
		return productoService.getList(lista);
	}

	@PostMapping
	public Producto crear(@RequestBody Producto producto) {
		return productoService.created(producto);
	}

	@PutMapping
	public Producto modificar(@RequestBody Producto producto) {
		return productoService.update(producto);
	}

	@DeleteMapping("/id/{id}")
	public Producto eliminar(@PathVariable int id) {
		Producto producto = productoService.getById(id);
		productoService.deleteById(id);
		return producto;
	}

}
