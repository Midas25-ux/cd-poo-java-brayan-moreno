package com.recursoshumanos;

import com.recursoshumanos.servicio.GestorReservas;
import com.recursoshumanos.modelo.Reserva;
import com.recursoshumanos.modelo.Cliente;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class Main5 {
  public static void main(String[] args) {
    GestorReservas gestor = new GestorReservas();
    Scanner scanner = new Scanner(System.in);

    int opcion;
    do {
      System.out.println("\n=== SISTEMA DE GESTIÓN ===");
      System.out.println("1. Agregar reserva");
      System.out.println("2. Buscar por código");
      System.out.println("3. Filtrar por precio");
      System.out.println("4. Ver estadísticas");
      System.out.println("5. Eliminar reserva");
      System.out.println("0. Salir");
      System.out.print("Opción: ");

      opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1 -> agregarReserva(gestor, scanner);
        case 2 -> buscarReserva(gestor, scanner);
        case 3 -> filtrarPorPrecio(gestor, scanner);
        case 4 -> mostrarEstadisticas(gestor);
        case 5 -> eliminarReserva(gestor, scanner);
        case 0 -> System.out.println("¡Hasta luego!");
        default -> System.out.println("Opción inválida");
      }
    } while (opcion != 0);
  }

  private static void agregarReserva(GestorReservas gestor, Scanner scanner) {
    System.out.print("Código: ");
    String codigo = scanner.nextLine();
    System.out.print("Cliente ID: ");
    String idCliente = scanner.nextLine();
    System.out.print("Nombre cliente: ");
    String nombre = scanner.nextLine();
    System.out.print("Correo electronico: ");
    String correo = scanner.nextLine();
    String nombreCliente = scanner.nextLine();
    System.out.print("Precio: ");
    double precio = scanner.nextDouble();
    scanner.nextLine();

    Cliente cliente = new Cliente(nombreCliente, idCliente,correo);
    Reserva r = new Reserva(codigo, cliente, LocalDate.now(), precio, "General");
    gestor.agregar(r);
    System.out.println("✅ Reserva agregada");
  }

  private static void buscarReserva(GestorReservas gestor, Scanner scanner) {
    System.out.print("Código a buscar: ");
    String codigo = scanner.nextLine();
    Reserva r = gestor.buscarPorCodigo(codigo);
    System.out.println(r != null ? "Encontrada: " + r : "No existe reserva con código: " + codigo);
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

  private static void eliminarReserva(GestorReservas gestor, Scanner scanner) {
    System.out.print("Código a eliminar: ");
    String codigo = scanner.nextLine();
    Reserva r = gestor.eliminar(codigo);
    System.out.println(r != null ? "Eliminada: " + r : "No existe reserva con código: " + codigo);
  }
}

