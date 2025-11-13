/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__11;

import java.util.Scanner;

public class Tp2__11 {

    // Variable global (constante)
    static final double DESCUENTO_ESPECIAL = 0.10;

    // Método que calcula y muestra el descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el precio del producto: ");
            double precio = sc.nextDouble();
            
            calcularDescuentoEspecial(precio);
        }
    }
}