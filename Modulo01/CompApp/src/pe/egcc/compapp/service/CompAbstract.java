package pe.egcc.compapp.service;

import pe.egcc.compapp.dto.ItemDto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   25/01/2016
 */
public abstract class CompAbstract {

  protected static final double IGV = 0.18;
  protected static final double SERVICIO = 0.10;
  
  public abstract ItemDto[] procesar(double total);
  
}
