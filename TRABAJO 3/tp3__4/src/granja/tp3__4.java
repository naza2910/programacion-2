/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author pinip
 */
public class tp3__4 {
    public static void main(String[] args) {
        Gallina g1 = new Gallina(1, 1);
        Gallina g2 = new Gallina(2, 2);

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }                
}
