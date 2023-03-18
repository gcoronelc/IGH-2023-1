package com.igh.demo.controller;

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

import com.igh.demo.dto.ProductoDto;
import com.igh.demo.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping
	public List<ProductoDto> get() {
		return productoService.getAll();
	}

	@GetMapping("/id/{id}")
	public ProductoDto get(@PathVariable int id) {
		return productoService.getProducto(id);
	}

	@GetMapping("/lista/{lista}")
	public List<ProductoDto> get(@PathVariable int[] lista) {
		return productoService.getLista(lista);
	}

	@PostMapping
	public ProductoDto crear(@RequestBody ProductoDto producto) {
		return productoService.crear(producto);
	}

	@PutMapping
	public ProductoDto modificar(@RequestBody ProductoDto producto) {
		return productoService.modificar(producto);
	}

	@DeleteMapping("/id/{id}")
	public ProductoDto eliminar(@PathVariable int id) {
		ProductoDto producto = productoService.getProducto(id);
		productoService.eliminar(id);
		return producto;
	}

	/*
	 * @GetMapping("/leer") public ProductoDto leer(@RequestParam(value = "id",
	 * required = false) Optional<Integer> id) { ProductoDto producto =
	 * productoService.getProducto(id.orElse(1)); return producto; }
	 */

	@GetMapping("/leer")
	public ProductoDto leer(@RequestParam(value = "id", defaultValue = "1") int id) {
		return productoService.getProducto(id);
	}


}
