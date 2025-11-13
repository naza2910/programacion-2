/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__8;

import java.util.Scanner;

public class Tp2__8 {

    // Calcula: PrecioFinal = PrecioBase + (PrecioBase * Impuesto) - (PrecioBase * Descuento)
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el precio base del producto: ");
            double precioBase = sc.nextDouble();

            System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
            double impuestoPorcentaje = sc.nextDouble() / 100.0;

            System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
            double descuentoPorcentaje = sc.nextDouble() / 100.0;

            double precioFinal = calcularPrecioFinal(precioBase, impuestoPorcentaje, descuentoPorcentaje);

            System.out.printf("El precio final del producto es: %.2f%n", precioFinal);
        }
    }
}
