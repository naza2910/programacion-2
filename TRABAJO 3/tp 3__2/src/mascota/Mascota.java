/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascota;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre
                + " | Especie: " + especie
                + " | Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
    }
}
