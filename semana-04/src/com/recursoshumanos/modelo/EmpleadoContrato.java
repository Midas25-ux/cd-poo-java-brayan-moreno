package com.recursoshumanos.modelo;

import java.time.LocalDate;

public class EmpleadoContrato extends Empleado {
  private LocalDate fechaFinContrato;

  public EmpleadoContrato(String nombre, String identificacion, double salarioBase,LocalDate fechaFinContrato) {
    super(nombre, identificacion, salarioBase);
    if (fechaFinContrato == null || fechaFinContrato.isBefore(LocalDate.now())) {
      throw new IllegalArgumentException("Fecha de contrato inválida");
    }
    this.fechaFinContrato = fechaFinContrato;
  }

  @Override
  public double calcularSalario() {
    return salarioBase;
  }

  @Override
  public String obtenerDescripcion() {
    return "Empleado por Contrato: " + nombre + " (hasta " + fechaFinContrato + ")";
  }

  // Interfaces

  public boolean verificarPagoPendiente() { return true; }


  public void procesarPago() {
    System.out.println("Pago procesado para contrato: " + nombre);
  }


  public void generarReporte() {
    System.out.println("Reporte generado para contrato: " + nombre);
  }


  public String exportarDatos() {
    return "Datos exportados de contrato: " + nombre;
  }

  @Override
  public void mostrarInfo() {
    System.out.println("Empleado por Contrato: " + nombre + " | Contrato hasta: " + fechaFinContrato);
  }

}


