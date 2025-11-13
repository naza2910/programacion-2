/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__5;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp2__5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;
            int suma = 0;
            
            while (true) {
                System.out.print("Ingrese un número (0 para terminar): ");
                numero = sc.nextInt();
                
                if (numero == 0) {
                    break;
                }
                
                if (numero % 2 == 0) {
                    suma += numero;
                }
            }
            
            System.out.println("La suma de los números pares es: " + suma);
        }
    }
    
}
