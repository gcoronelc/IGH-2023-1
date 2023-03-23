package com.desarrollasoftware.app.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "productos")
public class Producto {

	@Id
	private int id;
	private String nombre;
	private double precio;
	private Integer stock;

}
