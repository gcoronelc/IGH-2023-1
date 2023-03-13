package aprendiendojava.prueba;

import aprendiendojava.service.IMate;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba07 {
	
	public static void main(String[] args) {
		
		IMate mate = new IMate() {
			@Override
			public int sumar(int n1, int n2) {
				return (n1 + n2);
			}
		};
		
		System.out.println("8 + 9 = " + mate.sumar(8, 9));
		
	}

}
