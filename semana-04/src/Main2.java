import java.time.LocalDate;
import com.recursoshumanos.modelo.Empleado;
import com.recursoshumanos.modelo.EmpleadoContrato;
import com.recursoshumanos.modelo.EmpleadoPlanta;


public class Main2 {
  public static void main(String[] args) {
    // Array polimórfico de tipo Empleado
    Empleado[] empleados = new Empleado[3];

    empleados[0] = new EmpleadoPlanta("Ana", "E001", 2000000, 5);
    empleados[1] = new EmpleadoContrato("Luis", "E002", 1500000, LocalDate.of(2026, 12, 31));
    empleados[2] = new EmpleadoPlanta("María", "E003", 2500000, 3);

    // Polimorfismo en acción
    for (Empleado emp : empleados) {
      emp.mostrarInfo(); // método sobrescrito en cada subclase
      System.out.println("Salario: $" + emp.calcularSalario()); // dynamic binding
      System.out.println("---");
    }
  }
}

