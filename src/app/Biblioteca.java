/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Libro> catalogo = new ArrayList<>();
    private List<Prestamo> prestamos = new ArrayList<>();

    // Métodos para manejar usuarios
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // Métodos para manejar libros
    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public List<Libro> getCatalogo() {
        return catalogo;
    }

    // Métodos para manejar préstamos
    public void registrarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
}
