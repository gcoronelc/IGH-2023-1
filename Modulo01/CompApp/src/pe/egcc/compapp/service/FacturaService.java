package pe.egcc.compapp.service;

import pe.egcc.compapp.dto.ItemDto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   25/01/2016
 */
public class FacturaService extends CompAbstract{

  @Override
  public ItemDto[] procesar(double total) {
    // Variables
    double consumo, impuesto, servicio, totalGeneral;
    // Proceso
    consumo = total / (1 + IGV);
    impuesto = total - consumo;
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Resultados
    ItemDto[] repo = {
      new ItemDto("Consumo",consumo),
      new ItemDto("Impuesto", impuesto),
      new ItemDto("Total", total),
      new ItemDto("Servicio", servicio),
      new ItemDto("Total General", totalGeneral)
    };
    return repo;
  }

}
