# Semana 02 - Clases y Objetos

📋 **Información General**
- **Semana:** 02
- **Tema:** Fundamentos de Clases y Objetos
- **Puntuación Total:** 100 puntos
- **Modalidad:** Individual
- **Entrega:** Repositorio GitHub personal

---

## 🎯 Objetivo
Expandir el sistema del **Taller Mecánico** agregando nuevas clases, creando relaciones entre objetos y usando colecciones básicas (`ArrayList`).

---

## 📦 Estructura de Entrega

semana-02/ 
├── README.md 
├── Cliente.java 
├── Reparacion.java 
├── TallerMecanico.java 
└── Main.java


---

## 📝 Ejercicio 1: Nuevas Clases (30 puntos)

### Clase `Cliente`
- Atributos: `nombre`, `correo`, `telefono`
- Constructor completo y sobrecargado
- Métodos: `obtenerInfo()`
- Encapsulación con getters y setters

### Clase `Reparacion`
- Relación con `Cliente`, `Mecanicos`, `Servicio`
- Atributos: `id`, `fecha`, `estado`
- Métodos: `calcularCosto()`, `obtenerResumen()`, `actualizarEstado()`

---

## 📝 Ejercicio 2: Relaciones (25 puntos)
- `Reparacion` conecta **Cliente + Mecánico + Servicio**.
- Ejemplo: una reparación pertenece a un cliente, la realiza un mecánico y está asociada a un servicio.

---

## 📝 Ejercicio 3: Uso de ArrayList (20 puntos)

### Clase `TallerMecanico`
- Atributos: `nombre`, `ArrayList<Reparacion>`
- Métodos: `agregarReparacion()`, `mostrarReparaciones()`, `contarReparaciones()`

---

## 📝 Ejercicio 4: Main Completo (25 puntos)

### `Main.java`
- Crear objetos de `Cliente`, `Mecanicos`, `Servicio`
- Crear reparaciones y asociarlas
- Usar `TallerMecanico` para gestionar la lista de reparaciones
- Mostrar resultados en consola

---

## 🧪 Ejemplo de Ejecución

=== SISTEMA DE GESTIÓN DE TALLER MECÁNICO ===

=== Reparaciones en Taller Los Expertos === ID: 1 | Reparación: Alineación | Cliente: Carlos López | Mecánico: Juan Perez | Fecha: 2025-12-07 | Estado: Finalizada | Costo: $45,000.00 ID: 2 | Reparación: Cambio de batería | Cliente: Ana Torres | Mecánico: Luis Gómez | Fecha: 2025-12-08 | Estado: Pendiente | Costo: $120,000.00

Total reparaciones: 2


---

## ✅ Conclusiones
- Se aplicaron **clases y objetos** con atributos y métodos.
- Se implementaron **relaciones** entre entidades del dominio.
- Se usó **ArrayList** para manejar colecciones dinámicas.
- El sistema quedó modular y escalable para futuras mejoras (Semana 03: Encapsulación y Constructores).  
