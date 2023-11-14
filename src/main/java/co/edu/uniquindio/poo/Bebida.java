/**
 * Clase abstracta que representa una bebida
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

public abstract class Bebida extends Producto {

    public Bebida(int valor, String nombre) {
        super(valor, nombre);
    }

}
