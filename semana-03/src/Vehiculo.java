public class Vehiculo {
  private String marca;
  private String modelo;
  private int anio;
  private Cliente propietario; // Cambiado de String a Cliente
  private String servicio;

  // Constructor completo
  public Vehiculo(String marca, String modelo, int anio, Cliente propietario, String servicio) {
    setMarca(marca);
    setModelo(modelo);
    setAnio(anio);
    setPropietario(propietario);
    setServicio(servicio);
  }

  // Constructor básico (servicio por defecto)
  public Vehiculo(String marca, String modelo, int anio, Cliente propietario) {
    this(marca, modelo, anio, propietario, "Servicio general");
  }

  // Constructor mínimo (marca y modelo solo)
  public Vehiculo(String marca, String modelo) {
    this(marca, modelo, 2025, new Cliente("Cliente genérico"), "Servicio general");
  }

  // Getters
  public String getMarca() { return marca; }
  public String getModelo() { return modelo; }
  public int getAnio() { return anio; }
  public Cliente getPropietario() { return propietario; }
  public String getServicio() { return servicio; }

  // Setters con validaciones
  public void setMarca(String marca) {
    if (marca == null || marca.trim().isEmpty()) {
      throw new IllegalArgumentException("Marca no puede ser vacía");
    }
    this.marca = marca;
  }

  public void setModelo(String modelo) {
    if (modelo == null || modelo.trim().isEmpty()) {
      throw new IllegalArgumentException("Modelo no puede ser vacío");
    }
    this.modelo = modelo;
  }

  public void setAnio(int anio) {
    if (anio < 1900 || anio > 2050) {
      throw new IllegalArgumentException("Año fuera de rango");
    }
    this.anio = anio;
  }

  public void setPropietario(Cliente propietario) {
    if (propietario == null) {
      throw new IllegalArgumentException("Propietario no puede ser nulo");
    }
    this.propietario = propietario;
  }

  public void setServicio(String servicio) {
    if (servicio == null || servicio.trim().isEmpty()) {
      throw new IllegalArgumentException("Servicio no puede ser vacío");
    }
    this.servicio = servicio;
  }

  public String obtenerResumen() {
    return marca + " " + modelo + " (" + anio + ") - Servicio: " + servicio +
        " | Propietario: " + propietario.getNombre();
  }
}

