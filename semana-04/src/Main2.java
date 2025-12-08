public class Main2 {
  public static void main(String[] args) {
    // Array polimórfico
    Empleado[] empleados = new Empleado[3];

    empleados[0] = new EmpleadoPlanta("Ana", "E001", 2000000, 5);
    empleados[1] = new EmpleadoContrato("Luis", "E002", 1500000, 6);
    empleados[2] = new EmpleadoPlanta("María", "E003", 2500000, 3);

    // Polimorfismo en acción
    for (Empleado emp : empleados) {
      emp.mostrarInfo();
      System.out.println("Salario: $" + emp.calcularSalario());
      System.out.println("---");
    }
  }
}
