package com.recursoshumanos.modelo;

import java.util.ArrayList;

public class SistemaRH {
  private ArrayList<Empleado> empleados;

  // Constructor
  public SistemaRH() {
    this.empleados = new ArrayList<>();
  }

  // Método polimórfico: agregar empleado
  public void agregarEmpleado(Empleado empleado) {
    empleados.add(empleado);
    System.out.println("Empleado agregado: " + empleado.obtenerDescripcion());
  }

  // Método polimórfico: procesar nómina de un empleado
  public void procesarNomina(Empleado empleado) {
    double salario = empleado.calcularSalario(); // Polimorfismo dinámico
    System.out.println("Procesando pago para: " + empleado.nombre);
    System.out.println("Salario: $" + salario);
  }

  // Método polimórfico: procesar nómina completa
  public void procesarNominaCompleta() {
    System.out.println("\n=== NÓMINA MENSUAL ===");
    double total = 0;
    for (Empleado emp : empleados) {
      procesarNomina(emp); // Dynamic binding: ejecuta versión de la subclase
      total += emp.calcularSalario();
      System.out.println("---");
    }
    System.out.println("TOTAL: $" + total);
  }

  // Método polimórfico: generar reporte
  public void generarReporte() {
    System.out.println("\n=== REPORTE DE EMPLEADOS ===");
    for (Empleado emp : empleados) {
      System.out.println(emp.obtenerDescripcion()); // Dynamic binding
      System.out.println("Salario: $" + emp.calcularSalario());
    }
  }

  // Ejemplo de sobrecarga: buscar empleados
  public Empleado buscarEmpleado(String id) {
    for (Empleado e : empleados) {
      if (e.identificacion.equals(id)) {
        return e;
      }
    }
    return null;
  }

  public ArrayList<Empleado> buscarEmpleado(String nombre, double salarioMinimo) {
    ArrayList<Empleado> resultado = new ArrayList<>();
    for (Empleado e : empleados) {
      if (e.nombre.equalsIgnoreCase(nombre) && e.calcularSalario() >= salarioMinimo) {
        resultado.add(e);
      }
    }
    return resultado;
  }
}
