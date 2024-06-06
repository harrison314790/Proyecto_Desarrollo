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
public class AdminC extends Usuario {
    private static List<AdminC> adminsRegistrados = new ArrayList<>();
    static {
        // Añadimos los administradores predeterminados
        adminsRegistrados.add(new AdminC("admin", "admin1@correo.com", "123"));
    }
    
    public AdminC(String nombre, String correo, String contraseña) {
        super(nombre, correo, contraseña);
    }

    // Métodos
     
    public static AdminC buscarAdminPorNombre(String nombre) {
        for (AdminC admin : adminsRegistrados) {
            if (admin.getNombre().equalsIgnoreCase(nombre)) {
                return admin;
            }
        }
        return null;
    }
    
    public static AdminC validarAdmin(String nombre, String contraseña) {
        AdminC admin = buscarAdminPorNombre(nombre);
        if (admin != null && admin.getContraseña().equals(contraseña)) {
            return admin;
        }
        return null;
    }
    public void gestionarUsuarios() {
        // Implementación
    }

    public void actualizarCatalogo() {
        // Implementación
    }

    // Otros métodos específicos de admin
    // ...
}

