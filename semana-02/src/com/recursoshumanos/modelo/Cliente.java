package com.recursoshumanos.modelo;

public class Cliente {
  private String id;
  private String nombre;
  private String correo;

  // Constructor con 2 parámetros
  public Cliente(String id, String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  // Constructor con 3 parámetros
  public Cliente(String id, String nombre, String correo) {
    this.id = id;
    this.nombre = nombre;
    this.correo = correo;
  }

  // ✅ Getter para id
  public String getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCorreo() {
    return correo;
  }

  @Override
  public String toString() {
    return "Cliente{id='" + id + "', nombre='" + nombre + "', correo='" + correo + "'}";
  }
}
