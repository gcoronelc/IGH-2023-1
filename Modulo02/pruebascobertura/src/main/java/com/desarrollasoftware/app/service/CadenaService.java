package com.desarrollasoftware.app.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class CadenaService {

	public static int contarLetras(String cadena, char letra) throws Exception {
		int contPos = 0, conVeces = 0, longCadena = 0;
		longCadena = cadena.length();
		if (longCadena > 0) {
			do {
				if (cadena.charAt(contPos) == letra) {
					conVeces++;
				}
				contPos++;
			} while (contPos < longCadena);
		}
		return conVeces;
	}

}
