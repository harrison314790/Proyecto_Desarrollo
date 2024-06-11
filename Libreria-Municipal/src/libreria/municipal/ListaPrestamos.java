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

/**
 *
 * @author USUARIO
 */

public class ListaPrestamos {
    private List<Prestamo> prestamos;

    public ListaPrestamos() {
        this.prestamos = new ArrayList<>();
        cargarPrestamosDesdeBD();
    }

    // Getters
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    // Métodos para interactuar con la base de datos

    // Método para cargar préstamos desde la base de datos
    private void cargarPrestamosDesdeBD() {
        String sql = "SELECT * FROM prestamos";
        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                Prestamo prestamo = new Prestamo(
                    Usuario.buscarUsuarioPorDni(rs.getString("dni_usuario")),
                    rs.getString("codigo_libro"),
                    rs.getDate("fecha_prestamo") != null ? rs.getDate("fecha_prestamo").toLocalDate() : null,
                    rs.getDate("fecha_devolucion") != null ? rs.getDate("fecha_devolucion").toLocalDate() : null,
                    rs.getString("estado")
                );
                prestamos.add(prestamo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para agregar un préstamo a la base de datos
    public void agregarPrestamo(Prestamo prestamo) {
        String sql = "INSERT INTO prestamos (dni_usuario, codigo_libro, fecha_prestamo, fecha_devolucion, estado) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, prestamo.getUsuario().getDni());
            pstmt.setString(2, prestamo.getCodigoLibro());
            pstmt.setObject(3, prestamo.getFechaPrestamo());
            pstmt.setObject(4, prestamo.getFechaDevolucion());
            pstmt.setString(5, prestamo.getEstado());
            pstmt.executeUpdate();
            prestamos.add(prestamo); // Agregar a la lista local también
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar un préstamo en la base de datos
    public void actualizarPrestamo(Prestamo prestamo) {
        String sql = "UPDATE prestamos SET fecha_prestamo = ?, fecha_devolucion = ?, estado = ? WHERE dni_usuario = ? AND codigo_libro = ?";
        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setObject(1, prestamo.getFechaPrestamo());
            pstmt.setObject(2, prestamo.getFechaDevolucion());
            pstmt.setString(3, prestamo.getEstado());
            pstmt.setString(4, prestamo.getUsuario().getDni());
            pstmt.setString(5, prestamo.getCodigoLibro());
            pstmt.executeUpdate();
            // Actualizar en la lista local
            for (int i = 0; i < prestamos.size(); i++) {
                if (prestamos.get(i).getUsuario().getDni().equals(prestamo.getUsuario().getDni()) && prestamos.get(i).getCodigoLibro().equals(prestamo.getCodigoLibro())) {
                    prestamos.set(i, prestamo);
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un préstamo de la base de datos
    public void eliminarPrestamo(String dniUsuario, String codigoLibro) {
        String sql = "DELETE FROM prestamos WHERE dni_usuario = ? AND codigo_libro = ?";
        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, dniUsuario);
            pstmt.setString(2, codigoLibro);
            pstmt.executeUpdate();
            // Eliminar de la lista local
            prestamos.removeIf(prestamo -> prestamo.getUsuario().getDni().equals(dniUsuario) && prestamo.getCodigoLibro().equals(codigoLibro));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

