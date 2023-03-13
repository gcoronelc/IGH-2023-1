package pe.egcc.sistuni.pedidoapp.prueba;

import pe.egcc.sistuni.pedidoapp.service.PedidoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   15/01/2016
 */
public class Prueba01 {

    public static void main(String[] args) {
        PedidoService pedidoService;
        pedidoService = new PedidoService();
        double impuesto = pedidoService.calcularImpuesto(2560.0);
        double total = pedidoService.calcularTotal(2560.0);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
    }

}
