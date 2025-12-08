package com.recursoshumanos;

import com.recursoshumanos.modelo.Empleado;
import com.recursoshumanos.modelo.EmpleadoPlanta;
import com.recursoshumanos.modelo.EmpleadoContrato;
import com.recursoshumanos.servicio.SistemaRH;
import com.recursoshumanos.excepciones.EmpleadoInvalidoException;
import com.recursoshumanos.excepciones.DisponibilidadException;

import java.time.LocalDate;

public class Main4 {
  public static void main(String[] args) {
    System.out.println("=== Sistema RH - Semana 07 ===\n");

    // Crear servicio
    SistemaRH sistema = new SistemaRH();

    // Caso 1: Operación exitosa ✅
    try {
      Empleado e1 = new EmpleadoPlanta("Ana", "E001", 2000000, 5);
      sistema.registrarEmpleado(e1);
    } catch (EmpleadoInvalidoException | DisponibilidadException ex) {
      System.err.println("❌ Error: " + ex.getMessage());
    }

    // Caso 2: Nombre inválido ❌
    try {
      Empleado e2 = new EmpleadoContrato("Luis", "E002", 1500000, LocalDate.of(2026, 12, 31));
      sistema.registrarEmpleado(e2);
    } catch (EmpleadoInvalidoException | DisponibilidadException ex) {
      System.err.println("❌ Error: " + ex.getMessage());
    }

    // Caso 3: Salario negativo ❌
    try {
      Empleado e3 = new EmpleadoPlanta("pedro", "E003", 100000, 2);
      sistema.registrarEmpleado(e3);
    } catch (EmpleadoInvalidoException | DisponibilidadException ex) {
      System.err.println("❌ Error: " + ex.getMessage());
    }

    // Caso 4: Cupo lleno ❌
    try {
      sistema.registrarEmpleado(new EmpleadoContrato("María", "E004", 2500000, LocalDate.of(2027, 6, 30)));
      sistema.registrarEmpleado(new EmpleadoContrato("Pedro", "E005", 1800000, LocalDate.of(2028, 1, 15)));
      sistema.registrarEmpleado(new EmpleadoContrato("Juan", "E006", 1900000, LocalDate.of(2029, 3, 20)));
    } catch (EmpleadoInvalidoException | DisponibilidadException ex) {
      System.err.println("❌ Error: " + ex.getMessage());
    }

    // Caso 5: Recuperación después de error ✅
    try {
      Empleado e5 = new EmpleadoContrato("Carla", "E007", 2500000, LocalDate.of(2027, 6, 30));
      sistema.registrarEmpleado(e5);
      System.out.println("✅ Empleado registrado correctamente después de error");
    } catch (EmpleadoInvalidoException | DisponibilidadException ex) {
      System.err.println("❌ Error: " + ex.getMessage());
    }

    // Ejemplo con finally
    try {
      System.out.println("Procesando archivo de configuración...");
      throw new RuntimeException("Archivo no encontrado");
    } catch (Exception ex) {
      System.err.println("Error leyendo archivo: " + ex.getMessage());
    } finally {
      System.out.println("Liberando recursos...");
    }

    System.out.println("\n✅ Semana 07 completada: Servicio, Modelo y Excepciones");
  }
}


