public class Main2 {
  public static void main(String[] args) {
    // Clientes
    Cliente cliente1 = new Cliente("Juan Pérez", "3001234567", "juan@mail.com");
    Cliente cliente2 = new Cliente("Ana Gómez"); // constructor mínimo

    // Vehículos
    Vehiculo v1 = new Vehiculo("Toyota", "Corolla", 2018, cliente1, "Cambio de aceite");
    Vehiculo v2 = new Vehiculo("Honda", "Civic", 2020, cliente2); // constructor básico

    // Taller
    TallerMecanico taller = new TallerMecanico("Taller Rápido");
    taller.agregarVehiculo(v1);
    taller.agregarVehiculo(v2);

    // Mostrar resultados
    taller.mostrarTodosVehiculos();
    System.out.println("Total de vehículos atendidos: " + taller.contarVehiculos());
  }
}
