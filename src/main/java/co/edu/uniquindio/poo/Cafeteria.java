/**
 * Clase que agrupa los datos de una Cafeteria
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Cafeteria {
    private final String nombre;
    private final Collection<Factura> listaFacturas;

    public Cafeteria(String nombre) {
        ASSERTION.assertion(nombre != null && !nombre.isBlank(), "El nombre es requerido");

        this.nombre = nombre;
        this.listaFacturas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Factura> getListaFacturas() {
        return Collections.unmodifiableCollection(listaFacturas);
    }

    public void agregarFactura(Factura factura) {
        listaFacturas.add(factura);
    }

}
