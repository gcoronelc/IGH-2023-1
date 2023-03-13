package pe.egcc.compapp.service;

import pe.egcc.compapp.dto.ItemDto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 25/01/2016
 */
public class BoletaService extends CompAbstract {

  @Override
  public ItemDto[] procesar(double total) {
    //Variables
    double servicio, totalGeneral;
    //Procesar
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    //resultados
    ItemDto[] repo = {
      new ItemDto("Total", total),
      new ItemDto("Servicio", servicio),
      new ItemDto("Total General", totalGeneral)
    };
    return repo;
  }
}
