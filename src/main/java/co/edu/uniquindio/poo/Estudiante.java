/**
 * Clase que representa a un Estudiante como cliente. Esta clase extiende la clase Cliente
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class Estudiante extends Cliente {
    private final int semestre;

    public Estudiante(String cedula, String nombre, String apellido, String email, int semestre) {
        super(cedula, nombre, apellido, email);

        ASSERTION.assertion(semestre > 0, "El semestre debe ser mayor a 0");

        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    /**
     * Calcula el descuento aplicable al estudiante.
     *
     * El descuento se calcula sumando un porcentaje fijo (0.012) por cada semestre
     * que el estudiante haya cursado.
     *
     * @return El descuento calculado para el estudiante.
     */
    public double calcularDescuento() {
        double descuento = 0;
        for (int i = 1; i <= semestre; i++) {
            descuento += 0.012;
        }
        return descuento;
    }

}
