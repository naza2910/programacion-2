/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

public class Estudiante {
    // Atributos
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido
                + " | Curso: " + curso
                + " | Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}