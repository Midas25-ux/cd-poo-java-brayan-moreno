import abstractas.EmpleadoAbstracto;
import implementaciones.*;
import interfaces.*;

public class Main5 {
  public static void main(String[] args) {
    System.out.println("=== SISTEMA DE TALLER MECÁNICO ===\n");

    // Polimorfismo con clase abstracta
    EmpleadoAbstracto[] empleados = new EmpleadoAbstracto[3];
    empleados[0] = new Mecanico("Juan Pérez", "M001", 1500000, 5);
    empleados[1] = new Administrador("Ana Gómez", "A001", 2000000, 2);
    empleados[2] = new MecanicoSenior("Luis Rodríguez", "MS01", 1800000, 7);

    for (EmpleadoAbstracto emp : empleados) {
      emp.mostrarInfo();
      System.out.println("Salario: $" + emp.calcularSalario());
      System.out.println("---");
    }

    // Demostración de interfaces
    MecanicoSenior senior = (MecanicoSenior) empleados[2];
    System.out.println("\n=== CAPACITACIÓN Y ATENCIÓN AL CLIENTE ===");
    Capacitacion cap = senior;
    cap.realizarCapacitacion("Revisión avanzada de motores");
    System.out.println("Horas de capacitación: " + cap.obtenerHorasCapacitacion());

    AtencionCliente atc = senior;
    atc.atenderCliente("Carlos Martínez");
    atc.registrarReclamo("Reparación incompleta");

    System.out.println("\n=== FIN DEL PROGRAMA ===");
  }
}
