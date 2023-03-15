package com.desarrollasoftware.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CadenaServiceTest {

	/*
	@Test
	public void testContarLetras1() throws Exception {
		System.out.println("Contar Letras 1");
		String cadena = "abcabca";
		char letra = 'a';
		int esperado = 3;
		int resultado = CadenaService.contarLetras(cadena, letra);
		assertEquals(esperado, resultado);
	}
	*/

	@Test
	public void testContarLetras2() throws Exception {
		System.out.println("Contar Letras 2");
		String cadena = "";
		char letra = 'a';
		int esperado = 0;
		int resultado = CadenaService.contarLetras(cadena, letra);
		assertEquals(esperado, resultado);
	}

}
