package aprendiendojava.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class AppService {

	public static String nombre;

	static {
		nombre = "Gustavo";
	}

	public int obtenerDato() {
		return 20;
	}

	public int obtenerDato(int a) {
		return 20;
	}

	public int obtenerDato(long a) {
		return 20;
	}

}
