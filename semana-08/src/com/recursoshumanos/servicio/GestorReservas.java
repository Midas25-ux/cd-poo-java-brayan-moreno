package com.recursoshumanos.servicio;

import com.recursoshumanos.modelo.Reserva;
import java.util.*;

public class GestorReservas {
  private Map<String, Reserva> reservasPorCodigo = new HashMap<>();
  private List<Reserva> historial = new ArrayList<>();
  private Map<String, List<Reserva>> reservasPorCliente = new HashMap<>();

  // CRUD
  public void agregar(Reserva r) {
    if (reservasPorCodigo.containsKey(r.getCodigo())) {
      throw new IllegalArgumentException("Ya existe reserva con código: " + r.getCodigo());
    }
    reservasPorCodigo.put(r.getCodigo(), r);
    historial.add(r);

    String idCliente = r.getCliente().getId();


    reservasPorCliente.putIfAbsent(r.getCliente().getId(), new ArrayList<>());
    reservasPorCliente.get(r.getCliente().getId()).add(r);
  }

  public Reserva buscarPorCodigo(String codigo) {
    return reservasPorCodigo.get(codigo);
  }

  public Reserva eliminar(String codigo) {
    Reserva r = reservasPorCodigo.remove(codigo);
    if (r != null) {
      historial.remove(r);
      reservasPorCliente.get(r.getCliente().getId()).remove(r);
    }
    return r;
  }

  public int cantidad() { return historial.size(); }

  // Filtrado
  public List<Reserva> filtrarPorPrecio(double min, double max) {
    List<Reserva> resultado = new ArrayList<>();
    for (Reserva r : historial) {
      if (r.getPrecio() >= min && r.getPrecio() <= max) {
        resultado.add(r);
      }
    }
    return resultado;
  }

  // Estadísticas
  public double calcularTotalVentas() {
    double total = 0;
    for (Reserva r : historial) total += r.getPrecio();
    return total;
  }

  public double calcularPromedioPrecio() {
    return historial.isEmpty() ? 0 : calcularTotalVentas() / historial.size();
  }

  public Reserva obtenerReservaMasCara() {
    if (historial.isEmpty()) return null;
    Reserva maxima = historial.get(0);
    for (Reserva r : historial) {
      if (r.getPrecio() > maxima.getPrecio()) maxima = r;
    }
    return maxima;
  }

  public Map<String, Integer> contarPorTipo() {
    Map<String, Integer> conteo = new HashMap<>();
    for (Reserva r : historial) {
      conteo.put(r.getTipo(), conteo.getOrDefault(r.getTipo(), 0) + 1);
    }
    return conteo;
  }


}


