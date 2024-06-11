/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author USUARIO
 */
public class Catalogo {
    
    private List<Libro> libros;
    private List<Prestamo> prestamos;
    private List<Usuario> usuariosRegistrados;

    public Catalogo() {
    }

    public List<Libro> getLibros() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libros";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                libros.add(new Libro(
                        rs.getString("codigo"),
                        rs.getString("titulo"),
                        rs.getString("estado"),
                        rs.getString("categoria"),
                        rs.getString("autor"),
                        rs.getInt("ano_lanzamiento")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }
    
    public List<Prestamo> getPrestamos(String dniUsuario) {
        List<Prestamo> prestamos = new ArrayList<>();
        String sql = "SELECT * FROM prestamos WHERE dni_usuario = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, dniUsuario);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    prestamos.add(new Prestamo(
                            Usuario.buscarUsuarioPorDni(rs.getString("dni_usuario")),
                            rs.getString("codigo_libro"),
                            rs.getDate("fecha_prestamo").toLocalDate(),
                            rs.getDate("fecha_devolucion") != null ? rs.getDate("fecha_devolucion").toLocalDate() : null,
                            rs.getString("estado")
                    ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prestamos;
    }
    

    public List<Libro> buscarPorCategoria(String categoria) {
        List<Libro> resultado = new ArrayList<>();
        String sql = "SELECT * FROM libros WHERE categoria = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, categoria);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                resultado.add(new Libro(
                        rs.getString("codigo"),
                        rs.getString("titulo"),
                        rs.getString("estado"),
                        rs.getString("categoria"),
                        rs.getString("autor"),
                        rs.getInt("ano_lanzamiento")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public Set<String> obtenerCategorias() {
        Set<String> categorias = new HashSet<>();
        String sql = "SELECT DISTINCT categoria FROM libros";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                categorias.add(rs.getString("categoria"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categorias;
    }

    public void solicitarPrestamo(Usuario usuario, String codigoLibro) {
        String sql = "INSERT INTO prestamos (dni_usuario, codigo_libro, fecha_prestamo, estado) VALUES (?, ?, ?, ?)";
        String updateSql = "UPDATE libros SET estado = 'Pendiente' WHERE codigo = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             PreparedStatement updatePstmt = conn.prepareStatement(updateSql)) {

            pstmt.setString(1, usuario.getDni());
            pstmt.setString(2, codigoLibro);
            pstmt.setDate(3, java.sql.Date.valueOf(LocalDate.now()));
            pstmt.setString(4, "Pendiente");
            pstmt.executeUpdate();

            updatePstmt.setString(1, codigoLibro);
            updatePstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void devolverLibro(Usuario usuario, String codigoLibro) {
        String sql = "UPDATE prestamos SET fecha_devolucion = ?, estado = 'Devuelto' WHERE dni_usuario = ? AND codigo_libro = ? AND estado = 'Prestado'";
        String updateSql = "UPDATE libros SET estado = 'Disponible' WHERE codigo = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             PreparedStatement updatePstmt = conn.prepareStatement(updateSql)) {

            pstmt.setDate(1, java.sql.Date.valueOf(LocalDate.now()));
            pstmt.setString(2, usuario.getDni());
            pstmt.setString(3, codigoLibro);
            pstmt.executeUpdate();

            updatePstmt.setString(1, codigoLibro);
            updatePstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     public void agregarLibro(Libro nuevoLibro) {
        String sql = "INSERT INTO libros (codigo, titulo, estado, categoria, autor, ano_lanzamiento) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nuevoLibro.getCodigo());
            pstmt.setString(2, nuevoLibro.getTitulo());
            pstmt.setString(3, nuevoLibro.getEstado());
            pstmt.setString(4, nuevoLibro.getCategoria());
            pstmt.setString(5, nuevoLibro.getAutor());
            pstmt.setInt(6, nuevoLibro.getAnoLanzamiento());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean eliminarLibro(String codigo) {
        String sql = "DELETE FROM libros WHERE codigo = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, codigo);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean actualizarLibro(Libro libroActualizado) {
        String sql = "UPDATE libros SET titulo = ?, estado = ?, categoria = ?, autor = ?, ano_lanzamiento = ? WHERE codigo = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, libroActualizado.getTitulo());
            pstmt.setString(2, libroActualizado.getEstado());
            pstmt.setString(3, libroActualizado.getCategoria());
            pstmt.setString(4, libroActualizado.getAutor());
            pstmt.setInt(5, libroActualizado.getAnoLanzamiento());
            pstmt.setString(6, libroActualizado.getCodigo());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void actualizarCodigoLibro(String codigoSeleccionado, Libro libroActualizado) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo().equals(codigoSeleccionado)) {
                libros.set(i, libroActualizado);
                break;
            }
        }
    }
    
    public void actualizarCodigoLibroVacio(String codigoViejo, String codigoNuevo, String titulo, String estado, String categoria, String autor, Integer anio) {
        StringBuilder sql = new StringBuilder("UPDATE libros SET ");
        boolean needsComma = false;

        if (codigoNuevo != null) {
            sql.append("codigo = ?");
            needsComma = true;
        }
        if (titulo != null) {
            if (needsComma) sql.append(", ");
            sql.append("titulo = ?");
            needsComma = true;
        }
        if (estado != null) {
            if (needsComma) sql.append(", ");
            sql.append("estado = ?");
            needsComma = true;
        }
        if (categoria != null) {
            if (needsComma) sql.append(", ");
            sql.append("categoria = ?");
            needsComma = true;
        }
        if (autor != null) {
            if (needsComma) sql.append(", ");
            sql.append("autor = ?");
            needsComma = true;
        }
        if (anio != null) {
            if (needsComma) sql.append(", ");
            sql.append("ano_lanzamiento = ?");
        }

        sql.append(" WHERE codigo = ?");

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql.toString())) {

            int index = 1;

            if (codigoNuevo != null) {
                pstmt.setString(index++, codigoNuevo);
            }
            if (titulo != null) {
                pstmt.setString(index++, titulo);
            }
            if (estado != null) {
                pstmt.setString(index++, estado);
            }
            if (categoria != null) {
                pstmt.setString(index++, categoria);
            }
            if (autor != null) {
                pstmt.setString(index++, autor);
            }
            if (anio != null) {
                pstmt.setInt(index++, anio);
            }

            pstmt.setString(index, codigoViejo);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Libro buscarLibroPorCodigo(String codigo) {
        String sql = "SELECT * FROM libros WHERE codigo = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, codigo);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new Libro(
                        rs.getString("codigo"),
                        rs.getString("titulo"),
                        rs.getString("estado"),
                        rs.getString("categoria"),
                        rs.getString("autor"),
                        rs.getInt("anio")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean existeCodigo(String codigo) {
        String sql = "SELECT 1 FROM libros WHERE codigo = ?";

        try (Connection conn = new CConexion().conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, codigo);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
}

