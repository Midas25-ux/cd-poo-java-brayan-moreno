public class Autos {
  // Atributos
  private String placa;
  private String marca;
  private String modelo;
  private int anio;

  // Constructor
  public Autos(String placa, String marca, String modelo, int anio) {
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }

  // Método para mostrar información
  public void mostrarInfo() {
    System.out.println("Placa: " + placa);
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Año: " + anio);
    System.out.println("------------------------");
  }
}
