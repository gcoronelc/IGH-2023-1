package com.desarrollasoftware.app.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.desarrollasoftware.app.model.Asignado;

public interface AsignadoRepository extends CrudRepository<Asignado, String> {

	@Query("SELECT * FROM eureka.asignado WHERE chr_emplcodigo = :codigo and dtt_asigfechabaja is null")
	Optional<Asignado> findByEmpleado(@Param("codigo") String codigo);

}
