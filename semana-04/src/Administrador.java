public class Administrador extends Empleado {
  private int nivelJerarquia;

  public Administrador(String nombre, String identificacion, double salarioBase, int nivelJerarquia) {
    super(nombre, identificacion, salarioBase);
    this.nivelJerarquia = nivelJerarquia;
  }

  @Override
  public double calcularSalario() {
    double bono = salarioBase * 0.1 * nivelJerarquia; // bono según nivel jerárquico
    return salarioBase + bono;
  }

  public int getNivelJerarquia() {
    return nivelJerarquia;
  }

  public void setNivelJerarquia(int nivelJerarquia) {
    if (nivelJerarquia < 1) {
      throw new IllegalArgumentException("Nivel jerárquico debe ser al menos 1");
    }
    this.nivelJerarquia = nivelJerarquia;
  }
}
