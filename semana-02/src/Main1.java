public class Main1 {
  public static void main(String[] args) {

    System.out.println("=== SISTEMA DEL TALLER MECÁNICO - SEMANA 02 ===\n");

    // Mecánicos existentes (ya creados en semana 01)
    Mecanicos m1 = new Mecanicos("M001", "Juan Pérez", "juanpere4576@gmail.com",
        5956787, "Cra 10 #20-30", "Electromecánica");

    Mecanicos m2 = new Mecanicos("M002", "Luis Gómez", "luis21432@outlook.com",
        6778508, "Av 5 #15-45", "Automotriz");

    // Crear vehículos
    Vehiculo v1 = new Vehiculo("ABC123", "Chevrolet", "Spark GT", 2020);
    Vehiculo v2 = new Vehiculo("JKL987", "Toyota", "Corolla", 2022);

    // Crear reparaciones
    Servicio r1 = new Servicio(m1, v1, "Cambio de aceite", 85000);
    Servicio r2 = new Servicio(m2, v2, "Alineación y balanceo", 120000);
    Reparacion r3 = new Reparacion(m1, v2, "Revisión de frenos", 95000);

    // Clase gestora
    TallerMecanico taller = new TallerMecanico();
    taller.agregarReparacion(r1);
    taller.agregarReparacion(r2);
    taller.agregarReparacion(r3);

    // Mostrar resultados
    taller.mostrarReparaciones();
    System.out.println("\nTotal reparaciones: " + taller.totalReparaciones());
    System.out.println("Total ingresos: $" + taller.totalIngresos());
  }
}
