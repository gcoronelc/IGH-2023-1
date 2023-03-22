package com.desarrollasoftware.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrollasoftware.app.model.Cliente;
import com.desarrollasoftware.app.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	
	
	public Iterable<Cliente> findAll(){
		return clienteRepository.findAll();
	}
	
	
	
}
