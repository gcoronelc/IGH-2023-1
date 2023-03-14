package aprendiendojava.excepciones;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class NotaFueraDeRango extends Exception {

	public NotaFueraDeRango() {
		super("Error: Nota debe estar en el rango de [0,20].");
	}

	public NotaFueraDeRango(String msg) {
		super(msg);
	}

}
