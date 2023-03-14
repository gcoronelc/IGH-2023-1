package aprendiendojava.service;

import aprendiendojava.excepciones.NotaFueraDeRango;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class MateService {
	
	public static void validarNota(int nota) throws NotaFueraDeRango{
		if(nota<0 || nota>20){
			throw new NotaFueraDeRango("ERROR: la nota " + nota + " esta fuera de rango [0,20]." );
		}
	}

}
