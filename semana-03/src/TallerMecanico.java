import java.util.ArrayList;

public class TallerMecanico {
  private String nombre;
  private ArrayList<Vehiculo> vehiculos;

  public TallerMecanico(String nombre) {
    setNombre(nombre);
    this.vehiculos = new ArrayList<>();
  }

  public String getNombre() { return nombre; }
  public void setNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
      throw new IllegalArgumentException("Nombre del taller no puede estar vacío");
    }
    this.nombre = nombre;
  }

  public void agregarVehiculo(Vehiculo vehiculo) {
    vehiculos.add(vehiculo);
  }

  public void mostrarTodosVehiculos() {
    for (Vehiculo v : vehiculos) {
      System.out.println(v.obtenerResumen());
    }
  }

  public int contarVehiculos() {
    return vehiculos.size();
  }
}
