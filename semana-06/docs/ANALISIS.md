# Análisis de Diseño - Semana 06: Taller Mecánico

## 1. Identificación de Abstracciones

### Clase Abstracta: EmpleadoAbstracto
**¿Por qué es abstracta?**
- Representa cualquier empleado del taller.
- Todos tienen nombre, identificación y salario base.
- El cálculo de salario varía según el tipo de empleado.

**Jerarquía:**
EmpleadoAbstracto
├── Mecanico
├── Administrador
└── MecanicoSenior

---

## 2. Interfaces Implementadas

### Interface 1: Capacitacion
**Capacidad que define:** Permite que un empleado pueda recibir o impartir capacitación.
**Clases que la implementan:**
- MecanicoSenior: Necesita capacitarse y registrar horas.

### Interface 2: AtencionCliente
**Capacidad que define:** Permite que un empleado pueda atender clientes y registrar reclamos.
**Clases que la implementan:**
- MecanicoSenior: Interactúa directamente con clientes.

---

## 3. Decisiones de Diseño

**Clase Abstracta vs Interface**
- Abstracta: "es-un" relación, comparte atributos y algunos métodos concretos.
- Interface: "puede hacer" relación, permite múltiples implementaciones independientes de jerarquía.

---

## 4. Principios SOLID Aplicados

- **SRP:** Cada clase tiene responsabilidad única (empleado, administrador, mecánico senior).
- **OCP:** Se pueden agregar nuevos tipos de empleados sin modificar los existentes.
- **LSP:** Subclases pueden sustituir la clase abstracta sin romper el comportamiento.
- **ISP:** Interfaces específicas para capacidades concretas (Capacitacion, AtencionCliente).
- **DIP:** Dependencia de abstracciones (empleado abstracto e interfaces) en lugar de implementaciones concretas.

---

## 5. Mejoras Logradas

**Antes (Semana 05):**
- Polimorfismo solo con clases concretas.
- Duplicación de métodos de información y cálculos de salario.

**Después (Semana 06):**
- Clase abstracta centraliza comportamiento común.
- Interfaces separan capacidades independientes.
- Diseño flexible, escalable y alineado a SOLID.

---

## 6. Diagrama de Clases

       <<abstract>>
    EmpleadoAbstracto
     /       |       \
Mecanico  Administrador  MecanicoSenior
/      \
implements Capacitacion
implements AtencionCliente
