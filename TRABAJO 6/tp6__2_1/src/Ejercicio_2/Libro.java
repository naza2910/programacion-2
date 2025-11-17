/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

public class Libro {
    private final String isbn;
    private String titulo;
    private int anioPublicacion;
    private final Autor autor; // composición

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }

    public void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" | ISBN: " + isbn +
                " | Año: " + anioPublicacion + " | Autor: " + autor);
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" (" + anioPublicacion + ") - " + autor + " [" + isbn + "]";
    }
}
