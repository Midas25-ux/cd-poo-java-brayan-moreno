package com.recursoshumanos;

import com.recursoshumanos.modelo.Cliente;
import com.recursoshumanos.modelo.Mecanicos;
import com.recursoshumanos.modelo.Reserva;
import com.recursoshumanos.modelo.Servicio;
import com.recursoshumanos.servicio.Reparacion;
import com.recursoshumanos.servicio.GestorReservas;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class MainFinal {
  public static void main(String[] args) {
    GestorReservas gestor = new GestorReservas();
    Scanner scanner = new Scanner(System.in);

    int opcion;
    do {
      System.out.println("\n=== PROYECTO FINAL INTEGRADOR ===");
      System.out.println("1. Agregar cliente");
      System.out.println("2. Agregar mecánico");
      System.out.println("3. Agregar servicio");
      System.out.println("4. Registrar reparación");
      System.out.println("5. Registrar reserva");
      System.out.println("6. Buscar reserva por código");
      System.out.println("7. Listar todas las reservas");
      System.out.println("8. Filtrar reservas por precio");
      System.out.println("9. Ver estadísticas");
      System.out.println("0. Salir");
      System.out.print("Seleccione una opción: ");

      opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1 -> agregarCliente(scanner);
        case 2 -> agregarMecanico(scanner);
        case 3 -> agregarServicio(scanner);
        case 4 -> registrarReparacion(scanner);
        case 5 -> registrarReserva(gestor, scanner);
        case 6 -> buscarReserva(gestor, scanner);
        case 7 -> listarReservas(gestor);
        case 8 -> filtrarPorPrecio(gestor, scanner);
        case 9 -> mostrarEstadisticas(gestor);
        case 0 -> System.out.println("✅ Sistema finalizado");
        default -> System.out.println("❌ Opción inválida");
      }
    } while (opcion != 0);
  }

  private static void agregarCliente(Scanner scanner) {
    System.out.print("ID Cliente: ");
    String id = scanner.nextLine();
    System.out.print("Nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Correo: ");
    String correo = scanner.nextLine();

    Cliente cliente = new Cliente(id, nombre, correo);
    System.out.println("✅ Cliente agregado: " + cliente);
  }

  private static void agregarMecanico(Scanner scanner) {
    System.out.print("ID Mecanico: ");
    String id = scanner.nextLine();
    System.out.print("Nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Especialidad: ");
    String especialidad = scanner.nextLine();

    Mecanicos mecanico = new Mecanicos("M001", "Carlos", "Motor", 5, "3001234567", "carlos@email.com");
    System.out.println("✅ Mecanico agregado: " + mecanico);
  }

  private static void agregarServicio(Scanner scanner) {
    System.out.print("Código servicio: ");
    String codigo = scanner.nextLine();
    System.out.print("Descripción: ");
    String descripcion = scanner.nextLine();
    System.out.print("Precio: ");
    double precio = scanner.nextDouble();
    scanner.nextLine();

    Servicio servicio = new Servicio("Mantenimiento" , "S001", 50000.0, "Cambio de aceite", 2, true);
    System.out.println("✅ Servicio agregado: " + servicio);
  }

  private static void registrarReparacion(Scanner scanner) {
    Cliente cliente = new Cliente("C001", "Brayan", "brayan@email.com");
    Mecanicos mecanico = new Mecanicos("M001", "Carlos", "Motor", 5, "3001234567", "carlos@email.com");
    Servicio servicio = new Servicio ("Mantenimiento" , "S001", 50000.0, "Cambio de aceite", 2, true);
    Reparacion reparacion = new Reparacion(cliente, mecanico, servicio,"Revisión general del motor");
    System.out.println("✅ Reparación registrada: " + reparacion);
  }

  private static void registrarReserva(GestorReservas gestor, Scanner scanner) {
    System.out.print("Código reserva: ");
    String codigo = scanner.nextLine();
    System.out.print("ID Cliente: ");
    String idCliente = scanner.nextLine();
    System.out.print("Nombre Cliente: ");
    String nombreCliente = scanner.nextLine();
    System.out.print("Correo Cliente: ");
    String correoCliente = scanner.nextLine();
    System.out.print("Precio: ");
    double precio = scanner.nextDouble();
    scanner.nextLine();

    Cliente cliente = new Cliente(idCliente, nombreCliente, correoCliente);
    Reserva r = new Reserva(codigo, cliente, LocalDate.now(), precio, "General");
    gestor.agregar(r);
    System.out.println("✅ Reserva agregada");
  }

  private static void buscarReserva(GestorReservas gestor, Scanner scanner) {
    System.out.print("Código a buscar: ");
    String codigo = scanner.nextLine();
    Reserva r = gestor.buscarPorCodigo(codigo);
    System.out.println(r != null ? "Encontrada: " + r : "❌ No existe reserva con código: " + codigo);
  }

  private static void listarReservas(GestorReservas gestor) {
    System.out.println("\n=== LISTA DE RESERVAS ===");
    for (Reserva r : gestor.filtrarPorPrecio(0, Double.MAX_VALUE)) {
      System.out.println(r);
    }
  }

  private static void filtrarPorPrecio(GestorReservas gestor, Scanner scanner) {
    System.out.print("Precio mínimo: ");
    double min = scanner.nextDouble();
    System.out.print("Precio máximo: ");
    double max = scanner.nextDouble();
    scanner.nextLine();

    for (Reserva r : gestor.filtrarPorPrecio(min, max)) {
      System.out.println(r);
    }
  }

  private static void mostrarEstadisticas(GestorReservas gestor) {
    System.out.println("\n=== ESTADÍSTICAS ===");
    System.out.println("Total reservas: " + gestor.cantidad());
    System.out.println("Total ventas: $" + gestor.calcularTotalVentas());
    System.out.println("Promedio: $" + gestor.calcularPromedioPrecio());

    Reserva maxima = gestor.obtenerReservaMasCara();
    if (maxima != null) {
      System.out.println("Más cara: " + maxima);
    }

    System.out.println("\nConteo por tipo:");
    Map<String, Integer> conteo = gestor.contarPorTipo();
    for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
      System.out.println("  " + entry.getKey() + ": " + entry.getValue());
    }
  }
}
