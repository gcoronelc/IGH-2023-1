package pe.edu.uni.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.uni.jpa.model.Contacto;
import pe.edu.uni.jpa.repository.ContactoRepository;



@RestController
@RequestMapping("/contactos")
@CrossOrigin(origins = "*")
public class ContactoController {
	
	@Autowired
	private ContactoRepository contactoRepository;

	@GetMapping
	public List<Contacto> listaConstactos(){
		return contactoRepository.findAll();
	}
	
	
}

