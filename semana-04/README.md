# Semana 04 - Herencia y Polimorfismo

📋 **Información General**
- **Semana:** 04
- **Tema:** Herencia y Polimorfismo
- **Puntuación Total:** 100 puntos
- **Entrega:** Repositorio GitHub personal

---

## 🎯 Objetivo
Implementar herencia en el sistema, creando una clase padre y subclases que sobrescriban métodos.  
Demostrar polimorfismo mediante el uso de arrays de objetos y métodos sobrescritos.

---

## 📦 Estructura de Entrega

semana-04/ 
├── src/ │ 
├── Empleado.java │ 
├── EmpleadoPlanta.java │
├── EmpleadoContrato.java │ 
└── Main.java 
└── JERARQUIA.md


---

## 📝 Ejercicio 1: Clase Padre (25 puntos)

### Clase `Empleado`
- Atributos `protected`: `nombre`, `identificacion`, `salarioBase`.
- Constructor completo.
- Métodos heredables:
    - `mostrarInfo()`
    - `calcularSalario()`

---

## 📝 Ejercicio 2: Subclases (30 puntos)

### Clase `EmpleadoPlanta`
- Atributo adicional: `anosAntiguedad`.
- Sobrescribe `calcularSalario()` para incluir bono del 5% por cada año de antigüedad.

### Clase `EmpleadoContrato`
- Atributo adicional: `mesesContrato`.
- Sobrescribe `calcularSalario()` manteniendo solo el salario base.

---

## 📝 Ejercicio 3: Implementación Correcta (25 puntos)
- Uso de `extends` en subclases.
- Llamada a `super()` en constructores.
- Uso de `@Override` en métodos sobrescritos.
- Atributos `protected` en la clase padre para permitir acceso controlado en subclases.

---

## 📝 Ejercicio 4: Polimorfismo (20 puntos)

### `Main.java`
- Se crea un array polimórfico de tipo `Empleado`.
- Se instancian objetos de `EmpleadoPlanta` y `EmpleadoContrato`.
- Se recorre el array mostrando información y calculando salarios con polimorfismo en acción.

---

## 🧪 Ejemplo de Ejecución

Empleado: Ana ID: E001 Salario: $2500000.0

Empleado: Luis ID: E002 Salario: $1500000.0

Empleado: María ID: E003 Salario: $2875000.0


---

## 📄 Documento `JERARQUIA.md`
Incluye:
- Diagrama de jerarquía:

Empleado | +---+---+ | 
| EmpleadoPlanta 
EmpleadoContrato

- Justificación de la jerarquía elegida.
- Atributos heredados.
- Métodos sobrescritos y diferencias.

---

## ✅ Conclusiones
- Se aplicó herencia para reutilizar atributos y métodos comunes.
- Se implementaron subclases con comportamientos específicos.
- Se demostró polimorfismo al tratar diferentes tipos de empleados de forma uniforme.
- El sistema ahora es más extensible y escalable para futuros tipos de empleados.  
