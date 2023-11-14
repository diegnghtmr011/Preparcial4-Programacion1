/**
 * Clase que representa una Factura de compra. Esta clase extiende la clase Cliente
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class Factura {
    private LocalDate fecha;
    private final Cliente cliente;
    private final Collection<DetalleFactura> listaDetalleFactura;

    public Factura(LocalDate fecha, Cliente cliente) {
        ASSERTION.assertion(fecha != null, "La fecha es requerida");
        ASSERTION.assertion(cliente != null, "El cliente es requerido");

        this.fecha = fecha;
        this.cliente = cliente;
        this.listaDetalleFactura = new LinkedList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Collection<DetalleFactura> getListaDetalleFactura() {
        return Collections.unmodifiableCollection(listaDetalleFactura);
    }

    /**
     * Calcula el precio final de la factura.
     *
     * El precio final se calcula sumando los subtotales de cada detalle de la
     * factura
     * y aplicando los descuentos correspondientes al cliente.
     *
     * @return El precio final de la factura.
     */
    public int calcularPrecioFinal() {
        int precioFinal = listaDetalleFactura.stream().mapToInt(DetalleFactura::calcularSubtotal).sum();
        double descuento = cliente.calcularDescuento();
        double descuentoAplicado = precioFinal * descuento;
        return (int) (precioFinal - descuentoAplicado);
    }

    /**
     * Agrega un detalle de factura a la lista de detalles.
     *
     * @param detalleFactura Detalle de factura a ser agregado.
     */
    public void agregarDetalleFactura(DetalleFactura detalleFactura) {
        listaDetalleFactura.add(detalleFactura);
    }

}
