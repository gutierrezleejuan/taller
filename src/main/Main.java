/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import app.Biblioteca;
import app.Libro;
import app.Prestamo;
import app.Usuario;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        while (true) {
            String[] opciones = {"Registrar Usuario", "Agregar Libro", "Registrar Préstamo", "Salir"};
            int eleccion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opción",
                    "Sistema de Gestión de Biblioteca",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (eleccion) {
                case 0:
                    registrarUsuario();
                    break;
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    registrarPrestamo();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }

    private static void registrarUsuario() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del usuario:");
        String tipoUsuario = JOptionPane.showInputDialog("Ingrese el tipo de usuario (lector/bibliotecario):");
        String correoElectronico = JOptionPane.showInputDialog("Ingrese el correo electrónico del usuario:");
        String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña del usuario:");

        Usuario usuario = new Usuario(nombre, identificacion, tipoUsuario, correoElectronico, contrasena);
        biblioteca.registrarUsuario(usuario);
        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente.");
    }

    private static void agregarLibro() {
        String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        String ISBN = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        String genero = JOptionPane.showInputDialog("Ingrese el género del libro:");
        int numeroCopias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de copias del libro:"));

        Libro libro = new Libro(titulo, autor, ISBN, genero, numeroCopias);
        biblioteca.agregarLibro(libro);
        JOptionPane.showMessageDialog(null, "Libro agregado exitosamente.");
    }

    private static void registrarPrestamo() {
        String ISBN = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        String identificacionUsuario = JOptionPane.showInputDialog("Ingrese la identificación del usuario:");
        
        Libro libro = biblioteca.getCatalogo().stream()
            .filter(l -> l.getISBN().equals(ISBN))
            .findFirst()
            .orElse(null);
        
        Usuario usuario = biblioteca.getUsuarios().stream()
            .filter(u -> u.getIdentificacion().equals(identificacionUsuario))
            .findFirst()
            .orElse(null);
        
        if (libro != null && usuario != null) {
            Prestamo prestamo = new Prestamo(libro, usuario, java.time.LocalDate.now());
            biblioteca.registrarPrestamo(prestamo);
            JOptionPane.showMessageDialog(null, "Préstamo registrado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Libro o usuario no encontrado.");
        }
    }
}
