package com.desarrollasoftware.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Cliente {

	private String codigo;
	private String paterno;
	private String materno;
	private String nombre;
	private String dni;
	private String ciudad;
	private String direccion;
	private String telefono;
	private String email;

}
