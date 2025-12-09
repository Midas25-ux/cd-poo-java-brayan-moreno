package com.recursoshumanos.modelo;

public class Mecanicos {
  private String nombre;
  private String codigo;
  private String correo;
  private int telefono;
  private String direccion;
  private String especialidad;
  private int reparaciones;

  // Constructor único
  public Mecanicos(String nombre, String codigo, String correo, int telefono, String direccion, String especialidad) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.correo = correo;
    this.telefono = telefono;
    this.direccion = direccion;
    this.especialidad = especialidad;
    this.reparaciones = 0;
  }

  // Método para mostrar datos
  public void mostrarDatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Código: " + codigo);
    System.out.println("Correo: " + correo);
    System.out.println("Teléfono: " + telefono);
    System.out.println("Dirección: " + direccion);
    System.out.println("Especialidad: " + especialidad);
    System.out.println("Reparaciones realizadas: " + reparaciones);
  }

  public void registrarReparacion() {
    reparaciones++;
  }

  // ✅ Getters necesarios
  public String getNombre() {
    return nombre;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getCorreo() {
    return correo;
  }

  public int getTelefono() {
    return telefono;
  }

  public String getDireccion() {
    return direccion;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public int getReparaciones() {
    return reparaciones;
  }
}

