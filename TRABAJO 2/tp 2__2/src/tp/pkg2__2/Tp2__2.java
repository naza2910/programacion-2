/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__2;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp2__2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();
            
            System.out.print("Ingrese el tercer número: ");
            int num3 = sc.nextInt();
            
            int mayor = num1;
            
            if (num2 > mayor) {
                mayor = num2;
            }
            if (num3 > mayor) {
                mayor = num3;
            }
            
            System.out.println("El mayor es: " + mayor);
        }
    }
    
}
