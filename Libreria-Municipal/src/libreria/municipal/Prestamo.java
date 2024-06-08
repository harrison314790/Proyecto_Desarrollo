/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

import java.time.LocalDate;
import java.util.Date;
/**
 *
 * @author USUARIO
 */

public class Prestamo {
    private Usuario usuario;
    private int codigoLibro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private String estado;
    

    public Prestamo(Usuario usuario, int codigoLibro, LocalDate fechaPrestamo, LocalDate fechaDevolucion, String estado) {
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

    public int getCodigoLibro() {
        return codigoLibro;
    }
    
    public void setNombreUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }
    
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
    this.fechaDevolucion = fechaDevolucion;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos
    public void registrarPrestamo() {
        // Implementación
    }

    public void registrarDevolucion() {
        // Implementación
    }

}

