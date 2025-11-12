/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg1__3;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp1__3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }

    }
    
}
