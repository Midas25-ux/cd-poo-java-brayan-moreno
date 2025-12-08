# Semana 06 - Abstracción e Interfaces

📋 **Información General**
- **Semana:** 06
- **Tema:** Abstracción e Interfaces
- **Entrega:** Repositorio GitHub personal
- **Peso en la evaluación:** 40% del producto semanal

---

## 🎯 Objetivo
Refactorizar el sistema de Recursos Humanos aplicando **clases abstractas** e **interfaces**, mejorando el diseño y aplicando principios SOLID.

---

## 📦 Estructura del Proyecto

semana-06/ 
├── README.md 
├── abstractas/ 
│ └── Empleado.java
├── interfaces/ │ 
├── Pagable.java │
├── Reportable.java │ 
└── Bonificable.java 
├── implementaciones/ │ 
├── EmpleadoPlanta.java │ 
├── EmpleadoContrato.java │ 
├── Main.java 
├── ANALISIS.md


---

## 📝 Cambios Realizados
- `Empleado` convertido en **clase abstracta** con métodos abstractos `calcularSalario()` y `mostrarInfo()`.
- Creación de interfaces:
    - **Pagable** → gestión de pagos.
    - **Reportable** → generación de reportes.
    - **Bonificable** → cálculo de bonos.
- Subclases (`EmpleadoPlanta`, `EmpleadoContrato`) implementan las interfaces según sus capacidades.
- `Main.java` demuestra:
    - Polimorfismo con la clase abstracta.
    - Uso de referencias de tipo interface.
    - Múltiple implementación en `EmpleadoPlanta`.

---

## 🧪 Ejemplo de Ejecución

=== SISTEMA DE RECURSOS HUMANOS ===

Empleado de Planta: Ana | Antigüedad: 5 años Salario: $3750000.0

Empleado por Contrato: Luis | Contrato hasta: 2026-12-31 Salario: $1500000.0

=== DEMOSTRACIÓN DE INTERFACES === 
Pago procesado para María Reporte generado para empleado de planta: María Bono calculado: $250000.0


---

## ✅ Principios SOLID Aplicados
- **SRP:** Cada clase tiene una sola responsabilidad.
- **OCP:** El sistema está abierto a extensión (nuevos tipos de empleados) pero cerrado a modificación.
- **LSP:** Las subclases pueden sustituir a la clase abstracta sin romper el sistema.
- **ISP:** Interfaces específicas evitan métodos innecesarios.
- **DIP:** El sistema depende de abstracciones (`Empleado`, `Pagable`, `Reportable`) y no de implementaciones concretas.

---

## 📊 Conclusiones
- Se aplicó **abstracción** para generalizar el concepto de empleado.
- Se implementaron **interfaces** para capacidades transversales.
- Se demostró **polimorfismo dinámico** y **múltiple implementación**.
- El diseño ahora es más **extensible, mantenible y claro**.  
