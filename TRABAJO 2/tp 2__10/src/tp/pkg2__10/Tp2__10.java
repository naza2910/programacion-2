/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__10;

import java.util.Scanner;

public class Tp2__10 {

    // Método que calcula el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el stock actual del producto: ");
            int stockActual = sc.nextInt();
            
            System.out.print("Ingrese la cantidad vendida: ");
            int cantidadVendida = sc.nextInt();
            
            System.out.print("Ingrese la cantidad recibida: ");
            int cantidadRecibida = sc.nextInt();
            
            int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
            
            System.out.println("El nuevo stock del producto es: " + nuevoStock);
        }
    }
}
