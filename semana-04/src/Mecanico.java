public class Mecanico extends Empleado {
  private int anosExperiencia;

  public Mecanico(String nombre, String identificacion, double salarioBase, int anosExperiencia) {
    super(nombre, identificacion, salarioBase);  // Llamar constructor padre
    this.anosExperiencia = anosExperiencia;
  }

  @Override
  public double calcularSalario() {
    double bono = salarioBase * 0.05 * anosExperiencia; // bono por experiencia
    return salarioBase + bono;
  }

  public int getAnosExperiencia() {
    return anosExperiencia;
  }

  public void setAnosExperiencia(int anosExperiencia) {
    if (anosExperiencia < 0) {
      throw new IllegalArgumentException("Años de experiencia no puede ser negativo");
    }
    this.anosExperiencia = anosExperiencia;
  }
}
