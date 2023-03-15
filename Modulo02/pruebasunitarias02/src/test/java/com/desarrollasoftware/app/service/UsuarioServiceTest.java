package com.desarrollasoftware.app.service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.desarrollasoftware.app.dto.UsuarioDto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class UsuarioServiceTest {

	private UsuarioService usuarioService;

	public UsuarioServiceTest() {
	}

	@BeforeAll
	public static void setUpClass() {

	}

	@AfterAll
	public static void tearDownClass() {
	}

	@BeforeEach
	public void setUp() {
		usuarioService = new UsuarioService();
		usuarioService.crearUsuario(1L, "Gustavo");
		usuarioService.crearUsuario(2L, "Claudia");
	}

	@AfterEach
	public void tearDown() {
	}

	@DisplayName("Dado un usuario que queremos crear esperamos que cuando "
			  + "llamamos al metodo 'crearUsuario' el usuario sea creado.")
	@Test
	public void testCrearUsuario1() {
		System.out.println("Prueba 1 del método: crearUsuario");
		Long id = 100L;
		String nombre = "Gustavo";
		UsuarioDto esperado = new UsuarioDto(id, nombre);
		UsuarioDto resultado = usuarioService.crearUsuario(id, nombre);
		assertEquals(esperado, resultado);
		//UsuarioDto resultado = usuarioService.crearUsuario(id, "Angel");
		//assertEquals(esperado, resultado, "Los objetos son diferentes.");
	}

	@Test
	public void testCrearUsuario2() {
		System.out.println("Prueba 2 del método: crearUsuario");
		Long id = 100L;
		String nombre = "Gustavo";
		UsuarioDto esperado = new UsuarioDto(id, nombre);
		UsuarioDto resultado = usuarioService.crearUsuario(id, nombre);
		assertEquals(esperado.getId(), resultado.getId());
		assertEquals(esperado.getNombre(), resultado.getNombre(), "Los nombres son diferentes.");
	}

	@Test
	public void testObtenerUsuario1() {
		System.out.println("Prueba del método: obtenerUsuario");
		UsuarioDto esperado = null;
		UsuarioDto resultado = usuarioService.obtenerUsuario(100L);
		assertEquals(esperado, resultado);
	}

	@Test
	public void testObtenerUsuario2() {
		System.out.println("Prueba del método: obtenerUsuario");
		Long id = 1L;
		String nombre = "Gustavo";
		UsuarioDto esperado = new UsuarioDto(id, nombre);
		UsuarioDto resultado = usuarioService.obtenerUsuario(id);
		assertEquals(esperado, resultado);
	}

	@Test
	public void testActualizarUsuario() {
		System.out.println("Prueba del método: actualizarUsuario");
		Long id = 1L;
		String nombre = "Coronel";
		UsuarioDto expResult = new UsuarioDto(id, nombre);
		UsuarioDto result = usuarioService.actualizarUsuario(id, nombre);
		assertEquals(expResult, result);
	}

}
