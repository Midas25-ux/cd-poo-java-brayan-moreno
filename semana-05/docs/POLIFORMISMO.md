# Polimorfismo - Semana 05

## 1. Sobrecarga (Overloading)
### Métodos sobrecargados
- `buscarEmpleado(String id)`
- `buscarEmpleado(String nombre, double salarioMinimo)`

### Justificación
Permite buscar empleados por diferentes criterios sin duplicar lógica.  
En el dominio de recursos humanos es común buscar por identificación o por condiciones salariales.

---

## 2. Sobrescritura (Overriding)
### Métodos sobrescritos
- `calcularSalario()`
- `obtenerDescripcion()`

### Tabla comparativa
| Método             | Clase Padre (`Empleado`) | `EmpleadoPlanta`                  | `EmpleadoContrato`                  |
|--------------------|---------------------------|-----------------------------------|-------------------------------------|
| calcularSalario()  | return salarioBase        | return salarioBase + bono         | return salarioBase                  |
| obtenerDescripcion() | "Empleado: nombre"      | "Empleado de Planta: nombre (años)" | "Empleado por Contrato: nombre (fecha)" |

---

## 3. Polimorfismo Dinámico
### Ejemplo
```java
for (Empleado e : empleados) {
    System.out.println(e.obtenerDescripcion());
    System.out.println("Salario: $" + e.calcularSalario());
}

Explicación
Aunque el array es de tipo Empleado, cada objeto ejecuta el método sobrescrito de su subclase real (EmpleadoPlanta o EmpleadoContrato). Esto demuestra dynamic binding: la decisión de qué método ejecutar se hace en tiempo de ejecución.

4. Beneficios
Reutilización de código con métodos comunes en la clase padre.

Flexibilidad para extender el sistema con nuevos tipos de empleados.

Polimorfismo dinámico que permite tratar objetos diferentes de forma uniforme.

Sin polimorfismo, sería necesario escribir múltiples condicionales para cada tipo de empleado.


---

✅ Con esto tienes tu entrega de la **Semana 05 completa**:  
- README.md con explicación y ejemplo.  
- POLIMORFISMO.md con sobrecarga, sobrescritura, polimorfismo dinámico y beneficios.  

¿Quieres que te prepare también el **código de `SistemaRH.java` y `Main.java` listo para compilar**, con las sobrecargas y polimorfismo funcionando?

