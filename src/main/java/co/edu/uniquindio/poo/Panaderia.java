/**
 * Clase que representa un producto de Panadería. Esta clase extiende la clase Producto
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

public class Panaderia extends Producto {
    private final boolean conservante;

    public Panaderia(int valor, String nombre, boolean conservante) {
        super(valor, nombre);
        this.conservante = conservante;
    }

    /**
     * Verifica si el producto de panadería tiene conservantes.
     *
     * @return `true` si el producto tiene conservantes, `false` en caso contrario.
     */
    public boolean isConservante() {
        return conservante;
    }

    /**
     * Calcula el impuesto aplicable al producto de panadería.
     *
     * El impuesto se aplica solo si el producto contiene conservantes.
     *
     * @return El impuesto calculado para el producto de panadería.
     */
    public double calcularImpuesto() {
        double impuesto;
        if (conservante) {
            impuesto = 0.18;
            return impuesto;
        } else {
            impuesto = 0;
            return impuesto;
        }
    }

}
