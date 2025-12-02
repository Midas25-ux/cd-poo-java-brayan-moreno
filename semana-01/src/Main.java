public class Main {

  public static void main(String[] args) {

    System.out.println("=== SISTEMA DE GESTIÓN DE TALLER MECÁNICO ===\n");

    // Crear mecánicos
    Mecanico mec1 = new Mecanico("M001", "Juan Pérez",
        "juanpere4576@gmail.com", 5956787, "Cra 10 #20-30", "electromecanica");

    Mecanico mec2 = new Mecanico("M002", "Luis Gómez",
        "luis21432@outlook.com", 6778508, "Av 5 #15-45", "automotriz");

    // Crear servicios
    Servicio s1 = new Servicio("Mecánico", "Alineación", 45000,
        "Alineación completa del vehículo", 1, true);

    Servicio s2 = new Servicio("Eléctrico", "Cambio de batería", 120000,
        "Reemplazo de batería y revisión eléctrica", 1, false);

    // Mostrar mecánicos
    System.out.println("--- MECÁNICOS ---");
    mec1.mostrarDatos();
    System.out.println();
    mec2.mostrarDatos();

    // Registrar reparaciones
    mec1.registrarReparacion();
    mec1.registrarReparacion();
    mec2.registrarReparacion();

    System.out.println("\n--- MECÁNICOS (Después de registrar reparaciones) ---");
    mec1.mostrarDatos();
    System.out.println();
    mec2.mostrarDatos();

    // Mostrar servicios
    System.out.println("\n--- SERVICIOS DISPONIBLES ---");
    s1.mostrarInfo();
    System.out.println();
    s2.mostrarInfo();
  }
}
