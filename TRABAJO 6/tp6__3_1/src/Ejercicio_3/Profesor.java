/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private final String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (!cursos.contains(c)) cursos.add(c);
        if (c.getProfesor() != this) c.setProfesor(this);
    }

    public void eliminarCurso(Curso c) {
        if (c == null) return;
        cursos.remove(c);
        if (c.getProfesor() == this) c.setProfesor(null);
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }
    // uso interno desde Curso.setProfesor

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("    (sin cursos asignados)");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("    - " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.printf("Profesor [%s] %s - %s | Cursos: %d%n",
                id, nombre, especialidad, cursos.size());
    }
}
s