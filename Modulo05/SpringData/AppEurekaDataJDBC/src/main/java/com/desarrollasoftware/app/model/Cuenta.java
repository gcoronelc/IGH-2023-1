package com.desarrollasoftware.app.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
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
@Table("CUENTA")
public class Cuenta implements Persistable<String> {

	@Id
	@Column("CHR_CUENCODIGO")
	private String codigo;
	@Column("CHR_MONECODIGO")
	private String moneda;
	@Column("CHR_SUCUCODIGO")
	private String sucursal;
	@Column("CHR_EMPLCREACUENTA")
	private String empleado;
	@Column("CHR_CLIECODIGO")
	private String cliente;
	@Column("DEC_CUENSALDO")
	private Double saldo;
	@Column("DTT_CUENFECHACREACION")
	@CreatedDate
	private LocalDateTime fechaCreacion;
	@Column("VCH_CUENESTADO")
	private String estado;
	@Column("INT_CUENCONTMOV")
	private Integer contador;
	@Column("CHR_CUENCLAVE")
	private String clave;
	@Transient
	private boolean nuevo;

	@Override
	public String getId() {
		return codigo;
	}

	@Override
	public boolean isNew() {
		return nuevo;
	}

}
