/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__9;

import java.util.Scanner;

public class Tp2__9 {

    // Método que calcula el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona inválida. Se asume costo de envío 0.");
            return 0;
        }
    }

    // Método que calcula el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // Método principal
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = sc.nextDouble();
            
            System.out.print("Ingrese el peso del paquete en kg: ");
            double peso = sc.nextDouble();
            sc.nextLine(); // limpiar buffer
            
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            String zona = sc.nextLine();
            
            double costoEnvio = calcularCostoEnvio(peso, zona);
            double total = calcularTotalCompra(precioProducto, costoEnvio);
            
            System.out.printf("El costo de envío es: %.2f%n", costoEnvio);
            System.out.printf("El total a pagar es: %.2f%n", total);
        }
    }
}
