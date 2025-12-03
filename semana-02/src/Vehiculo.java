
public class Vehiculo {
  private String placa;
  private String marca;
  private String modelo;
  private int anio;

  public Vehiculo(String placa, String marca, String modelo, int anio) {
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }

  public String getPlaca() {
    return placa;
  }

  public String getDescripcion() {
    return marca + " " + modelo + " (" + anio + ")";
  }

  public void mostrarInfo() {
    System.out.println("Placa: " + placa);
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Año: " + anio);
  }
}