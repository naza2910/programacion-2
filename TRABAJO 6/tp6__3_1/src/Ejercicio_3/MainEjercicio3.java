/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

import java.util.HashMap;
import java.util.Map;

public class MainEjercicio3 {
    public static void run() {
        System.out.println("===== EJERCICIO 3: Universidad, Profesor y Curso =====");

        Profesor p1 = new Profesor("P01", "Ana López", "Bases de Datos");
        Profesor p2 = new Profesor("P02", "Carlos Pérez", "Programación");
        Profesor p3 = new Profesor("P03", "María Gómez", "Redes");

        Curso c1 = new Curso("BD101", "Introducción a BD");
        Curso c2 = new Curso("PR201", "Programación II");
        Curso c3 = new Curso("PR301", "Estructuras de Datos");
        Curso c4 = new Curso("RD110", "Redes I");
        Curso c5 = new Curso("PR205", "POO");

        Universidad uni = new Universidad("Universidad Nacional");
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("BD101", "P01");
        uni.asignarProfesorACurso("PR201", "P02");
        uni.asignarProfesorACurso("PR301", "P02");
        uni.asignarProfesorACurso("RD110", "P03");
        uni.asignarProfesorACurso("PR205", "P02");

        System.out.println("\n-- Cursos:");
        uni.listarCursos();
        System.out.println("\n-- Profesores:");
        uni.listarProfesores();

        System.out.println("\n-- Reasignar curso PR205 de P02 a P03");
        uni.asignarProfesorACurso("PR205", "P03");
        System.out.println("Cursos de Carlos (P02):");
        p2.listarCursos();
        System.out.println("Cursos de María (P03):");
        p3.listarCursos();
        System.out.println("Detalle del curso PR205:");
        uni.buscarCursoPorCodigo("PR205").ifPresent(Curso::mostrarInfo);

        System.out.println("\n-- Eliminar curso PR201");
        uni.eliminarCurso("PR201");
        System.out.println("Cursos de Carlos (P02) tras eliminar PR201:");
        p2.listarCursos();

        System.out.println("\n-- Eliminar profesor P03 (María)");
        uni.eliminarProfesor("P03");
        System.out.println("Cursos tras eliminar P03:");
        uni.listarCursos();

        System.out.println("\n-- Reporte: cantidad de cursos por profesor");
        Map<String, Integer> reporte = new HashMap<>();
        for (Profesor p : uni.getProfesores()) {
            reporte.put(p.getNombre(), p.getCursos().size());
        }
        if (reporte.isEmpty()) {
            System.out.println("(sin profesores)");
        } else {
            reporte.forEach((nombre, cant) ->
                    System.out.println("  * " + nombre + ": " + cant + " curso(s)")
            );
        }
    }
}
