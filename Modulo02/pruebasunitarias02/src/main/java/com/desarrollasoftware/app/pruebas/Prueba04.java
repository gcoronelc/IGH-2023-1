package com.desarrollasoftware.app.pruebas;

import com.desarrollasoftware.app.dto.UsuarioDto;
import com.desarrollasoftware.app.service.UsuarioService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba04 {

	public static void main(String[] args) {
		
		System.out.println("Prueba del método: actualizarUsuario");
		UsuarioService usuarioService = new UsuarioService();
		UsuarioDto user1 =usuarioService.crearUsuario(1L, "Gustavo");
		UsuarioDto user2 = usuarioService.crearUsuario(2L, "Claudia");
		System.out.println(user1.toString());
		UsuarioDto dto = usuarioService.actualizarUsuario(1L, "Coronel");
		System.out.println(dto.toString());
		
	}
}
