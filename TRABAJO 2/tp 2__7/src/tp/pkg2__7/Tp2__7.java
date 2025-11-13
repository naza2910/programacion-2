/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__7;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp2__7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nota;
            
            do {
                System.out.print("Ingrese una nota (0-10): ");
                nota = sc.nextInt();
                
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
                }
                
            } while (nota < 0 || nota > 10);
            
            System.out.println("Nota guardada correctamente.");
        }
    }
    
}
