package com.desarrollasoftware.app.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.desarrollasoftware.app.error.ContadorNotFoundException;
import com.desarrollasoftware.app.model.Cliente;

@Service
public class ClienteService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Cliente created(Cliente cliente) {
		// Actualizar contador
		String sql = "update contador set int_contitem = int_contitem + 1 where vch_conttabla = 'Cliente' ";
		int filas = jdbcTemplate.update(sql);
		if (filas == 0) {
			throw new ContadorNotFoundException();
		}
		// Leer datos para la generación del codigo
		sql = "select int_contitem, int_contlongitud from contador where vch_conttabla = 'Cliente' ";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql);
		int cont = Integer.parseInt(map.get("int_contitem").toString());
		int size = Integer.parseInt(map.get("int_contlongitud").toString());
		// Generar el nuevo código
		String formato = "%0" + size + "d";
		String codigo = String.format(formato, cont);
		// Insertar el nuevo cliente
		sql = "insert into cliente(chr_cliecodigo, vch_cliepaterno, " + "vch_cliematerno, vch_clienombre, chr_cliedni, "
				+ "vch_clieciudad, vch_cliedireccion, vch_clietelefono," + "vch_clieemail) values(?,?,?,?,?,?,?,?,?)";
		Object[] args = { codigo, cliente.getPaterno(), cliente.getMaterno(), cliente.getNombre(), cliente.getDni(),
				cliente.getCiudad(), cliente.getDireccion(), cliente.getTelefono(), cliente.getEmail() };
		jdbcTemplate.update(sql, args);
		// Retornar el codigo
		cliente.setCodigo(codigo);
		return cliente;
	}

}
