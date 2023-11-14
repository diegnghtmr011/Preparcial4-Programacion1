/**
 * Clase que representa una bebida azucarada. Esta clase extiende la clase Bebida
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class BebidaAzucarada extends Bebida {
    private final double impuestoBase;
    private final double porcentajeAzucar;
    private final TipoBebidaAzucarada tipoBebidaAzucarada;

    public BebidaAzucarada(int valor, String nombre, double porcentajeAzucar, TipoBebidaAzucarada tipoBebidaAzucarada) {
        super(valor, nombre);

        ASSERTION.assertion(porcentajeAzucar > 0, "El porcentaje de azucar debe ser mayor a 0");

        this.porcentajeAzucar = porcentajeAzucar;
        this.tipoBebidaAzucarada = tipoBebidaAzucarada;
        this.impuestoBase = 0.05;
    }

    public double getImpuestoBase() {
        return impuestoBase;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public TipoBebidaAzucarada getTipoBebidaAzucarada() {
        return tipoBebidaAzucarada;
    }

    /**
     * Calcula el impuesto específico de la bebida azucarada.
     *
     * Si el porcentaje de azúcar es mayor a 0.35, se aplica un impuesto fijo del
     * 0.25.
     * En caso contrario, el impuesto es 0.
     *
     * @return El impuesto específico calculado para la bebida azucarada.
     */
    public double calcularImpuesto() {
        double impuesto;
        if (porcentajeAzucar > 0.35) {
            impuesto = 0.25;
        } else {
            impuesto = 0;
        }
        return impuesto;
    }

}
