package com.desarrollasoftware.app.service;

import com.desarrollasoftware.app.dto.UsuarioDto;
import java.util.HashMap;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class UsuarioService {
	
	private final HashMap<Long,UsuarioDto> usuarios = new HashMap<>();
	
	
	public UsuarioDto crearUsuario(Long id, String nombre){
		usuarios.put(id, new UsuarioDto(id, nombre));
		return usuarios.get(id);
	}

	public UsuarioDto obtenerUsuario(Long id){
		return usuarios.get(id);
	}
	
	public UsuarioDto actualizarUsuario(Long id, String nombre){
		usuarios.put(id, new UsuarioDto(id, nombre));
		return usuarios.get(id);
	}
	
}
