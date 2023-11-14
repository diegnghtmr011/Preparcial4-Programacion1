/**
 * Clase abstracta que representa un Producto genérico
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public abstract class Producto {
    private final int valor;
    private final String nombre;

    public Producto(int valor, String nombre) {
        ASSERTION.assertion(valor > 0, "El valor debe ser mayor a 0");
        ASSERTION.assertion(nombre != null, "El nombre es requerido");

        this.valor = valor;
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Calcula el precio del producto teniendo en cuenta el impuesto aplicable.
     *
     * @return El precio calculado del producto.
     */
    public double calcularPrecio() {
        double impuesto = calcularImpuesto();
        return valor + valor * impuesto;
    }

    /**
     * Método abstracto que debe ser implementado por las clases hijas para
     * proporcionar
     * el cálculo específico del impuesto para el producto.
     *
     * @return El impuesto calculado para el producto.
     */
    public abstract double calcularImpuesto();
}
