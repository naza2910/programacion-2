/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg1__4;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp1__4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primero numero: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo numero: ");
            int num2 = scanner.nextInt();
            
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            double division = (double) num1 / num2;
            
            System.out.print("Suma: " + suma);
            System.out.print(" Resta: " + resta);
            System.out.print(" Multiplicacion: " + multiplicacion);
            System.out.print(" Division: " + division);
        }

    }
    
}
