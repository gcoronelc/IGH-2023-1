package pe.egcc.sistuni.pedidoapp.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   15/01/2016
 */
public class PedidoService {
  
  /**
   * Para calcular el impuesto se aplica el 18% al importe.
   * 
   * @param importe El importe al que se le aplicara el impuesto.
   * @return Retorna el impuesto.
   */
  public double calcularImpuesto(double importe){
    double impuesto;
    impuesto = importe * 0.18;
    return impuesto;
  }
  
  /**
   * Calcula el total del pedido.
   * 
   * @param importe Importe al que se le sumara el impuesto.
   * @return Retorna el total.
   */
  public double calcularTotal(double importe){
    double total;
    total = importe + calcularImpuesto(importe);
    return total;
  }

}
