package com.recursoshumanos.modelo;

public class Servicio {
  private String tipo;
  private String Id_servicio;
  private double precio;
  private String descripcion;
  private int duracionHoras;
  private boolean disponible;

  public Servicio(String tipo, String Id_servicio, double precio, String descripcion, int duracionHoras, boolean disponible) {
    this.tipo = tipo;
    this.Id_servicio = Id_servicio;
    this.precio = precio;
    this.descripcion = descripcion;
    this.duracionHoras = duracionHoras;
    this.disponible = disponible;
  }

  // Getters necesarios
  public String getNombre() {
    return Id_servicio;
  }

  public double getPrecio() {
    return precio;
  }

  public String getTipo() {
    return tipo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getDuracionHoras() {
    return duracionHoras;
  }

  public boolean isDisponible() {
    return disponible;
  }


  public void mostrarInfo() {
    System.out.println("Servicio: " + Id_servicio + " (" + tipo + ")");
    System.out.println("Precio: $" + precio);
    System.out.println("Descripción: " + descripcion);
    System.out.println("Duración: " + duracionHoras + " hora(s)");
    System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
  }
}
