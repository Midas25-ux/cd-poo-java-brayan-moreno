import java.time.LocalDate;

public class EmpleadoContrato extends Empleado {
  private LocalDate fechaFinContrato;

  public EmpleadoContrato(String nombre, String identificacion, double salarioBase,int aniosContrato) {
    super(nombre, identificacion, salarioBase);
    this.fechaFinContrato = LocalDate.now().plusYears(aniosContrato);
  }

  @Override
  public String obtenerDescripcion() {
    return "Empleado por Contrato: " + nombre + " (hasta " + fechaFinContrato + ")";
  }

  @Override
  public void mostrarInfo() {
    System.out.println("Empleado por Contrato: " + nombre);
    System.out.println("ID: " + identificacion);
    System.out.println("Contrato hasta: " + fechaFinContrato);
    System.out.println("Salario: $" + calcularSalario());
  }
}


