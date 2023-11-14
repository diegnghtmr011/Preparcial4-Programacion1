/**
 * Clase que representa un detalle de Factura
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class DetalleFactura {
    private final int cantidadProducto;
    private final Producto producto;

    public DetalleFactura(int cantidadProducto, Producto producto) {
        ASSERTION.assertion(cantidadProducto > 0, "La cantidad del Producto debe ser mayor a 0");
        ASSERTION.assertion(producto != null, "El producto es requerido");

        this.cantidadProducto = cantidadProducto;
        this.producto = producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public Producto geProducto() {
        return producto;
    }

    /**
     * Calcula el subtotal asociado al Detalle.
     *
     * El subtotal se calcula multiplicando la cantidad de unidades del producto por
     * el precio unitario del producto.
     *
     * @return El subtotal del detalle.
     */
    public int calcularSubtotal() {
        int subtotal = 0;
        double precio = producto.calcularPrecio();
        subtotal = (int) (precio * cantidadProducto);
        return subtotal;
    }

}
