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

public class Main {
  public static void main(String[] args) {

    // Crear 5 vehículos
    Autos v1 = new Autos("ABC123", "Chevrolet", "Spark GT", 2020);
    Autos v2 = new Autos("XYZ789", "Renault", "Logan", 2019);
    Autos v3 = new Autos("DEF456", "Mazda", "3", 2021);
    Autos v4 = new Autos("GHI321", "Toyota", "Corolla", 2018);
    Autos v5 = new Autos("JKL654", "Nissan", "Sentra", 2022);

    // Mostrar información de todos los vehículos
    v1.mostrarInfo();
    v2.mostrarInfo();
    v3.mostrarInfo();
    v4.mostrarInfo();
    v5.mostrarInfo();
  }
}

