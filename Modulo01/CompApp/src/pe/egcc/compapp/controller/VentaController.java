package pe.egcc.compapp.controller;

import pe.egcc.compapp.dto.ItemDto;
import pe.egcc.compapp.service.CompAbstract;
import pe.egcc.compapp.service.CompFactory;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   27/01/2016
 */
public class VentaController {

  public String[] obtenerTipos() {
    String[] tipos = {CompFactory.COMP_FACTURA, CompFactory.COMP_BOLETA};
    return tipos;
  }

  public ItemDto[] procesar(String tipo, double total) {
    CompAbstract comp = CompFactory.obtenerComp(tipo);
    return comp.procesar(total);
  }

}
