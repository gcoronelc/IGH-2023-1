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
public class Prueba03 {

	public static void main(String[] args) {
		
		System.out.println("Prueba del método: obtenerUsuario");
		UsuarioService usuarioService = new UsuarioService();
		usuarioService.crearUsuario(1L, "Gustavo");
		usuarioService.crearUsuario(2L, "Claudia");
		UsuarioDto dto = usuarioService.obtenerUsuario(1L);
		System.out.println(dto.toString());
		
	}
}
