/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.io.*;

public class Fichero {

    public void hacerCopiaDeSeguridad(String origen, String destino) {
        // Implementación para realizar una copia de seguridad del archivo de origen al archivo de destino
    }

    public void restaurarDesdeCopia(String copiaSeguridad, String destino) {
        // Implementación para restaurar la base de datos desde un archivo de copia de seguridad
    }
    
    public void registrarError(String mensaje) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("errores.txt", true))) {
            bw.write(mensaje + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
