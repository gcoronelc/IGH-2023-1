package pe.egcc.compapp.prueba;

import pe.egcc.compapp.dto.ItemDto;
import pe.egcc.compapp.service.BoletaService;
import pe.egcc.compapp.service.CompAbstract;
import pe.egcc.compapp.service.FacturaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   25/01/2016
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    double importe = 5840.0;
    // Proceso
    CompAbstract comp = new BoletaService();
    ItemDto[] repo = comp.procesar(importe);
    // Reporte
    for (ItemDto bean : repo) {
      System.out.println(bean.getConcepto() + " -> " + bean.getImporte());
    }
  }
  
}
