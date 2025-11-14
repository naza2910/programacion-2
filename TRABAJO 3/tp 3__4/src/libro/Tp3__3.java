/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

public class Tp3__3 {
    public static void main(String[] args) {
        Libro l = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        l.mostrarInfo();

        // Intento inválido
        l.setAnioPublicacion(3000);
        l.mostrarInfo();

        // Corrección
        l.setAnioPublicacion(1950);
        l.mostrarInfo();
    }
}