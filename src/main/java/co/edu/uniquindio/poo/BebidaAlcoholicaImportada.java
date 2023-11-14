/**
 * Clase que representa una bebida alcohólica importada. Esta clase extiende la clase BebidaAlcoholica
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

public class BebidaAlcoholicaImportada extends BebidaAlcoholica {

    public BebidaAlcoholicaImportada(int valor, String nombre, double contenidoAlcohol) {
        super(valor, nombre, contenidoAlcohol);
    }

    /**
     * Calcula el impuesto asociado a la bebida alcohólica importada.
     *
     * En el caso de bebidas alcohólicas importadas, el impuesto siempre es cero.
     *
     * @return El impuesto calculado, que es siempre cero para bebidas alcohólicas
     *         importadas.
     */
    public double calcularImpuesto() {
        double impuesto = 0;
        return impuesto;
    }

    /**
     * Calcula el precio final de la bebida alcohólica importada, teniendo en cuenta
     * el impuesto.
     *
     * El precio se calcula multiplicando el valor base por un factor de ajuste,
     * que depende del contenido de alcohol en la bebida.
     *
     * @return El precio final de la bebida alcohólica importada.
     */
    @Override
    public double calcularPrecio() {
        double impuesto = calcularImpuesto();
        double contenidoAlcohol = getContenidoAlcohol() * 100;
        double precio = (getValor() * 1.3) * (0.3 * contenidoAlcohol);
        return precio + precio * impuesto;
    }

}
