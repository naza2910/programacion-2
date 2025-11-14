/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nave;

/**
 *
 * @author pinip
 */
public class tp3__5 {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Odisea", 50);
        nave.mostrarEstado();

        nave.despegar();
        nave.avanzar(60);        // intenta avanzar con combustible justo/insuficiente
        nave.recargarCombustible(40);
        nave.avanzar(60);        // ahora debería poder
        nave.mostrarEstado();
    }
}
