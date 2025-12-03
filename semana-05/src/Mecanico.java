public class Mecanico extends Empleado {
  private int anosExperiencia;

  public Mecanico(String nombre, String identificacion, double salarioBase, int anosExperiencia) {
    super(nombre, identificacion, salarioBase);
    this.anosExperiencia = anosExperiencia;
  }

  @Override
  public double calcularSalario() {
    double bono = salarioBase * 0.05 * anosExperiencia;
    return salarioBase + bono;
  }

  @Override
  public String obtenerDescripcion() {
    return "Mecánico: " + nombre + " (" + anosExperiencia + " años de experiencia)";
  }

  // Getter/Setter
  public int getAnosExperiencia() { return anosExperiencia; }
  public void setAnosExperiencia(int anosExperiencia) {
    if (anosExperiencia < 0) throw new IllegalArgumentException("Años negativos");
    this.anosExperiencia = anosExperiencia;
  }
}
