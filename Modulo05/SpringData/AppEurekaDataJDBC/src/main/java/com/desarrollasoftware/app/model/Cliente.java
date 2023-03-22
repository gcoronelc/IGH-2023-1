package com.desarrollasoftware.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("CLIENTE")
public class Cliente {

	@Id
	@Column("CHR_CLIECODIGO")
	private String codigo;
	@Column("VCH_CLIEPATERNO")
	private String paterno;
	@Column("VCH_CLIEMATERNO")
	private String materno;
	@Column("VCH_CLIENOMBRE")
	private String nombre;
	@Column("CHR_CLIEDNI")
	private String dni;
	@Column("VCH_CLIECIUDAD")
	private String ciudad;
	@Column("VCH_CLIEDIRECCION")
	private String direccion;
	@Column("VCH_CLIETELEFONO")
	private String telefono;
	@Column("VCH_CLIEEMAIL")
	private String email;

}
