public class EmpleadoPlanta extends Empleado implements Pagable, Reportable, Bonificable {
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

  // Interfaces
  @Override
  public boolean verificarPagoPendiente() { return true; }

  @Override
  public void procesarPago() {
    System.out.println("Pago procesado para " + nombre);
  }

  @Override
  public void generarReporte() {
    System.out.println("Reporte generado para empleado de planta: " + nombre);
  }

  @Override
  public String exportarDatos() {
    return "Datos exportados de " + nombre;
  }

  @Override
  public double calcularBono() {
    return salarioBase * 0.1;
  }

  @Override
  public boolean esElegibleBono() {
    return antiguedad > 3;
  }

  @Override
  public void mostrarInfo() {
    System.out.println("Empleado de Planta: " + nombre + " | Antigüedad: " + antiguedad + " años");
  }

}


