/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__4;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp2__4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el precio del producto: ");
            double precio = sc.nextDouble();
            
            System.out.print("Ingrese la categoría del producto (A, B o C): ");
            char categoria = sc.next().toUpperCase().charAt(0);
            
            double descuento = 0;
            
            switch (categoria) {
                case 'A' -> descuento = 0.10;
                case 'B' -> descuento = 0.15;
                case 'C' -> descuento = 0.20;
                default -> {
                    System.out.println("Categoría inválida.");
                    sc.close();
                    return;
                }
            }
            
            double montoDescuento = precio * descuento;
            double precioFinal = precio - montoDescuento;
            
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Precio final: " + precioFinal);
        }
    }
    
}
