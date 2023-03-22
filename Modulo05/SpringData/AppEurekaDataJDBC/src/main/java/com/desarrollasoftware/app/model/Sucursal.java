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
@Table("SUCURSAL")
public class Sucursal {

	@Id
	@Column("CHR_SUCUCODIGO")
	private String codigo;
	@Column("VCH_SUCUNOMBRE")
	private String nombre;
	@Column("VCH_SUCUCIUDAD")
	private String ciudad;
	@Column("VCH_SUCUDIRECCION")
	private String direccion;
	@Column("INT_SUCUCONTCUENTA")
	private Integer contador;
}
