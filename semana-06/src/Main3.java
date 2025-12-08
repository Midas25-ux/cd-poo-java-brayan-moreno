import java.time.LocalDate;

public class Main3 {
  public static void main(String[] args) {
    Empleado[] empleados = {
        new EmpleadoPlanta("Ana", "E001", 2000000, 5),
        new EmpleadoContrato("Luis", "E002", 1500000, LocalDate.of(2026, 12, 31))
    };

    for (Empleado emp : empleados) {
      emp.mostrarInfo();
      System.out.println("Salario: $" + emp.calcularSalario());
      System.out.println("---");
    }

    Pagable pagable = new EmpleadoPlanta("María", "E003", 2500000, 10);
    pagable.procesarPago();

    Reportable reportable = (Reportable) pagable;
    reportable.generarReporte();
  }
}
