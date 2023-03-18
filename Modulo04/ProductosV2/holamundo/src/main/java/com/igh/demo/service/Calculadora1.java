package com.igh.demo.service;

import org.springframework.stereotype.Service;

import com.igh.demo.service.spec.CalculadoraSpec;

@Service(value = "calculadora1")
public class Calculadora1 implements CalculadoraSpec {

	@Override
	public int suma(int n1, int n2) {
		return (n1 + n2);
	}

}
