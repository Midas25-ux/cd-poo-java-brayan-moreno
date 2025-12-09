package com.recursoshumanos.servicio;

import com.recursoshumanos.modelo.Cliente;
import com.recursoshumanos.modelo.Mecanicos;
import com.recursoshumanos.modelo.Servicio;
import java.text.DecimalFormat;

public class Reparacion {
  private static int contador = 0;
  private int id;
  private Cliente cliente;
  private Mecanicos mecanico;
  private Servicio servicio;
  private String fecha;
  private String estado;

  public Reparacion(Cliente cliente, Mecanicos mecanico, Servicio servicio, String fecha) {
    this.id = ++contador;
    this.cliente = cliente;
    this.mecanico = mecanico;
    this.servicio = servicio;
    this.fecha = fecha;
    this.estado = "Pendiente";
  }

  public double calcularCosto() {
    return servicio.getPrecio();
  }

  public String obtenerResumen() {
    DecimalFormat df = new DecimalFormat("#,###.00");
    return "ID: " + id + " | Reparación: " + servicio.getNombre() +
        " | Cliente: " + cliente.getNombre() +
        " | Mecánico: " + mecanico.getNombre() +
        " | Fecha: " + fecha +
        " | Estado: " + estado +
        " | Costo: $" + df.format(calcularCosto());
  }

  public void actualizarEstado(String nuevoEstado) {
    this.estado = nuevoEstado;
  }

  public String getEstado() { return estado; }
}

