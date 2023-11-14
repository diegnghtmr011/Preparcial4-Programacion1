/**
 * Clase que representa una Fruta como producto. Esta clase extiende la clase Producto
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class Fruta extends Producto {
    private final double impuestoBase;
    private final double kilo;

    public Fruta(int valor, String nombre, double kilo) {
        super(valor, nombre);

        ASSERTION.assertion(kilo > 0, "El kilo debe ser mayor a 0");

        this.impuestoBase = 0.07;
        this.kilo = kilo;
    }

    public double getImpuestoBase() {
        return impuestoBase;
    }

    public double getKilo() {
        return kilo;
    }

    /**
     * Calcula el impuesto aplicable a la fruta.
     *
     * El impuesto se calcula en función del peso en kilogramos de la fruta.
     * Si el peso es mayor o igual a 10, el impuesto es 0. Si el peso es mayor a 3,
     * se descuenta 0.01 del impuesto por cada kilogramo adicional a partir del
     * cuarto kilogramo.
     *
     * @return El impuesto calculado para la fruta.
     */
    public double calcularImpuesto() {
        double descuentoImpuesto = impuestoBase;
        if (kilo >= 10) {
            descuentoImpuesto = 0;
        } else if (kilo > 3) {
            for (int i = 4; i <= kilo; i++)
                descuentoImpuesto -= 0.01;
        }
        return descuentoImpuesto;
    }

}
