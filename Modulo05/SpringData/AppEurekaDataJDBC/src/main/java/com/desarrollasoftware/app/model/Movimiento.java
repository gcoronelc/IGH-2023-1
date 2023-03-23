package com.desarrollasoftware.app.model;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("MOVIMIENTO")
public class Movimiento implements Persistable<String>{

	@Column("CHR_CUENCODIGO")
	private String cuenta;
	@Column("INT_MOVINUMERO")
	private Integer movimiento;
	@Column("DTT_MOVIFECHA")
	private LocalDateTime fecha;
	@Column("CHR_EMPLCODIGO")
	private String empleado;
	@Column("CHR_TIPOCODIGO")
	private String tipo;
	@Column("DEC_MOVIIMPORTE")
	private Double importe;
	@Column("CHR_CUENREFERENCIA")
	private String referencia;
	
	@Transient
	private boolean nuevo;

	@Override
	public String getId() {
		return cuenta + "-" + movimiento;
	}

	@Override
	public boolean isNew() {
		return nuevo;
	}

}
