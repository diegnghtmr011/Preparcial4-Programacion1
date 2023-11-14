/**
 * Clase que representa una bebida alcohólica nacional. Esta clase extiende la clase BebidaAlcoholica
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

public class BebidaAlcoholicaNacional extends BebidaAlcoholica {

    public BebidaAlcoholicaNacional(int valor, String nombre, double contenidoAlcohol) {
        super(valor, nombre, contenidoAlcohol);
    }

    /**
     * Calcula el impuesto asociado a la bebida alcohólica nacional.
     *
     * El impuesto se calcula en función del contenido de alcohol. Si el contenido
     * de alcohol
     * es mayor a 25 grados, se aplica un impuesto fijo del 0.5. En caso contrario,
     * se calcula
     * un impuesto variable de 0.02 por cada grado de alcohol.
     *
     * @return El impuesto calculado para la bebida alcohólica nacional.
     */
    public double calcularImpuesto() {
        double gradosAlcohol = getContenidoAlcohol() * 100;
        double impuesto = 0;
        if (gradosAlcohol > 25) {
            impuesto = 0.5;
        } else {
            for (int i = 1; i <= gradosAlcohol; i++) {
                impuesto += 0.02;
            }
        }
        return impuesto;
    }

}
