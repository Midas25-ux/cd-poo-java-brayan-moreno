package com.recursoshumanos;

import com.recursoshumanos.servicio.Reparacion;


import java.util.ArrayList;

public class TallerMecanico {
  private String nombre;
  private ArrayList<Reparacion> reparaciones;

  public TallerMecanico(String nombre) {
    this.nombre = nombre;
    this.reparaciones = new ArrayList<>();
  }

  public void agregarReparacion(Reparacion reparacion) {
    reparaciones.add(reparacion);
  }

  public void mostrarReparaciones() {
    System.out.println("=== Reparaciones en " + nombre + " ===");
    for (Reparacion r : reparaciones) {
      System.out.println(r.obtenerResumen());
    }
  }

  public int contarReparaciones() {
    return reparaciones.size();
  }
}
