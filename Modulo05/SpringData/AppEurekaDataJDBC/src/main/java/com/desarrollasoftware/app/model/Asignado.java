package com.desarrollasoftware.app.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("ASIGNADO")
public class Asignado {
	
	@Id
	@Column("CHR_ASIGCODIGO")
	private String codigo;
	@Column("CHR_SUCUCODIGO")
	private String sucursal;
	@Column("CHR_EMPLCODIGO")
	private String empleado;
	@Column("DTT_ASIGFECHAALTA")
	private Date fechaAlta;
	@Column("DTT_ASIGFECHABAJA")
	private Date fechaBaja;
}
