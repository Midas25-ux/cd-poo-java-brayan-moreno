package com.recursoshumanos;

import com.recursoshumanos.modelo.Cliente;
import com.recursoshumanos.modelo.Mecanicos;
import com.recursoshumanos.modelo.Servicio;
import com.recursoshumanos.servicio.Reparacion;

public class Main1 {
  public static void main(String[] args) {
    System.out.println("=== SISTEMA DE GESTIÓN DE TALLER MECÁNICO ===\n");

    // Crear clientes
    Cliente c1 = new Cliente("Carlos López", "carlos@gmail.com", "312456789");
    Cliente c2 = new Cliente("Ana Torres", "ana@hotmail.com", "320987654");

    // Crear mecánicos
    Mecanicos mec1 = new Mecanicos("Juan Perez", "M001", "juanpe2354@gmail.com", 5956787, "Cra 10 #20-30", "electromecanica");
    Mecanicos mec2 = new Mecanicos("Luis Gómez", "M002", "luis21432@outlook.com", 6778508, "Av 5 #15-45", "automotriz");

    // Crear servicios
    Servicio s1 = new Servicio("Mecánico", "Alineación", 45000, "Alineación completa del vehículo", 1, true);
    Servicio s2 = new Servicio("Eléctrico", "Cambio de batería", 120000, "Cambio de batería y revisión", 1, true);

    // Crear reparaciones (relaciones)
    Reparacion r1 = new Reparacion(c1, mec1, s1, "2025-12-07");
    Reparacion r2 = new Reparacion(c2, mec2, s2, "2025-12-08");

    // Crear taller y usar ArrayList
    TallerMecanico taller = new TallerMecanico("Taller Los Expertos");
    taller.agregarReparacion(r1);
    taller.agregarReparacion(r2);

    // Mostrar resultados
    taller.mostrarReparaciones();
    System.out.println("Total reparaciones: " + taller.contarReparaciones());
  }
}
