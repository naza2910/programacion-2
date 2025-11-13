/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__3;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp2__3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();
            
            if (edad < 12) {
                System.out.println("Eres un Niño.");
            } else if (edad <= 17) {
                System.out.println("Eres un Adolescente.");
            } else if (edad <= 59) {
                System.out.println("Eres un Adulto.");
            } else {
                System.out.println("Eres un Adulto mayor.");
            }
        }
    }
    
}
