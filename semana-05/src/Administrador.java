public class Administrador extends Empleado {
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
  public String obtenerDescripcion() {
    return "Administrador: " + nombre + " (Nivel " + nivelJerarquia + ")";
  }

  public int getNivelJerarquia() { return nivelJerarquia; }
  public void setNivelJerarquia(int nivelJerarquia) {
    if (nivelJerarquia < 1) throw new IllegalArgumentException("Nivel mínimo 1");
    this.nivelJerarquia = nivelJerarquia;
  }
}
