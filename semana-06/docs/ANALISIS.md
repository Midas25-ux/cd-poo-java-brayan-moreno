# Análisis de Diseño - Semana 06: Sistema de Recursos Humanos

## 1. Identificación de Abstracciones

### Clase Abstracta: `Empleado`
**¿Por qué es abstracta?**
- Representa el concepto general de empleado en la organización.
- Todos los empleados tienen atributos comunes (`nombre`, `identificación`, `salarioBase`).
- El cálculo del salario y la forma de mostrar información varían según el tipo de empleado.
- Por eso se definieron métodos abstractos:
    - `calcularSalario()`
    - `mostrarInfo()`

**Jerarquía:**

<<abstract>> Empleado 
| +-------------------+ |
| EmpleadoPlanta EmpleadoContrato


## 2. Interfaces Implementadas

### Interface 1: `Pagable`
**Capacidad que define:**
- Representa la capacidad de procesar pagos y verificar si hay pagos pendientes.

**Clases que la implementan:**
- `EmpleadoPlanta`: porque recibe pagos mensuales y puede tener bonos.
- `EmpleadoContrato`: porque también requiere gestión de pagos periódicos.

---

### Interface 2: `Reportable`
**Capacidad que define:**
- Permite generar reportes y exportar datos de empleados.

**Clases que la implementan:**
- `EmpleadoPlanta`: genera reportes de antigüedad y bonos.
- `EmpleadoContrato`: genera reportes de contratos vigentes.

---

### Interface 3 (opcional): `Bonificable`
**Capacidad que define:**
- Permite calcular bonos adicionales y verificar elegibilidad.

**Clases que la implementan:**
- `EmpleadoPlanta`: porque recibe bonos por antigüedad.
- `EmpleadoContrato`: no aplica, por eso no la implementa.

---

## 3. Decisiones de Diseño

### ¿Por qué Clase Abstracta vs Interface?
- **Clase abstracta (`Empleado`)**:
    - Existe una relación clara de tipo *“es-un”*.
    - Comparte atributos (`nombre`, `identificación`, `salarioBase`).
    - Tiene comportamiento común (`mostrarInfoBasica()`).

- **Interfaces (`Pagable`, `Reportable`, `Bonificable`)**:
    - Definen capacidades transversales que no dependen de la jerarquía.
    - Permiten múltiple implementación.
    - Solo definen contratos, no lógica.

---

## 4. Principios SOLID Aplicados

- **SRP (Single Responsibility Principle):**  
  Cada clase tiene una sola responsabilidad:
    - `EmpleadoPlanta`: manejar empleados de planta.
    - `EmpleadoContrato`: manejar empleados por contrato.
    - Interfaces separan responsabilidades de pago, reporte y bonos.

- **OCP (Open/Closed Principle):**  
  El sistema está abierto a extensión (nuevos tipos de empleados) pero cerrado a modificación (no se cambia la clase base).

- **LSP (Liskov Substitution Principle):**  
  Cualquier subclase (`EmpleadoPlanta`, `EmpleadoContrato`) puede sustituir a `Empleado` sin romper el sistema.

- **ISP (Interface Segregation Principle):**  
  Las interfaces son específicas (`Pagable`, `Reportable`, `Bonificable`) y no obligan a implementar métodos innecesarios.

- **DIP (Dependency Inversion Principle):**  
  El sistema depende de abstracciones (`Empleado`, `Pagable`, `Reportable`) y no de implementaciones concretas.

---

## 5. Mejoras Logradas

**Antes (Semana 05):**
- `Empleado` era una clase concreta.
- Métodos comunes estaban duplicados en subclases.
- No había separación clara de capacidades transversales.

**Después (Semana 06):**
- `Empleado` es abstracta → polimorfismo más claro.
- Interfaces (`Pagable`, `Reportable`, `Bonificable`) → capacidades reutilizables.
- Código más extensible y mantenible.
- Aplicación de principios SOLID.

---

## 6. Diagrama de Clases

<<abstract>> Empleado

nombre

identificacion

salarioBase

calcularSalario() : double

mostrarInfo() : void

mostrarInfoBasica() : void 
| +-------------------+ | 
| EmpleadoPlanta EmpleadoContrato 
implements Pagable, Reportable, Bonificable 
implements Pagable, Reportable


---

## 7. Desafíos y Soluciones

**Desafío 1:** Error de tipos (`LocalDate` vs `int`).  
**Solución:** Ajustar constructor de `EmpleadoContrato` para aceptar `LocalDate` o convertir `int` a fecha con `LocalDate.now().plusYears()`.

**Desafío 2:** Métodos con `@Override` que no existían en la clase padre.  
**Solución:** Definir `mostrarInfo()` en `Empleado` como abstracto y sobrescribir en subclases.

---

## 8. Próximos Pasos

- Agregar más interfaces (ej. `Auditable`, `Serializable`).
- Implementar persistencia de empleados en base de datos.
- Crear diagramas UML gráficos para documentación.
- Extender el sistema con nuevos tipos de empleados (ej. `EmpleadoTemporal`).  
