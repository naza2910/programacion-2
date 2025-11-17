/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_3;

public class Curso {
    private final String codigo;
    private String nombre;
    private Profesor profesor; // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Profesor getProfesor() { return profesor; }

    // Mantiene la asociación bidireccional
    public void setProfesor(Profesor nuevo) {
        if (this.profesor == nuevo) return;

        Profesor anterior = this.profesor;
        this.profesor = null;
        if (anterior != null) {
            anterior.removeCursoDesdeCurso(this);
        }

        this.profesor = nuevo;
        if (nuevo != null) {
            nuevo.addCursoDesdeCurso(this);
        }
    }

    public void mostrarInfo() {
        String prof = (profesor == null) ? "(sin profesor)" : profesor.getNombre();
        System.out.printf("Curso [%s] %s | Profesor: %s%n", codigo, nombre, prof);
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }

    private static class Profesor {

        public Profesor() {
        }

        private void removeCursoDesdeCurso(Curso aThis) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void addCursoDesdeCurso(Curso aThis) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getNombre() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

