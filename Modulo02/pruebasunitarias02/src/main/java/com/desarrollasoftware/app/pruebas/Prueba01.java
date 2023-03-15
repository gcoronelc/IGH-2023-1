package com.desarrollasoftware.app.pruebas;

import com.desarrollasoftware.app.dto.UsuarioDto;
import com.desarrollasoftware.app.service.UsuarioService;
import java.util.Objects;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		System.out.println("Prueba del método: Objects.equals");
		Long id = 10L;
		String nombre = "Gustavo";
		UsuarioDto usuario1 = new UsuarioDto(id, nombre);
		UsuarioDto usuario2 = new UsuarioDto(id, nombre);
		System.out.println(Objects.equals(usuario1, usuario2));
		
	}
}
