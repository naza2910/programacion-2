/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg1__7;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp1__7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo numero: ");
            int num2 = scanner.nextInt();
            
            int resultado = num1 / num2;
            System.out.println("Resultado de la division: " + resultado);
        }
    }
    
}
