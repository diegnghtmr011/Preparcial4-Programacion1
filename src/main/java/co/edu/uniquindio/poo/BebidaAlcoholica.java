/**
 * Clase abstracta que representa una bebida alcohólica
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public abstract class BebidaAlcoholica extends Bebida {
    private final double contenidoAlcohol;

    public BebidaAlcoholica(int valor, String nombre, double contenidoAlcohol) {
        super(valor, nombre);

        ASSERTION.assertion(contenidoAlcohol > 0, "El contenido de alcohol debe ser mayor a 0");

        this.contenidoAlcohol = contenidoAlcohol;
    }

    public double getContenidoAlcohol() {
        return contenidoAlcohol;
    }

}
