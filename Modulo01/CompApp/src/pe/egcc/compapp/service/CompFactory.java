package pe.egcc.compapp.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   25/01/2016
 */
public final class CompFactory {

  public static final String COMP_FACTURA = "FACTURA";
  public static final String COMP_BOLETA = "BOLETA";

  private CompFactory() {
  }

  public static CompAbstract obtenerComp(String tipo){
    CompAbstract comp = null;
    switch(tipo){
      case COMP_FACTURA:
        comp = new FacturaService();
        break;
      case COMP_BOLETA:
        comp = new BoletaService();
        break;
    }
    return comp;
  }
  
  
}
