/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;

    public Usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    // Métodos
    public void registrarUsuario() {
        // Implementación
    }

    public void solicitudPrestamo() {
        // Implementación
    }

    public void devolverLibro() {
        // Implementación
    }

    public void consultarCatalogo() {
        // Implementación
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }
}

