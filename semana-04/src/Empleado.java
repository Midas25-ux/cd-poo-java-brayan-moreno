public class Empleado {
  // Atributos protegidos (accesibles en subclases)
  protected String nombre;
  protected String identificacion;
  protected double salarioBase;

  // Constructor completo
  public Empleado(String nombre, String identificacion, double salarioBase) {
    this.nombre = nombre;
    this.identificacion = identificacion;
    this.salarioBase = salarioBase;
  }

  // Métodos heredables
  public void mostrarInfo() {
    System.out.println("Empleado: " + nombre);
    System.out.println("ID: " + identificacion);
  }

  public double calcularSalario() {
    return salarioBase;
  }
}
