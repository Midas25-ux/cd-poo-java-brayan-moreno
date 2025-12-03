public class Main4 {
  public static void main(String[] args) {
    TallerMecanico taller = new TallerMecanico();

    // Crear empleados
    Mecanico mec1 = new Mecanico("Juan Pérez", "M001", 1500000, 5);
    Administrador adm1 = new Administrador("Ana Gómez", "A001", 2000000, 2);
    Mecanico mec2 = new Mecanico("Luis Rodríguez", "M002", 1800000, 3);

    // Agregar empleados (polimorfismo)
    taller.agregarEmpleado(mec1);
    taller.agregarEmpleado(adm1);
    taller.agregarEmpleado(mec2);

    // Procesar nómina (polimorfismo dinámico)
    taller.procesarNomina();

    // Crear vehículos
    Vehiculo v1 = new Vehiculo("Toyota", "Corolla", 2020, new Cliente("Carlos"));
    Vehiculo v2 = new Vehiculo("Honda", "Civic", 2019, new Cliente("María"));

    // Agregar vehículos
    taller.agregarVehiculo(v1);
    taller.agregarVehiculo(v2);

    // Demostración de sobrecarga
    System.out.println("\n=== Búsqueda de Vehículos ===");
    Vehiculo buscado1 = taller.buscarVehiculo("Toyota");
    System.out.println("Encontrado: " + (buscado1 != null ? buscado1.obtenerResumen() : "No encontrado"));

    Vehiculo buscado2 = taller.buscarVehiculo("Honda", "Civic");
    System.out.println("Encontrado: " + (buscado2 != null ? buscado2.obtenerResumen() : "No encontrado"));
  }
}
