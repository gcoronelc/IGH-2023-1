package com.igh.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> get() {
		List<ProductoDto> lista = productoService.getAll();
		if (lista.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(lista);
		}
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<?> get(@PathVariable int id) {
		ProductoDto bean = productoService.getProducto(id);
		if (bean == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(bean);
		}
	}

	@GetMapping("/lista/{lista}")
	public ResponseEntity<?> get(@PathVariable int[] lista) {
		List<ProductoDto> lista2 = productoService.getLista(lista);
		if (lista2.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(lista2);
		}
	}

	@PostMapping
	public ResponseEntity<?> crear(@RequestBody ProductoDto producto) {
		ProductoDto dto = productoService.crear(producto);
		return ResponseEntity.status(HttpStatus.CREATED).body(dto);
	}

	@PutMapping
	public ResponseEntity<?> modificar(@RequestBody ProductoDto producto) {
		ProductoDto dto = productoService.getProducto(producto.getId());
		if (dto == null) {
			return ResponseEntity.notFound().build();
		} else {
			dto = productoService.modificar(producto);
			return ResponseEntity.ok(dto);
		}
	}

	@DeleteMapping("/id/{id}")
	public ResponseEntity<?> eliminar(@PathVariable int id) {
		ProductoDto dto = productoService.getProducto(id);
		if (dto == null) {
			return ResponseEntity.notFound().build();
		} else {
			productoService.eliminar(id);
			return ResponseEntity.noContent().build();
		}
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
