# Proyecto Bootcamp POO en Java

## 👤 Información del Estudiante
- **Nombre**: Brayan Moreno
- **Ficha**: [3228972 B]
- **Dominio**: Taller Mecanico AutoServicio Express
- **Fecha de entrega final**: 08/12/2025

---

## 📅 Resumen Semanal

### Semana 01 – Introducción a POO
- Creación de clases básicas (`Cliente`, `Mecanico`, `Servicio`).
- Atributos y métodos iniciales.
- Uso de `main` para instanciar objetos.

### Semana 02 – Constructores y Sobrecarga
- Implementación de constructores en `Cliente` y `Mecanico`.
- Sobrecarga de constructores (2 y 3 parámetros).
- Validaciones simples en constructores.

### Semana 03 – Encapsulación
- Todos los atributos privados.
- Métodos `get` y `set` con validaciones.
- Ejemplo: `precio > 0`, `nombre no vacío`.

### Semana 04 – Herencia y Polimorfismo
- Clase padre: `Empleado`.
- Clases hijas: `EmpleadoPlanta`, `EmpleadoContrato`.
- Uso de `super()` en constructores.
- Polimorfismo: sobrescritura de `calcularSalario()` y sobrecarga de métodos.

### Semana 05 – Abstracción
- Clase abstracta `Empleado`.
- Métodos abstractos implementados en las clases hijas.
- Introducción de interfaces para servicios adicionales.

### Semana 06 – Excepciones Personalizadas
- Creación de `ReservaDuplicadaException` y `ClienteInvalidoException`.
- Uso de `try-catch` en el menú principal.
- Validaciones robustas al agregar reservas.

### Semana 07 – Organización en Paquetes
- Paquete `modelo`: entidades (`Cliente`, `Reserva`, `Servicio`, `Mecanico`, `Reparacion`).
- Paquete `servicio`: lógica (`GestorReservas`, `GestorClientes`).
- Paquete `excepciones`: excepciones personalizadas.
- Paquete raíz: `Main.java`.

### Semana 08 – Colecciones y Estadísticas
- Migración de arrays a `ArrayList` y `HashMap`.
- Métodos de filtrado (`filtrarPorPrecio`, `filtrarPorMes`).
- Estadísticas (`calcularTotalVentas`, `calcularPromedioPrecio`, `obtenerReservaMasCara`, `contarPorTipo`).
- Menú interactivo en `Main5.java`.

### Semana 09 – Proyecto Final Integrador
- **Sistema completo y funcional** con menú de 9 opciones:
    1. Agregar cliente
    2. Agregar mecánico
    3. Agregar servicio
    4. Registrar reparación
    5. Registrar reserva
    6. Buscar reserva por código
    7. Listar todas las reservas
    8. Filtrar reservas por precio
    9. Ver estadísticas / Generar reporte
- **POO aplicada**: encapsulación, herencia, polimorfismo, abstracción, excepciones personalizadas.
- **Documentación**: README.md, Javadoc, diagrama UML.
- **Calidad de código**: buenas prácticas, organización en paquetes, nombres descriptivos.

---

## 🏗️ Arquitectura del Proyecto Final

proyecto-final/ 
├── src/com/recursoshumanos/ │ 
├── modelo/ # Entidades del negocio │ 
├── servicio/ # Lógica de negocio │ 
├── excepciones/ Excepciones personalizadas │ 
└── MainFinal.java # Menú integrador


---

## 🧬 Conceptos POO Aplicados
- **Encapsulación**: atributos privados + validaciones.
- **Herencia**: `Empleado` padre, `EmpleadoPlanta` y `EmpleadoContrato` hijos.
- **Polimorfismo**: sobrescritura (`toString`, `calcularSalario`) y sobrecarga (`agregarReserva`).
- **Abstracción**: clase abstracta `Empleado`.
- **Excepciones personalizadas**: `ReservaDuplicadaException`, `ClienteInvalidoException`.
- **Colecciones**: `HashMap` para búsquedas O(1), `ArrayList` para historial y filtrado.

---

## 🚀 Cómo Ejecutar
```bash
cd proyecto-final
javac -d bin src/com/recursoshumanos/*/*.java src/com/recursoshumanos/*.java
java -cp bin com.recursoshumanos.MainFinal

