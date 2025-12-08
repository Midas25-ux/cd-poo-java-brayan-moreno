package com.recursoshumanos.modelo;

public abstract class Empleado {
  protected String nombre;
  protected String identificacion;
  protected double salarioBase;

  public Empleado(String nombre, String identificacion, double salarioBase) {
    this.nombre = nombre;
    this.identificacion = identificacion;
    this.salarioBase = salarioBase;
  }

  public double calcularSalario() {
    return salarioBase;
  }

  // metodo base que faltaba
  public String obtenerDescripcion() {
    return "Empleado: " + nombre + " (ID: " + identificacion + ")";
  }

  // metodo base para poliformismo
  public void mostrarInfo() {
    System.out.println("Empleado: " + nombre + " | ID: " + identificacion);
  }

  public String getNombre() { return nombre; }
  public String getIdentificacion() { return identificacion; }
  public double getSalarioBase() { return salarioBase; }
}


