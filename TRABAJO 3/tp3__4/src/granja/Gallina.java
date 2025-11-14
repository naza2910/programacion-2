/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granja;

public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    public Gallina(int idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() { huevosPuestos++; }
    public void envejecer() { edad++; }

    public void mostrarEstado() {
        System.out.println("Gallina #" + idGallina
                + " | Edad: " + edad
                + " | Huevos puestos: " + huevosPuestos);
    }
}