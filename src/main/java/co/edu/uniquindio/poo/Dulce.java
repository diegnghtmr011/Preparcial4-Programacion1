/**
 * Clase que representa un producto de tipo Dulce. Esta clase extiende la clase Producto
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class Dulce extends Producto {
    private final double impuestoBase;
    private final double porcentajeAzucar;

    public Dulce(int valor, String nombre, double porcentajeAzucar) {
        super(valor, nombre);

        ASSERTION.assertion(porcentajeAzucar > 0, "El porcentaje del azucar debe ser mayor a 0");

        this.impuestoBase = 0.1;
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public double getImpuestoBase() {
        return impuestoBase;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    /**
     * Calcula el impuesto específico de los dulces.
     *
     * Si el porcentaje de azúcar es mayor a 50, se aplica un impuesto adicional del
     * 0.1.
     *
     * @return El impuesto específico calculado para los dulces.
     */
    public double calcularImpuesto() {
        double impuesto = impuestoBase;
        double contenidoAzucar = porcentajeAzucar * 100;
        if (contenidoAzucar > 50) {
            impuesto += 0.1;
        }
        return impuesto;
    }

}
