public class Servicio {
  private String tipoServicio;
  private String nombreServicio;
  private double precioServicio;
  private String descripcionServicio;
  private int tiempoServicio;
  private boolean activo;

  // Constructor
  public Servicio(String tipoServicio, String nombreServicio, double precioServicio, String descripcionServicio, int tiempoServicio, boolean activo) {
    this.tipoServicio = tipoServicio;
    this.nombreServicio = nombreServicio;
    this.precioServicio = precioServicio;
    this.descripcionServicio = descripcionServicio;
    this.tiempoServicio = tiempoServicio;
    this.activo = activo;
  }


  // metodo para imprimir informacion
  public void mostrarInfo() {
    System.out.println("Servicio creado:");
    System.out.println("Tipo: " + tipoServicio);
    System.out.println("Nombre: " + nombreServicio);
    System.out.println("Precio: $" + precioServicio + " pesos");
    System.out.println("Descripción: " + descripcionServicio);
    System.out.println("Tiempo: " + tiempoServicio + " hora");
    System.out.println("Estado: " + (activo ? "Activo" : "Inactivo"));
  }

  // Getters y setters
  public String getTipoServicio() { return tipoServicio; }
  public void setTipoServicio(String tipoServicio) { this.tipoServicio = tipoServicio; }

  public String getNombreServicio() { return nombreServicio; }
  public void setNombreServicio(String nombreServicio) { this.nombreServicio = nombreServicio; }

  public double getPrecioServicio() { return precioServicio; }
  public void setPrecioServicio(double precioServicio) { this.precioServicio = precioServicio; }

  public String getDescripcionServicio() { return descripcionServicio; }
  public void setDescripcionServicio(String descripcionServicio) { this.descripcionServicio = descripcionServicio; }

  public int getTiempoServicio() { return tiempoServicio; }
  public void setTiempoServicio(int tiempoServicio) { this.tiempoServicio = tiempoServicio; }

  public boolean isEstadoServicio() { return activo; }
  public void setActivo(boolean activo) { this.activo = activo;
  }
}

