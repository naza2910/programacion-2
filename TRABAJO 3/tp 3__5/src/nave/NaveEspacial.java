/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nave;

public class NaveEspacial {
    String nombre;
    int combustible;
    int capacidadMax = 100;
    boolean enVuelo = false;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial < 0) combustibleInicial = 0;
        this.combustible = Math.min(combustibleInicial, capacidadMax);
    }

    public void despegar() {
        if (combustible > 0) {
            enVuelo = true;
            System.out.println(nombre + " ha despegado");
        } else {
            System.out.println("No hay combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia; // 1:1
        if (consumo <= 0) {
            System.out.println("Distancia inválida.");
            return;
        }
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida de recarga.");
            return;
        }
        combustible = Math.min(combustible + cantidad, capacidadMax);
        System.out.println(nombre + " recargó. Nivel actual: " + combustible + "/" + capacidadMax);
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre
                + " | Combustible: " + combustible + "/" + capacidadMax
                + " | En vuelo: " + (enVuelo ? "Sí" : "No"));
    }
}
