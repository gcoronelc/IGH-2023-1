package pe.edu.uni.jpa.controller;

import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/")
	public String home(Authentication authentication, Model model) {
		return "Ingreso Correctamente";
	}

}
