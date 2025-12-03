package implementaciones;

import abstractas.EmpleadoAbstracto;
import interfaces.Capacitacion;
import interfaces.AtencionCliente;

public class MecanicoSenior extends EmpleadoAbstracto implements Capacitacion, AtencionCliente {
  private int anosExperiencia;
  private int horasCapacitacion;

  public MecanicoSenior(String nombre, String identificacion, double salarioBase, int anosExperiencia) {
    super(nombre, identificacion, salarioBase);
    this.anosExperiencia = anosExperiencia;
    this.horasCapacitacion = 0;
  }

  @Override
  public double calcularSalario() {
    return salarioBase + salarioBase * 0.08 * anosExperiencia;
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Cargo: Mecánico Senior | Experiencia: " + anosExperiencia + " años");
  }

  // Implementación Capacitacion
  @Override
  public void realizarCapacitacion(String tema) {
    System.out.println(nombre + " está realizando capacitación sobre: " + tema);
    horasCapacitacion += 2;
  }

  @Override
  public int obtenerHorasCapacitacion() {
    return horasCapacitacion;
  }

  // Implementación AtencionCliente
  @Override
  public void atenderCliente(String nombreCliente) {
    System.out.println(nombre + " está atendiendo al cliente: " + nombreCliente);
  }

  @Override
  public boolean registrarReclamo(String descripcion) {
    System.out.println("Reclamo registrado: " + descripcion);
    return true;
  }
}
