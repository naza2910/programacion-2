/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

public class AppEmpleados {
    public static void main(String[] args) {
        System.out.println("=== TP4 - Gestion de Empleados ===");

        // (1) Constructores sobrecargados
        Empleado e1 = new Empleado(100, "Ana Gomez", "Desarrolladora", 350000.0);
        Empleado e2 = new Empleado(101, "Luis Perez", "QA", 280000.0);
        Empleado e3 = new Empleado("Maria Lopez", "UX");
        Empleado e4 = new Empleado("Nicolas Viruel", "DevOps");

        // (2) Sobrecarga de actualizarSalario()
        //  - por porcentaje (double)
        e1.actualizarSalario(10.0);   // +10% -> 385000
        e3.actualizarSalario(5.5);    // +5.5% -> 105500 (si salario por defecto = 100000)

        //  - por cantidad fija (int)
        e2.actualizarSalario(20000);  // +$20.000 -> 300000
        e4.actualizarSalario(15000);  // +$15.000 -> 115000

        // (3) Encapsulamiento: setters/getters
        e3.setPuesto("UX Researcher");
        if (!"UX Researcher".equals(e3.getPuesto())) {
            throw new RuntimeException("Fallo de encapsulamiento en set/get de puesto");
        }

        // Validación del setter de salario (no negativo)
        try {
            e4.setSalario(-1); // debe lanzar excepción
            throw new RuntimeException("Se esperaba excepcion por salario negativo y no ocurrio");
        } catch (IllegalArgumentException ex) {
            System.out.println("Excepcion manejada correctamente: " + ex.getMessage());
        }

        // (4) toString()
        System.out.println("\n-- Estado de empleados (toString) --");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // (5) Estáticos: totalEmpleados y metodo mostrarTotalEmpleados()
        System.out.println("\nTotal de empleados: " + Empleado.mostrarTotalEmpleados());
        
        // Comprobacion minima del total (deberia ser 4)
        if (Empleado.mostrarTotalEmpleados() != 4) {
            throw new RuntimeException("El total de empleados deberia ser 4");
        }
        System.out.println("\n✅ Pasaron las verificaciones basicas OK.");
    }
}
