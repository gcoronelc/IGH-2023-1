package pe.egcc.compapp.prueba;

import pe.egcc.compapp.dto.ItemDto;
import pe.egcc.compapp.service.CompAbstract;
import pe.egcc.compapp.service.CompFactory;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   25/01/2016
 */
public class Prueba02 {

  public static void main(String[] args) {
    // Datos
    double importe = 5840.0;
    // Proceso
    CompAbstract comp = CompFactory.obtenerComp(CompFactory.COMP_BOLETA);
    ItemDto[] repo = comp.procesar(importe);
    // Reporte
    for (ItemDto bean : repo) {
      System.out.println(bean.getConcepto() + " -> " + bean.getImporte());
    }
  }
  
}
