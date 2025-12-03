public class Main3 {
  public static void main(String[] args) {
    // Array polimórfico
    Empleado[] empleados = new Empleado[3];

    empleados[0] = new Mecanico("Juan Pérez", "M001", 1500000, 5);
    empleados[1] = new Administrador("Ana Gómez", "A001", 2000000, 2);
    empleados[2] = new Mecanico("Luis Rodríguez", "M002", 1800000, 3);

    // Polimorfismo en acción
    for (Empleado emp : empleados) {
      emp.mostrarInfo();
      System.out.println("Salario: $" + emp.calcularSalario());
      System.out.println("---");
    }
  }
}
