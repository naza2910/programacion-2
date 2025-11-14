package empresa;

public final class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributos estáticos
    private static int totalEmpleados = 0;   // contador global
    private static int secuenciaId = 1;      // para IDs automáticos
    private static final double SALARIO_POR_DEFECTO = 100000.0;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        setSalario(salario); // validación
        totalEmpleados++;
        if (id >= secuenciaId) secuenciaId = id + 1;
    }

    // Constructor con nombre y puesto (ID automático y salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = secuenciaId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_POR_DEFECTO;
        totalEmpleados++;
    }

    // Sobrecarga: actualizar salario por porcentaje (double)…
    public void actualizarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100.0);
    }
    // …y por cantidad fija (int)
    public void actualizarSalario(int cantidadFija) {
        salario += cantidadFija;
    }

    // toString
    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', puesto='" + puesto
                + "', salario=" + String.format("%.2f", salario) + "}";
    }

    // Método estático: debe devolver int
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters/Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public void setSalario(double salario) {
        if (salario < 0) throw new IllegalArgumentException("El salario no puede ser negativo");
        this.salario = salario;
    }
}