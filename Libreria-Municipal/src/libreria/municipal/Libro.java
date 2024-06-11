/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

/**
 *
 * @author USUARIO
 */
public class Libro {
    
    private String codigo;
    private String titulo;
    private String estado;
    private String categoria;
    private String autor;
    private int anoLanzamiento;

    public Libro(String codigo, String titulo, String estado, String categoria, String autor, int anoLanzamiento) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.categoria = categoria;
        this.autor = autor;
        this.anoLanzamiento = anoLanzamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEstado() {
        return estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    } 

    void setEstado(String estado) {
        this.estado = estado;
    }

    void setCodigo(String codigo) {
        this.codigo = codigo;    
    }

    void setTitulo(String titulo) {
        this.titulo = titulo;    
    }

    void setCategoria(String categoria) {   
        this.categoria = categoria;    
    }

    void setAutor(String autor) {
        this.autor = autor;    
    }

    void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;    
    }
}
