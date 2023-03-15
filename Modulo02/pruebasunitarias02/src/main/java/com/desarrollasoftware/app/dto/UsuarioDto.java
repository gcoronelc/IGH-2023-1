package com.desarrollasoftware.app.dto;

import java.util.Objects;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class UsuarioDto {

	private Long id;
	private String nombre;

	public UsuarioDto() {
	}

	public UsuarioDto(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "[id: " + id + ", nombre: " + nombre + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		UsuarioDto that = (UsuarioDto) obj;
		return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.nombre);
	}
}
