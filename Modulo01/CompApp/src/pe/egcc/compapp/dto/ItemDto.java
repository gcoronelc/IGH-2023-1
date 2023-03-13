package pe.egcc.compapp.dto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 25/01/2016
 */
public class ItemDto {

  private String concepto;
  private double importe;

  public ItemDto() {
  }

  public ItemDto(String concepto, double importe) {
    this.concepto = concepto;
    this.importe = importe;
  }
  
  public String getConcepto() {
    return concepto;
  }

  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

}
