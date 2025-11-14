/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

public final class Libro {
    private final String titulo;
    private final String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // validación
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anioPublicacion) {
        int anioActual = java.time.Year.now().getValue();
        if (anioPublicacion < 1 || anioPublicacion > anioActual) {
            System.out.println("Año inválido: " + anioPublicacion);
            // no cambia el valor si es inválido
        } else {
            this.anioPublicacion = anioPublicacion;
        }
    }

    public void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" de " + autor + " (" + anioPublicacion + ")");
    }
}
