/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__6;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp2__6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int positivos = 0;
            int negativos = 0;
            int ceros = 0;
            
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                int num = sc.nextInt();
                
                if (num > 0) {
                    positivos++;
                } else if (num < 0) {
                    negativos++;
                } else {
                    ceros++;
                }
            }
            
            System.out.println("Resultados:");
            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
            System.out.println("Ceros: " + ceros);
        }
    }
    
}
