
package app;


public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private String genero;
    private int numeroCopias;
    private boolean disponibilidad;

    public Libro(String titulo, String autor, String ISBN, String genero, int numeroCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.genero = genero;
        this.numeroCopias = numeroCopias;
        this.disponibilidad = numeroCopias > 0;
    }

    // Getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
        this.disponibilidad = numeroCopias > 0;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }
}
