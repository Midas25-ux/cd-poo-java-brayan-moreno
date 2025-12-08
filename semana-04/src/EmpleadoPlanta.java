public class EmpleadoPlanta extends Empleado {
  private int antiguedad;

  public EmpleadoPlanta(String nombre, String identificacion, double salarioBase, int antiguedad) {
    super(nombre, identificacion, salarioBase);
    this.antiguedad = antiguedad;
  }

  @Override
  public double calcularSalario() {
    double bono = salarioBase * (antiguedad * 0.05);
    return salarioBase + bono;
  }

  @Override
  public String obtenerDescripcion() {
    return "Empleado de Planta: " + nombre + " (" + antiguedad + " años)";
  }

  @Override
  public void mostrarInfo() {
    System.out.println("Empleado de Planta: " + nombre);
    System.out.println("ID: " + identificacion);
    System.out.println("Antigüedad: " + antiguedad + " años");
    System.out.println("Salario con bono: $" + calcularSalario());
  }
}


