/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg1__8;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp1__8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            
            double resultado = num1 / num2;
            System.out.println("Resultado de la división: " + resultado);
        }
    }
    
}
