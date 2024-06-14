/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/*
 * Clase AdminC que extiende de Usuario.
 * Esta clase representa un administrador y contiene métodos específicos
 * para buscar y validar administradores en la base de datos.
 */
public class AdminC extends Usuario {
    /*
     * Constructor de la clase AdminC.
     *
     * @param dni        El DNI del administrador.
     * @param nombre     El nombre del administrador.
     * @param correo     El correo electrónico del administrador.
     * @param contraseña La contraseña del administrador.
     */
    public AdminC(String dni,String nombre, String correo, String contraseña) {
        super(dni, nombre, correo, contraseña);
    }
    
    
    // Métodos
    /*
     * Busca un administrador por su nombre en la base de datos.
     *
     * @param nombre El nombre del administrador a buscar.
     * @return Un objeto AdminC si se encuentra un administrador con el nombre especificado,
     *         de lo contrario, retorna null.
     */
    public static AdminC buscarAdminPorNombre(String nombre) {
        String sql = "SELECT * FROM usuarios WHERE nombre = ? AND tipo = 'admin'";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new AdminC(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("correo"),
                        rs.getString("contraseña")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /*
     * Valida un administrador basado en su nombre y contraseña.
     * Compara la contraseña proporcionada con el hash almacenado en la base de datos.
     *
     * @param nombre      El nombre del administrador.
     * @param contraseña  La contraseña proporcionada para validar.
     * @return Un objeto AdminC si las credenciales son correctas,
     *         de lo contrario, retorna null.
     */
    public static AdminC validarAdmin(String nombre, String contraseña) {
        String sql = "SELECT * FROM administradores WHERE nombre = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String hashContraseña = rs.getString("contraseña");
                if (BCrypt.checkpw(contraseña, hashContraseña)) {
                    return new AdminC(
                            rs.getString("dni"),
                            rs.getString("nombre"),
                            rs.getString("correo"),
                            hashContraseña
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

