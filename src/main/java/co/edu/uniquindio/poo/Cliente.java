/**
 * Clase abstracta que representa a un Cliente
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public abstract class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;

    public Cliente(String cedula, String nombre, String apellido, String email) {
        ASSERTION.assertion(cedula != null && !cedula.isBlank(), "La cedula es requerida");
        ASSERTION.assertion(nombre != null && !nombre.isBlank(), "El nombre es requerido");
        ASSERTION.assertion(apellido != null && !apellido.isBlank(), "El apellido es requerido");
        ASSERTION.assertion(email != null && !email.isBlank(), "El email es requerido");

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Método abstracto para calcular el descuento aplicable al cliente.
     * Debe ser implementado por las clases hijas.
     *
     * @return El descuento calculado para el cliente.
     */
    public abstract double calcularDescuento();

}
