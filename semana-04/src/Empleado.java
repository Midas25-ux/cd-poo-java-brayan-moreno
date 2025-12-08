public class Empleado {
  protected String nombre;
  protected String identificacion;
  protected double salarioBase;

  public Empleado(String nombre, String identificacion, double salarioBase) {
    this.nombre = nombre;
    this.identificacion = identificacion;
    this.salarioBase = salarioBase;
  }

  public double calcularSalario() {
    return salarioBase;
  }

  // ✅ Método base que faltaba
  public String obtenerDescripcion() {
    return "Empleado: " + nombre + " (ID: " + identificacion + ")";
  }

  // ✅ Método que faltaba
  public void mostrarInfo() {
    System.out.println("Empleado: " + nombre);
    System.out.println("ID: " + identificacion);
    System.out.println("Salario base: $" + salarioBase);
  }

  public String getNombre() { return nombre; }
  public String getIdentificacion() { return identificacion; }
  public double getSalarioBase() { return salarioBase; }
}


