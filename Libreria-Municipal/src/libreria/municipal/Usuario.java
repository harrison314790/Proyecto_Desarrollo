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
 * Clase Usuario que representa a un usuario en el sistema.
 * Proporciona métodos para registrar, buscar y validar usuarios.
 */
public class Usuario {

    private String dni;
    private String nombre;
    private String correo;
    private String contraseña;
    private static List<Usuario> usuariosRegistrados = new ArrayList<>();

    static {
        // No añadimos administradores predeterminados aquí, se cargan desde la base de datos
    }

    /*
     * Constructor de la clase Usuario.
     *
     * @param dni        El DNI del usuario.
     * @param nombre     El nombre del usuario.
     * @param correo     El correo electrónico del usuario.
     * @param contraseña La contraseña del usuario.
     */
    public Usuario(String dni, String nombre, String correo, String contraseña) {
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    /*
     * Registra un nuevo usuario en la base de datos.
     *
     * @param dni        El DNI del usuario.
     * @param nombre     El nombre del usuario.
     * @param correo     El correo electrónico del usuario.
     * @param contraseña La contraseña del usuario.
     * @return true si el usuario se registra correctamente, false si el usuario, correo o DNI ya están registrados.
     */
    public static boolean registrarUsuario(String dni, String nombre, String correo, String contraseña) {
        if (buscarUsuarioPorNombre(nombre) != null || buscarUsuarioPorCorreo(correo) != null || buscarUsuarioPorDni(dni) != null) {
            return false; // Usuario, correo o DNI ya registrados
        }
        try (Connection con = new CConexion().conectar()) {
            String sql = "INSERT INTO usuarios (dni, nombre, correo, contraseña) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, dni);
                ps.setString(2, nombre);
                ps.setString(3, correo);
                ps.setString(4, contraseña);
                ps.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /*
     * Busca un usuario por su correo electrónico en la base de datos.
     *
     * @param correo El correo electrónico del usuario a buscar.
     * @return Un objeto Usuario si se encuentra un usuario con el correo especificado, de lo contrario, retorna null.
     */
    public static Usuario buscarUsuarioPorCorreo(String correo) {
        try (Connection con = new CConexion().conectar()) {
            String sql = "SELECT * FROM usuarios WHERE correo = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, correo);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        return new Usuario(rs.getString("dni"), rs.getString("nombre"), rs.getString("correo"), rs.getString("contraseña"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
     * Busca un usuario por su DNI en la base de datos.
     *
     * @param dni El DNI del usuario a buscar.
     * @return Un objeto Usuario si se encuentra un usuario con el DNI especificado, de lo contrario, retorna null.
     */
    public static Usuario buscarUsuarioPorDni(String dni) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuarios WHERE dni = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, dni);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    usuario = new Usuario(
                            rs.getString("dni"),
                            rs.getString("nombre"),
                            rs.getString("correo"),
                            rs.getString("contraseña")
                           
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    /*
     * Valida un usuario basado en su nombre y contraseña.
     * Compara la contraseña proporcionada con el hash almacenado en la base de datos.
     *
     * @param nombre      El nombre del usuario.
     * @param contraseña  La contraseña proporcionada para validar.
     * @return Un objeto Usuario si las credenciales son correctas, de lo contrario, retorna null.
     */
    public static Usuario validarUsuario(String nombre, String contraseña) {
        Usuario usuario = buscarUsuarioPorNombre(nombre);
        if (usuario != null && BCrypt.checkpw(contraseña, usuario.getContraseña())) {
            return usuario;
        }
        return null;
    }

     /*
     * Obtiene una lista de todos los usuarios registrados en la base de datos.
     *
     * @return Una lista de objetos Usuario.
     */
    public static List<Usuario> getUsuariosRegistrados() {
        List<Usuario> usuarios = new ArrayList<>();
        try (Connection con = new CConexion().conectar()) {
            String sql = "SELECT * FROM usuarios";
            try (PreparedStatement ps = con.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    usuarios.add(new Usuario(rs.getString("dni"), rs.getString("nombre"), rs.getString("correo"), rs.getString("contraseña")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
    
    /*
     * Busca un usuario por su nombre en la base de datos.
     *
     * @param nombre El nombre del usuario a buscar.
     * @return Un objeto Usuario si se encuentra un usuario con el nombre especificado, de lo contrario, retorna null.
     */
    public static Usuario buscarUsuarioPorNombre(String nombre) {
        String sql = "SELECT * FROM usuarios WHERE nombre = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new Usuario(
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
}

