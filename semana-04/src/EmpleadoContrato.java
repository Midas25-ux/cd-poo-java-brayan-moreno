public class EmpleadoContrato extends Empleado {
  private int mesesContrato;

  public EmpleadoContrato(String nombre, String identificacion, double salarioBase, int mesesContrato) {
    super(nombre, identificacion, salarioBase); // Llamada al constructor padre
    this.mesesContrato = mesesContrato;
  }

  @Override
  public double calcularSalario() {
    return salarioBase; // Sin bonos
  }
}
