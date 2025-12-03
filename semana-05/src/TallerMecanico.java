import java.util.ArrayList;

public class TallerMecanico {
  private ArrayList<Empleado> empleados;
  private ArrayList<Vehiculo> vehiculos;

  public TallerMecanico() {
    empleados = new ArrayList<>();
    vehiculos = new ArrayList<>();
  }

  // Métodos polimórficos: aceptan Empleado y funcionan con cualquier subclase
  public void agregarEmpleado(Empleado empleado) {
    empleados.add(empleado);
    System.out.println("Empleado agregado: " + empleado.obtenerDescripcion());
  }

  public void procesarNomina() {
    double total = 0;
    System.out.println("\n=== NÓMINA DEL TALLER ===");
    for (Empleado emp : empleados) {
      System.out.println(emp.obtenerDescripcion());
      System.out.println("Salario: $" + emp.calcularSalario());
      total += emp.calcularSalario();
      System.out.println("---");
    }
    System.out.println("Total de nómina: $" + total);
  }

  // Sobrecarga de métodos: búsqueda de vehículos
  public Vehiculo buscarVehiculo(String marca) {
    for (Vehiculo v : vehiculos) {
      if (v.getMarca().equalsIgnoreCase(marca)) return v;
    }
    return null;
  }

  public Vehiculo buscarVehiculo(String marca, String modelo) {
    for (Vehiculo v : vehiculos) {
      if (v.getMarca().equalsIgnoreCase(marca) && v.getModelo().equalsIgnoreCase(modelo))
        return v;
    }
    return null;
  }

  public void agregarVehiculo(Vehiculo vehiculo) {
    vehiculos.add(vehiculo);
    System.out.println("Vehículo agregado: " + vehiculo.obtenerResumen());
  }
}
