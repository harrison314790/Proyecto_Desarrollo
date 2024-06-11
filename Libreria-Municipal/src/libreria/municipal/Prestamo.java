/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
/**
 *
 * @author USUARIO
 */

public class Prestamo {
    private Usuario usuario;
    private String codigoLibro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private String estado;

    public Prestamo(Usuario usuario, String codigoLibro, LocalDate fechaPrestamo, LocalDate fechaDevolucion, String estado) {
        this.usuario = usuario;
        this.codigoLibro = codigoLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }

    // Getters
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    // Setters
    public void setNombreUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

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

