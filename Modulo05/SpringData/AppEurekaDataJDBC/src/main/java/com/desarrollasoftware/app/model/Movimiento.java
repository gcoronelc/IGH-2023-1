package com.desarrollasoftware.app.model;

import java.util.Date;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("MOVIMIENTO")
public class Movimiento {

	@Column("CHR_CUENCODIGO")
	private String cuenta;
	@Column("INT_MOVINUMERO")
	private Integer movimiento;
	@Column("DTT_MOVIFECHA")
	private Date fecha;
	@Column("CHR_EMPLCODIGO")
	private String empleado;
	@Column("CHR_TIPOCODIGO")
	private String tipo;
	@Column("DEC_MOVIIMPORTE")
	private Double importe;
	@Column("CHR_CUENREFERENCIA")
	private String referencia;

}
