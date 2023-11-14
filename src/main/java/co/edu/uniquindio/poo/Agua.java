/**
 * Clase que representa la categoría de bebida Agua
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

public class Agua extends Bebida {

    public Agua(int valor, String nombre) {
        super(valor, nombre);
    }

    /**
     * Calcula el impuesto asociado a la botella de agua.
     *
     * En el caso de agua, el impuesto siempre es cero.
     *
     * @return El impuesto calculado, que es siempre cero para el agua.
     */
    public double calcularImpuesto() {
        double impuesto = 0;
        return impuesto;
    }

}
