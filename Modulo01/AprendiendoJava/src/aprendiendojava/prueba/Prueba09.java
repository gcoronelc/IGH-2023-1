package aprendiendojava.prueba;

import aprendiendojava.excepciones.NotaFueraDeRango;
import aprendiendojava.service.MateService;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba09 {
	
	public static void main(String[] args) {
		try {
			int nota1 = 30;
			int nota2 = 25;
			MateService.validarNota(nota1);
			MateService.validarNota(nota2);
			int prom = (nota1 + nota2) / 2;
			System.out.println("Promedio: " + prom);
		} catch (NotaFueraDeRango ex) {
			System.out.println(ex.getMessage());
		}
	}

}
