/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

/*
 * Representa un préstamo de un libro a un usuario en la biblioteca municipal.
 */
public class Prestamo {
    private Usuario usuario;
    private String codigoLibro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private String estado;

    /*
     * Constructor para inicializar un nuevo préstamo.
     *
     * @param usuario       El usuario que realiza el préstamo.
     * @param codigoLibro   El código del libro prestado.
     * @param fechaPrestamo La fecha en que se realiza el préstamo.
     * @param fechaDevolucion La fecha esperada de devolución del libro.
     * @param estado        El estado actual del préstamo (activo, devuelto, etc.).
     */
    public Prestamo(Usuario usuario, String codigoLibro, LocalDate fechaPrestamo, LocalDate fechaDevolucion, String estado) {
        this.usuario = usuario;
        this.codigoLibro = codigoLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }

    // Getters  
    /*
     * Obtiene una instancia de Prestamo desde un ResultSet de una consulta a la base de datos.
     *
     * @param rs El ResultSet que contiene los datos del préstamo.
     * @return Una instancia de Prestamo creada a partir de los datos en el ResultSet.
     *         Si ocurre un error durante la recuperación de datos, retorna null.
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /*
     * Obtiene la fecha esperada de devolución del libro.
     *
     * @return La fecha de devolución esperada.
     */
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    /*
     * Obtiene el estado actual del préstamo.
     *
     * @return El estado del préstamo (activo, devuelto, etc.).
     */
    public String getEstado() {
        return estado;
    }

    /*
     * Obtiene el usuario que realizó el préstamo.
     *
     * @return El usuario del préstamo.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /*
     * Obtiene el código del libro prestado.
     *
     * @return El código del libro.
     */
    public String getCodigoLibro() {
        return codigoLibro;
    }

    // Setters
    /*
     * Establece el usuario que realiza el préstamo.
     *
     * @param usuario El nuevo usuario del préstamo.
     */
    public void setNombreUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /*
     * Establece el código del libro prestado.
     *
     * @param codigoLibro El nuevo código del libro.
     */
    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    /*
     * Establece la fecha esperada de devolución del libro.
     *
     * @param fechaDevolucion La nueva fecha de devolución esperada.
     */
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /*
     * Establece el estado actual del préstamo.
     *
     * @param estado El nuevo estado del préstamo.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /*
     * Establece la fecha en que se realizó el préstamo.
     *
     * @param fechaPrestamo La nueva fecha de préstamo.
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    // Método auxiliar para crear una instancia de Prestamo desde una fila de la base de datos
    public static Prestamo fromResultSet(ResultSet rs) {
        try {
            Usuario usuario = Usuario.buscarUsuarioPorDni(rs.getString("dni_usuario"));
            String codigoLibro = rs.getString("codigo_libro");
            LocalDate fechaPrestamo = rs.getDate("fecha_prestamo") != null ? rs.getDate("fecha_prestamo").toLocalDate() : null;
            LocalDate fechaDevolucion = rs.getDate("fecha_devolucion") != null ? rs.getDate("fecha_devolucion").toLocalDate() : null;
            String estado = rs.getString("estado");
            return new Prestamo(usuario, codigoLibro, fechaPrestamo, fechaDevolucion, estado);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

