package aprendiendojava.dto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class PersonaDto {
	
	private String nombre;
	private int edad;

	public PersonaDto() {
		this.nombre = "Gustavo";
		this.edad = 40;
		System.out.println("Objeto creado.");
	}

	public PersonaDto(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		String cadena = "[nombre:" + nombre + ",edad:" + edad+"]";
		return cadena;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Chau objeto.");
	}

	
	

}
