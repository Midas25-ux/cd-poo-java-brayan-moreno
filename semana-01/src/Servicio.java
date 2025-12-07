public class Servicio {
  private String tipo;
  private String nombre;
  private double precio;
  private String descripcion;
  private int duracionHoras;
  private boolean disponible;

  public Servicio(String tipo, String nombre, double precio, String descripcion, int duracionHoras, boolean disponible) {
    this.tipo = tipo;
    this.nombre = nombre;
    this.precio = precio;
    this.descripcion = descripcion;
    this.duracionHoras = duracionHoras;
    this.disponible = disponible;
  }

  // Getters necesarios
  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public String getTipo() {
    return tipo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getDuracionHoras() {
    return duracionHoras;
  }

  public boolean isDisponible() {
    return disponible;
  }


  public void mostrarInfo() {
    System.out.println("Servicio: " + nombre + " (" + tipo + ")");
    System.out.println("Precio: $" + precio);
    System.out.println("Descripción: " + descripcion);
    System.out.println("Duración: " + duracionHoras + " hora(s)");
    System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
  }
}
