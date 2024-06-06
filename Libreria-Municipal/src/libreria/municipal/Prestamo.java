/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

import java.util.Date;
/**
 *
 * @author USUARIO
 */

public class Prestamo {
    private Usuario usuario;
    private int codigoLibro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private String estado;
    

    public Prestamo(Usuario usuario, int codigoLibro, Date fechaPrestamo, Date fechaDevolucion, String estado) {
        this.usuario = usuario;
        this.codigoLibro = codigoLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }
    
        // Getters
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
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

    // Métodos
    public void registrarPrestamo() {
        // Implementación
    }

    public void registrarDevolucion() {
        // Implementación
    }

}

