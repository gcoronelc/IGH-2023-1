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
public class Prueba02 {

	public static void main(String[] args) {
		
		System.out.println("Prueba del método: crearUsuario");
		Long id = 3L;
		String nombre = "Ricardo";
		UsuarioService usuarioService = new UsuarioService();
		UsuarioDto dto = usuarioService.crearUsuario(id, nombre);
		System.out.println(dto.toString());
		
	}
}
