/**
 * Clase de prueba para la clase Factura
 * @author Área de programación UQ - Diego Flores
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class FacturaTest {
    private static final Logger LOG = Logger.getLogger(FacturaTest.class.getName());

    /**
     * Método de prueba para validar datos correctos en una factura.
     */
    @Test
    public void validarDatosCorrectos() {
        LOG.info("Inicio de prueba para validar datos correctos...");
        Cafeteria cafeteria = new Cafeteria("uwu");

        Cliente cliente1 = new Estudiante("123456789", "josue", "maya", "jmaya777@example.com", 10);

        Producto producto1 = new BebidaAzucarada(20000, "chochue", 0.5, TipoBebidaAzucarada.JUGO);

        DetalleFactura detalleFactura1 = new DetalleFactura(3, producto1);

        Factura factura1 = new Factura(LocalDate.of(2023, 11, 23), cliente1);
        factura1.agregarDetalleFactura(detalleFactura1);

        cafeteria.agregarFactura(factura1);
        assertEquals(66000, factura1.calcularPrecioFinal());
        System.out.println(factura1.calcularPrecioFinal());

        LOG.info("Fin de prueba para validar datos correctos...");
    }

}
