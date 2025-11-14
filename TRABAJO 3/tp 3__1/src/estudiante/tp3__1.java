/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author pinip
 */
public class tp3__1 {
    public static void main(String[] args) {
        // Crear un "registro" (objeto) de tipo Estudiante
        Estudiante est1 = new Estudiante("Nazareno", "Romero", "Programación I", 8.0);

        // Mostrar información del estudiante
        est1.mostrarInfo();

        // Subir la calificación
        est1.subirCalificacion(1.0);
        est1.mostrarInfo();

        // Bajar la calificación
        est1.bajarCalificacion(0.5);
        est1.mostrarInfo();
    }
}
