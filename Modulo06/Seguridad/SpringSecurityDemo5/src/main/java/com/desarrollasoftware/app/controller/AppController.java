package com.desarrollasoftware.app.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("titulo", "PAGINA PRINCIPAL");
		model.addAttribute("mensaje", "Hola mundo");
		return "home";
	}

	@GetMapping("/user")
	public String user(Authentication authentication, Model model) {
		model.addAttribute("titulo", "PAGINA DEL USUARIO");
		model.addAttribute("mensaje", "Hola " + authentication.getName());
		model.addAttribute("roles", authentication.getAuthorities());
		return "userPage";
	}

	@GetMapping("/admin")
	public String admin(Authentication authentication, Model model) {
		model.addAttribute("titulo", "PAGINA DEL administrado");
		model.addAttribute("mensaje", "Hola " + authentication.getName());
		model.addAttribute("roles", authentication.getAuthorities());
		return "adminPage";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
