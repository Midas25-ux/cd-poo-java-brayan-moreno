# Polimorfismo - Semana 05

## 1. Sobrecarga (Overloading)
### Métodos sobrecargados
- `buscarEmpleado(String id)`
- `buscarEmpleado(String nombre, double salarioMinimo)`

### Justificación

La sobrecarga permite buscar empleados por diferentes criterios sin duplicar lógica.  
En el dominio de recursos humanos es común buscar por identificación o por condiciones salariales.  
Esto hace el sistema más flexible y reutilizable.



## 2. Sobrescritura (Overriding)
### Métodos sobrescritos
- `calcularSalario()`
- `obtenerDescripcion()`

### Tabla comparativa
| Método             | Clase Padre (`Empleado`) | `EmpleadoPlanta`                  | `EmpleadoContrato`                  |
|--------------------|---------------------------|-----------------------------------|-------------------------------------|
| calcularSalario()  | return salarioBase        | return salarioBase + bono         | return salarioBase                  |
| obtenerDescripcion() | "Empleado: nombre"      | "Empleado de Planta: nombre (años)" | "Empleado por Contrato: nombre (fecha)" |

### Justificación
Cada subclase redefine el comportamiento para adaptarse a su realidad:
- **Planta:** recibe bonos por antigüedad.
- **Contrato:** mantiene salario base y muestra fecha de fin de contrato.

### Ejemplo de código
```java
for (Empleado e : empleados) {
    System.out.println(e.obtenerDescripcion());
    System.out.println("Salario: $" + e.calcularSalario());
    System.out.println("Tipo real: " + e.getClass().getSimpleName());
    System.out.println("---");
}





