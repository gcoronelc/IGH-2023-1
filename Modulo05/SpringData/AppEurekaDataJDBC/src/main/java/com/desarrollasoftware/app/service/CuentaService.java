package com.desarrollasoftware.app.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.desarrollasoftware.app.dto.CuentaDto;
import com.desarrollasoftware.app.model.Asignado;
import com.desarrollasoftware.app.model.Cuenta;
import com.desarrollasoftware.app.model.Sucursal;
import com.desarrollasoftware.app.repository.AsignadoRepository;
import com.desarrollasoftware.app.repository.CuentaRepository;
import com.desarrollasoftware.app.repository.SucursalRepository;

@Service
public class CuentaService {

	@Autowired
	private SucursalRepository sucursalRepository;
	@Autowired
	private AsignadoRepository asignadoRepository;
	@Autowired
	private CuentaRepository cuentaRepository;

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public CuentaDto crearCuenta(CuentaDto cuentaDto) {
		Asignado asignado = asignadoRepository.findByEmpleado(cuentaDto.getEmpleado()).orElse(null);
		Sucursal sucursal = sucursalRepository.findById(asignado.getSucursal()).orElse(null);
		sucursal.setContador(sucursal.getContador() + 1);
		sucursalRepository.save(sucursal);
		String formato = "%05d";
		String codCuenta = sucursal.getCodigo() + String.format(formato, sucursal.getContador());
		Cuenta cuenta = new Cuenta();
		cuenta.setCodigo(codCuenta);
		cuenta.setCliente(cuentaDto.getCliente());
		cuenta.setEmpleado(cuentaDto.getEmpleado());
		cuenta.setSucursal(sucursal.getCodigo());
		cuenta.setSaldo(cuentaDto.getImporte());
		cuenta.setMoneda(cuentaDto.getMoneda());
		cuenta.setContador(1);
		cuenta.setClave(cuentaDto.getClave());
		cuenta.setFechaCreacion(LocalDateTime.now());
		cuenta.setEstado("ACTIVO");
		cuenta.setNuevo(true);
		cuentaRepository.save(cuenta);
		cuentaDto.setCuenta(codCuenta);
		return cuentaDto;
	}
}
