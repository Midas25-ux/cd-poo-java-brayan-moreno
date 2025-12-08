# Semana 05 - Polimorfismo

📋 **Información General**
- **Semana:** 05
- **Tema:** Polimorfismo (Sobrecarga y Sobrescritura)
- **Puntuación Total:** 100 puntos
- **Entrega:** Repositorio GitHub personal

---

## 🎯 Objetivo
Aplicar sobrecarga y sobrescritura de métodos para implementar polimorfismo en el sistema de empleados.  
Demostrar polimorfismo dinámico mediante arrays y métodos polimórficos.

---

## 📦 Estructura de Entrega

semana-05/ 
├── src/ │ 
├── Empleado.java │ 
├── EmpleadoPlanta.java │ 
├── EmpleadoContrato.java │ 
├── SistemaRH.java │ 
└── Main.java 
└── POLIMORFISMO.md


---

## 📝 Ejercicio 1: Sobrecarga de Métodos (25 puntos)
- Implementada en `SistemaRH`:
    - `buscarEmpleado(String id)`
    - `buscarEmpleado(String nombre, double salarioMinimo)`
- Permite buscar empleados por diferentes criterios.

---

## 📝 Ejercicio 2: Sobrescritura de Métodos (25 puntos)
- `EmpleadoPlanta` sobrescribe:
    - `calcularSalario()` → incluye bono por antigüedad.
    - `obtenerDescripcion()` → descripción con años de antigüedad.
- `EmpleadoContrato` sobrescribe:
    - `calcularSalario()` → mantiene salario base.
    - `obtenerDescripcion()` → descripción con fecha fin de contrato.

---

## 📝 Ejercicio 3: Métodos Polimórficos (25 puntos)
- En `SistemaRH`:
    - `agregarEmpleado(Empleado e)`
    - `procesarNomina(Empleado e)`
    - `generarReporte()`
- Todos aceptan la clase padre `Empleado` y funcionan con cualquier subclase.

---

## 📝 Ejercicio 4: Demostración Completa en Main (25 puntos)
- Se crea un `ArrayList<Empleado>` con objetos de diferentes subclases.
- Se recorren con bucles mostrando información y salarios.
- Se demuestra **dynamic binding**: las llamadas a `calcularSalario()` y `obtenerDescripcion()` ejecutan la versión correspondiente a la subclase real.

---

## 🧪 Ejemplo de Ejecución

Empleado agregado: Empleado de Planta: Ana García (5 años) Empleado agregado: Empleado por Contrato: Carlos Pérez (hasta 2024-12-31) Empleado agregado: Empleado de Planta: María López (10 años)

=== NÓMINA MENSUAL === Procesando pago para: Ana García Salario: $3750000.0

Procesando pago para: Carlos Pérez Salario: $2500000.0

Procesando pago para: María López Salario: $5250000.0

TOTAL: $11500000.0

=== REPORTE DE EMPLEADOS === 

Empleado de Planta: Ana García (5 años) 
Salario: $3750000.0 

Empleado por Contrato: Carlos Pérez 
(hasta 2024-12-31) 
Salario: $2500000.0 

Empleado de Planta: María López (10 años) 
Salario: $5250000.0


---

## ✅ Conclusiones
- Se aplicó **sobrecarga** para búsquedas flexibles.
- Se implementó **sobrescritura** para personalizar comportamiento en subclases.
- Se demostró **polimorfismo dinámico** con arrays y métodos polimórficos.
- El sistema ahora es más extensible y adaptable a diferentes tipos de empleados.  

