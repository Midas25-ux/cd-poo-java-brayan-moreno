package com.recursoshumanos.excepciones;

/**
 * Excepción lanzada cuando un empleado no cumple requisitos.
 */
public class EmpleadoInvalidoException extends Exception {
  public EmpleadoInvalidoException(String mensaje) {
    super(mensaje);
  }
  public EmpleadoInvalidoException(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
