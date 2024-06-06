/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */

public class ListaPrestamos {
    private List<Prestamo> prestamos;

    public ListaPrestamos() {
        this.prestamos = new ArrayList<>();
    }
    
    // Getters
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    // Métodos
    public void listarPrestamos() {
        for (Prestamo prestamo : prestamos) {
            System.out.println("Título: " + prestamo.getCodigoLibro() + ", Usuario: " + prestamo.getUsuario().getNombre());
        }
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    // Getters y Setters
    // ...
}

