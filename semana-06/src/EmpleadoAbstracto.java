package abstractas;

public abstract class EmpleadoAbstracto {
  protected String nombre;
  protected String identificacion;
  protected double salarioBase;

  public EmpleadoAbstracto(String nombre, String identificacion, double salarioBase) {
    this.nombre = nombre;
    this.identificacion = identificacion;
    this.salarioBase = salarioBase;
  }

  // Método abstracto: cada subclase calcula salario diferente
  public abstract double calcularSalario();

  // Método concreto reutilizable
  public void mostrarInfo() {
    System.out.println("Empleado: " + nombre + " | ID: " + identificacion);
  }

  // Getter
  public String getNombre() { return nombre; }
}
