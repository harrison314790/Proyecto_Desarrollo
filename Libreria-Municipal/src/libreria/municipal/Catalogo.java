/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USUARIO
 */
public class Catalogo {
    
    private List<Libro> libros;
    private List<Prestamo> prestamos;

    public Catalogo() {
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
        // Añadir libros de ejemplo
        libros.add(new Libro(1, "Libro 1", "Disponible", "Ficción", "Autor 1", 2020));
        libros.add(new Libro(2, "Libro 2", "Prestado", "No Ficción", "Autor 2", 2018));
        libros.add(new Libro(3, "Libro 3", "Disponible", "Ciencia", "Autor 3", 2021));
        libros.add(new Libro(4, "Libro 4", "Prestado", "Historia", "Autor 4", 2019));
        libros.add(new Libro(5, "Libro 5", "disponible", "Historia", "Autor 4", 2019));
        libros.add(new Libro(6, "Libro 6", "disponible", "Historia", "Autor 4", 2019));
        libros.add(new Libro(7, "Libro 7", "disponible", "Historia", "Autor 4", 2019));
        // Añadir más libros según sea necesario
    }

    public List<Libro> getLibros() {
        return libros;
    }
    
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
    

    public List<Libro> buscarPorCategoria(String categoria) {
        if (categoria.equals("Todas")) {
            return libros;
        }
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
        public Set<String> obtenerCategorias() {
        Set<String> categorias = new HashSet<>();
        for (Libro libro : libros) {
            categorias.add(libro.getCategoria());
        }
        return categorias;
    }
    public void solicitarPrestamo(Usuario usuario, int codigoLibro) {
        for (Libro libro : libros) {
            if (libro.getCodigo() == codigoLibro && libro.getEstado().equalsIgnoreCase("Disponible")) {
                Prestamo prestamo = new Prestamo(usuario, codigoLibro, new Date(), null, "Prestado");
                prestamos.add(prestamo);
                libro.setEstado("Prestado");
                break;
            }
        }
    }

    
}
