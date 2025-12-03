package implementaciones;

import abstractas.EmpleadoAbstracto;

public class Mecanico extends EmpleadoAbstracto {
  private int anosExperiencia;

  public Mecanico(String nombre, String identificacion, double salarioBase, int anosExperiencia) {
    super(nombre, identificacion, salarioBase);
    this.anosExperiencia = anosExperiencia;
  }

  @Override
  public double calcularSalario() {
    return salarioBase + salarioBase * 0.05 * anosExperiencia;
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Cargo: Mecánico | Experiencia: " + anosExperiencia + " años");
  }
}

package implementaciones;

import abstractas.EmpleadoAbstracto;

public class Administrador extends EmpleadoAbstracto {
  private int nivelJerarquia;

  public Administrador(String nombre, String identificacion, double salarioBase, int nivelJerarquia) {
    super(nombre, identificacion, salarioBase);
    this.nivelJerarquia = nivelJerarquia;
  }

  @Override
  public double calcularSalario() {
    return salarioBase + salarioBase * 0.1 * nivelJerarquia;
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Cargo: Administrador | Nivel: " + nivelJerarquia);
  }
}
