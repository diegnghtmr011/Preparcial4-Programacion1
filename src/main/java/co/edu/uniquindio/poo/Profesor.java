/**
 * Clase que representa a un Profesor como cliente. Esta clase extiende la clase Cliente
 * @author Área de programación UQ - Diego Flores
 * @since 2023-11
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

public class Profesor extends Cliente {
    private final Categoria categoria;

    public Profesor(String cedula, String nombre, String apellido, String email, Categoria categoria) {
        super(cedula, nombre, apellido, email);
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Calcula el descuento aplicable al profesor según su categoría.
     *
     * @return El descuento calculado para el profesor.
     */
    public double calcularDescuento() {
        double descuento = 0;
        switch (categoria) {
            case AUXILIAR:
                descuento = 0.03;  
                break;
            case ASISTENTE:
                descuento = 0.05;  
                break;
            case ASOCIADO:
                descuento = 0.10;  
                break;
            case TITULAR:
                descuento = 0.16;  
                break;
            default:
                break;
        }
        return descuento;
    }
    
}
