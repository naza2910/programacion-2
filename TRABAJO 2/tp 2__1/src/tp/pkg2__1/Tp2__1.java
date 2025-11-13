/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2__1;

import java.util.Scanner;

/**
 *
 * @author pinip
 */
public class Tp2__1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un año: ");
            int anio = sc.nextInt();
            
            boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
            
            if (esBisiesto) {
                System.out.println("El año " + anio + " es bisiesto.");
            } else {
                System.out.println("El año " + anio + " no es bisiesto.");
            }
        }
    }
    
}
