package interfaces;

// Interface para capacitar empleados
public interface Capacitacion {
  void realizarCapacitacion(String tema);
  int obtenerHorasCapacitacion();
}

package interfaces;

// Interface para atención a clientes
public interface AtencionCliente {
  void atenderCliente(String nombreCliente);
  boolean registrarReclamo(String descripcion);
}
