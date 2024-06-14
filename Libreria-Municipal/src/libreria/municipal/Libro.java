/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.municipal;

/*
 * Representa un libro con atributos como código, título, estado, categoría, autor y año de lanzamiento.
 */
public class Libro {
    
    // Atributos de la clase Libro
    private String codigo;
    private String titulo;
    private String estado;
    private String categoria;
    private String autor;
    private int anoLanzamiento;

    /*
     * Constructor de la clase Libro.
     * @param codigo Código único del libro.
     * @param titulo Título del libro.
     * @param estado Estado actual del libro (por ejemplo, disponible, prestado).
     * @param categoria Categoría a la que pertenece el libro.
     * @param autor Autor del libro.
     * @param anoLanzamiento Año de lanzamiento del libro.
     */
    public Libro(String codigo, String titulo, String estado, String categoria, String autor, int anoLanzamiento) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.categoria = categoria;
        this.autor = autor;
        this.anoLanzamiento = anoLanzamiento;
    }

    /*
     * Obtiene el código del libro.
     * @return Código del libro.
     */
    public String getCodigo() {
        return codigo;
    }

    /*
     * Obtiene el título del libro.
     * @return Título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /*
     * Obtiene el estado actual del libro.
     * @return Estado actual del libro.
     */
    public String getEstado() {
        return estado;
    }

    /*
     * Obtiene la categoría a la que pertenece el libro.
     * @return Categoría del libro.
     */
    public String getCategoria() {
        return categoria;
    }

    /*
     * Obtiene el autor del libro.
     * @return Autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /*
     * Obtiene el año de lanzamiento del libro.
     * @return Año de lanzamiento del libro.
     */
    public int getAnoLanzamiento() {
        return anoLanzamiento;
    } 

    /*
     * Establece el estado del libro.
     * @param estado Nuevo estado del libro.
     */
    void setEstado(String estado) {
        this.estado = estado;
    }

    /*
     * Establece el código del libro.
     * @param codigo Nuevo código del libro.
     */
    void setCodigo(String codigo) {
        this.codigo = codigo;    
    }

    /*
     * Establece el título del libro.
     * @param titulo Nuevo título del libro.
     */
    void setTitulo(String titulo) {
        this.titulo = titulo;    
    }

    /*
     * Establece la categoría del libro.
     * @param categoria Nueva categoría del libro.
     */
    void setCategoria(String categoria) {   
        this.categoria = categoria;    
    }

    /*
     * Establece el autor del libro.
     * @param autor Nuevo autor del libro.
     */
    void setAutor(String autor) {
        this.autor = autor;    
    }

    /*
     * Establece el año de lanzamiento del libro.
     * @param anoLanzamiento Nuevo año de lanzamiento del libro.
     */
    void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;    
    }
}
