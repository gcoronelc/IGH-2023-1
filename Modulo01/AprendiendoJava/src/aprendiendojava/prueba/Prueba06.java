package aprendiendojava.prueba;

import aprendiendojava.service.IMate;
import aprendiendojava.service.MateService2;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba06 {
	
	public static void main(String[] args) {
		
		IMate mate = new MateService2();
		System.out.println("6 + 6 = " + mate.sumar(6, 6));
		
	}

}
