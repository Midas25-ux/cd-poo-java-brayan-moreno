package com.recursoshumanos.modelo;

import java.time.LocalDate;

public class Reserva {
  private String codigo;
  private Cliente cliente;
  private LocalDate fecha;
  private double precio;
  private String tipo;

  public Reserva(String codigo, Cliente cliente, LocalDate fecha, double precio, String tipo) {
    this.codigo = codigo;
    this.cliente = cliente;
    this.fecha = fecha;
    this.precio = precio;
    this.tipo = tipo;
  }

  public String getCodigo() { return codigo; }
  public Cliente getCliente() { return cliente; }
  public LocalDate getFecha() { return fecha; }
  public double getPrecio() { return precio; }
  public String getTipo() { return tipo; }

  @Override
  public String toString() {
    return "Reserva{" + "codigo='" + codigo + "', cliente=" + cliente +
        ", fecha=" + fecha + ", precio=" + precio + ", tipo='" + tipo + "'}";
  }
}
