package com.igh.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.igh.demo.dto.ProductoDto;
import com.igh.demo.error.ProductoNotFoundException;
import com.igh.demo.service.ProductoService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
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
	public ProductoDto get(@PathVariable int id) {
		ProductoDto bean = productoService.getProducto(id);
		if (bean == null) {
			//throw new ProductoNotFoundException(id);
			throw new ResponseStatusException(
			          HttpStatus.NOT_FOUND, "El producto con ID " + id + " no existe.");
		} else {
			return bean;
		}
	}

	@GetMapping("/lista/{lista}")
	public ResponseEntity<?> get(@PathVariable int[] lista) {
		List<ProductoDto> lista2 = productoService.getLista(lista);
		if (lista2.isEmpty()) {
			throw new ProductoNotFoundException(lista);
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
	public ProductoDto modificar(@RequestBody ProductoDto producto) {
		ProductoDto dto = productoService.getProducto(producto.getId());
		if (dto == null) {
			throw new ProductoNotFoundException(producto.getId());
		} else {
			dto = productoService.modificar(producto);
			return dto;
		}
	}

	@DeleteMapping("/id/{id}")
	public ResponseEntity<?> eliminar(@PathVariable int id) {
		ProductoDto dto = productoService.getProducto(id);
		if (dto == null) {
			throw new ProductoNotFoundException(id);
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
	
	/*
	@ExceptionHandler(ProductoNotFoundException.class)
	public ResponseEntity<ApiError> handleProductoNoEncontrado(ProductoNotFoundException ex){
		ApiError apiError = new ApiError();
		apiError.setEstado(HttpStatus.BAD_REQUEST);
		apiError.setFecha(LocalDateTime.now());
		apiError.setMensaje(ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
	}
	
	
	@ExceptionHandler(JsonMappingException.class)
	public ResponseEntity<ApiError> handleJsonMappingException(JsonMappingException ex) {
		ApiError apiError = new ApiError();
		apiError.setEstado(HttpStatus.BAD_REQUEST);
		apiError.setFecha(LocalDateTime.now());
		apiError.setMensaje(ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
	}
	*/

}
