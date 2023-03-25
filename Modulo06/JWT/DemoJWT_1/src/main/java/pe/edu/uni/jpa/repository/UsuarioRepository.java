package pe.edu.uni.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.uni.jpa.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Optional<Usuario>findOneByEmail(String email);
	

}
