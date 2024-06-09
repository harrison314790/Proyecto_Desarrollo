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
public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;
    private static List<Usuario> usuariosRegistrados = new ArrayList<>();
    
    static {
        // Añadimos los administradores predeterminados
        usuariosRegistrados.add(new AdminC("cliente", "cliente1@correo.com", "123"));
        usuariosRegistrados.add(new AdminC("kevin", "cliente2@correo.com", "123"));
        usuariosRegistrados.add(new AdminC("carlos", "cliente3@correo.com", "123"));
        usuariosRegistrados.add(new AdminC("stiven", "cliente4@correo.com", "123"));
        usuariosRegistrados.add(new AdminC("harri", "cliente5@correo.com", "123"));
    }

    public Usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
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
    public static boolean registrarUsuario(String nombre, String correo, String contraseña) {
        if (buscarUsuarioPorNombre(nombre) != null || buscarUsuarioPorCorreo(correo) != null) {
            return false; // Usuario o correo ya registrados
        }
        Usuario nuevoUsuario = new Usuario(nombre, correo, contraseña);
        usuariosRegistrados.add(nuevoUsuario);
        return true;
    }
    
    public static Usuario buscarUsuarioPorCorreo(String correo) {
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getCorreo().equalsIgnoreCase(correo)) {
                return usuario;
            }
        }
        return null;
    }
    
    
    public static Usuario buscarUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                return usuario;
            }
        }
        return null;
    }
    
    public static Usuario validarUsuario(String nombre, String contraseña) {
        Usuario usuario = buscarUsuarioPorNombre(nombre);
        if (usuario != null && usuario.getContraseña().equals(contraseña)) {
            return usuario;
        }
        return null;
    }
    
    public static List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

}

