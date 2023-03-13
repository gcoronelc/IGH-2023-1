package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   20/01/2016
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    PagoDto pagoDto = new PagoDto();
    pagoDto.setHorasDia(6);
    pagoDto.setDias(20);
    pagoDto.setPagoHora(150.0);
    // Proceso
    PagoService pagoService = new PagoService();
	 pagoDto = pagoService.procesar(pagoDto);
    // Reporte
    System.out.println("Ingresos: " + pagoDto.getIngresos());
    System.out.println("Renta: " + pagoDto.getRenta());
    System.out.println("Neto: " + pagoDto.getNeto());  
  }

}
