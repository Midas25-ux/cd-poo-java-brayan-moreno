# Semana 08 - Colecciones y Programación Genérica

## 📋 Información General
- **Semana:** 08
- **Tema:** Uso de ArrayList, HashMap, filtrado y estadísticas
- **Entrega:** Repositorio GitHub personal
- **Peso en la evaluación:** 100 pts

---

## 🎯 Objetivo
Migrar arrays a colecciones genéricas (`ArrayList<E>`), implementar `HashMap<K,V>` para búsquedas rápidas, añadir filtrado y estadísticas, y demostrar todo en un `Main` con menú interactivo.

---

## 📦 Estructura del Proyecto

src/ 
└── com/ 
└── recursoshumanos/ 
├── modelo/ │ 
├── Cliente.java │ 
└── Reserva.java 
├── servicio/ │ 
└── GestorReservas.java 
└── Main5.java


---

## 📝 Cambios Realizados
- **Cliente.java**
    - Sobrecarga de constructores (2 y 3 parámetros).
    - Atributos: `id`, `nombre`, `correo`.
    - Métodos: `getId()`, `getNombre()`, `getCorreo()`.
- **Reserva.java**
    - Entidad con atributos: `codigo`, `cliente`, `fecha`, `precio`, `tipo`.
    - Métodos getters y `toString()`.
- **GestorReservas.java**
    - Migración de arrays a `ArrayList<Reserva>`.
    - Implementación de `HashMap<String, Reserva>` para búsqueda O(1).
    - Segundo `HashMap<String, List<Reserva>>` para agrupar reservas por cliente.
    - Métodos de filtrado (`filtrarPorPrecio`, `filtrarPorMes`).
    - Métodos de estadísticas (`calcularTotalVentas`, `calcularPromedioPrecio`, `obtenerReservaMasCara`, `contarPorTipo`).
- **Main5.java**
    - Menú interactivo con opciones para CRUD, búsqueda, filtrado y estadísticas.
    - Demostración de uso de `ArrayList` y `HashMap`.

---

## 🧪 Casos de Prueba en Main5
1. ✅ Agregar reserva con cliente válido.
2. ✅ Buscar reserva por código (HashMap O(1)).
3. ✅ Filtrar reservas por rango de precio.
4. ✅ Mostrar estadísticas: total, promedio, reserva más cara, conteo por tipo.
5. ✅ Eliminar reserva por código.
6. ✅ Menú interactivo con opciones claras.

---

## 📊 Ejemplo de Salida

=== SISTEMA DE GESTIÓN ===

Agregar reserva

Buscar por código

Filtrar por precio

Ver estadísticas

Eliminar reserva

Salir Opción: 1 Código: R001 Cliente ID: C001 Nombre cliente: Brayan Correo cliente: brayan@email.com Precio: 100000 ✅ Reserva agregada

=== ESTADÍSTICAS === Total reservas: 1 Total ventas: $100000.0 Promedio: $100000.0 Más cara: Reserva{codigo='R001', cliente=Cliente{id='C001', nombre='Brayan', correo='brayan@email.com'}, fecha=2025-12-08, precio=100000.0, tipo='General'}

Conteo por tipo: General: 1


---

## ✅ Principios Aplicados
- **Generics:** uso de `List<E>` y `Map<K,V>` sin tipos raw.
- **Encapsulación:** atributos privados con getters.
- **Robustez:** validación de duplicados en `HashMap`.
- **Iteración:** uso de `for-each` para recorrer colecciones.
- **Extensibilidad:** fácil agregar nuevos filtros o estadísticas.

---

## 📊 Conclusiones
- Se migraron arrays a colecciones genéricas (`ArrayList`).
- Se implementó `HashMap` para búsquedas rápidas y agrupación por cliente.
- Se añadieron métodos de filtrado y estadísticas.
- El `Main5` demuestra todas las funcionalidades con un menú interactivo.
- El sistema ahora es más **eficiente, mantenible y escalable**.
