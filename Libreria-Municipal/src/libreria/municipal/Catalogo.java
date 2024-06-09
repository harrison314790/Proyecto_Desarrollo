/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
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
        libros.add(new Libro("1", "Libro 1", "Pendiente", "Ficción", "Autor 1", 2020));
        libros.add(new Libro("2", "Libro 2", "Prestado", "No Ficción", "Autor 2", 2018));
        libros.add(new Libro("3", "Libro 3", "Pendiente", "Ciencia", "Autor 3", 2021));
        libros.add(new Libro("4", "Libro 4", "Prestado", "Historia", "Autor 4", 2019));
        libros.add(new Libro("5", "Libro 5", "Pendiente", "Historia", "Autor 4", 2019));
        libros.add(new Libro("6", "Libro 6", "Pendiente", "Historia", "Autor 4", 2019));
        libros.add(new Libro("7", "Libro 7", "Disponible", "Historia", "Autor 4", 2019));
        
        Usuario usuario1 = new Usuario("Usuario Uno", "usuario1@example.com", "password1");
        Usuario usuario2 = new Usuario("Usuario Dos", "usuario2@example.com", "password2");
        Usuario usuario3 = new Usuario("Usuario 3", "usuario2@example.com", "password2");
        Usuario usuario4 = new Usuario("Usuario 4", "usuario2@example.com", "password2");
        Usuario usuario5 = new Usuario("Usuario 5", "usuario2@example.com", "password2");

        // Inicializar algunos préstamos (puedes agregar más préstamos aquí)
        prestamos.add(new Prestamo(usuario1, "1", null, null, "Pendiente"));
        prestamos.add(new Prestamo(usuario2, "2", LocalDate.of(2023, 1, 1), null, "Prestado")) ;
        prestamos.add(new Prestamo(usuario1, "3", null, null, "Pendiente"));
        prestamos.add(new Prestamo(usuario3, "4", LocalDate.of(2024, 06, 8), LocalDate.of(2024, 06, 8), "Prestado")) ;
        prestamos.add(new Prestamo(usuario4, "5", null, null, "Pendiente"));
        prestamos.add(new Prestamo(usuario5, "6", null, null, "Pendiente"));
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

    public void solicitarPrestamo(Usuario usuario, String codigoLibro) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoLibro) && libro.getEstado().equalsIgnoreCase("Disponible")) {
                Prestamo prestamo = new Prestamo(usuario, codigoLibro, null, null, "Pendiente");
                prestamos.add(prestamo);
                
                break;
            }
        }
    }

    public void devolverLibro(Usuario usuario, String codigoLibro) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigoLibro().equals(codigoLibro) && prestamo.getUsuario().getNombre().equals(usuario.getNombre()) && "Prestado".equalsIgnoreCase(prestamo.getEstado())) {
                prestamo.setFechaDevolucion(LocalDate.now());
                prestamo.setEstado("Devuelto");
                break;
            }
        }

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoLibro)) {
                libro.setEstado("Disponible");
                break;
            }
        }
    }

    public void agregarLibro(Libro nuevoLibro) {
        libros.add(nuevoLibro);
    }

    public boolean eliminarLibro(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                libros.remove(libro);
                return true;
            }
        }
        return false;
    }
    
    public boolean actualizarLibro(Libro libroActualizado) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo().equals(libroActualizado.getCodigo())) {
                libros.set(i, libroActualizado);
                return true;
            }
        }
        return false;
    }
    
    public void actualizarCodigoLibro(String codigoSeleccionado, Libro libroActualizado) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo().equals(codigoSeleccionado)) {
                libros.set(i, libroActualizado);
                break;
            }
        }
    }
    
    public void actualizarCodigoLibroVacio(String codigoViejo, String codigoNuevo, String titulo, String estado, String categoria, String autor, Integer anio) {
        Libro libro = buscarLibroPorCodigo(codigoViejo);
        if (libro != null) {
            if (codigoNuevo != null) libro.setCodigo(codigoNuevo);
            if (titulo != null) libro.setTitulo(titulo);
            if (estado != null) libro.setEstado(estado);
            if (categoria != null) libro.setCategoria(categoria);
            if (autor != null) libro.setAutor(autor);
            if (anio != null) libro.setAnio(anio);
        }
    }
    
    public Libro buscarLibroPorCodigo(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null; // Retorna null si no se encuentra el libro con el código dado
    }
    
    public boolean existeCodigo(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
}

