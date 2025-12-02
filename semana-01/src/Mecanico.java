public class Mecanico {
  // Atributos (4 mínimo)
  private String idMecanico;
  private String nombre;
  private String correo;
  private int telefono;
  private String direccion;
  private String especialidad;
  private int reparacionesRealizadas;

  // Constructor
  public Mecanico(String idMecanico, String nombre, String correo, int telefono, String direccion, String especialidad) {
    this.idMecanico = idMecanico;
    this.nombre = nombre;
    this.correo = correo;
    this.telefono = telefono;
    this.direccion = direccion;
    this.especialidad = especialidad;
    this.reparacionesRealizadas = 0;
  }



  // Mostrar datos del mecánico
  public void mostrarDatos() {
    System.out.println("Mecánico: " + nombre);
    System.out.println("ID: " + idMecanico);
    System.out.println("Correo: " + correo);
    System.out.println("Telefono: " + telefono);
    System.out.println("Direccion: " + direccion);
    System.out.println("Especialidad: " + especialidad);
    System.out.println("Reparaciones realizadas: " + reparacionesRealizadas);
    System.out.println("Estado: " + (esMecanicoActivo() ? "Activo" : "Inactivo"));
  }

  // Contabilizar una nueva reparación hecha
  public void registrarReparacion() {
    reparacionesRealizadas++;
  }

  // Saber si es un mecánico activo
  public boolean esMecanicoActivo() {
    return reparacionesRealizadas >= 0;
  }

  // Getter
  public String getNombre() {
    return nombre;
  }
}

