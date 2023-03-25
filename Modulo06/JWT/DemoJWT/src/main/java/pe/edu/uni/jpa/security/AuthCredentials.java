package pe.edu.uni.jpa.security;

import lombok.Data;

@Data
public class AuthCredentials {

	private String email;
	private String password;

}
