# Semana 03 - Encapsulación y Constructores

📋 **Información General**
- **Semana:** 03
- **Tema:** Encapsulación y Sobrecarga de Constructores
- **Puntuación Total:** 100 puntos
- **Entrega:** Repositorio GitHub personal

---

## 🎯 Objetivo
Refactorizar las clases del sistema del **Taller Mecánico** aplicando:
- Encapsulación completa (atributos privados, getters y setters con validaciones).
- Sobrecarga de constructores (mínimo 2 por clase).
- Validaciones en constructores y setters.
- Documentación de mejoras en `MEJORAS.md`.

---

## 📦 Estructura de Entrega

semana-03/ 
├── src/ │ 
├── Auto.java │ 
├── Cliente.java │ 
├── Mecanicos.java │ 
├── Servicio.java │ 
├── Reparacion.java │ 
├── TallerMecanico.java │ 
└── Main.java 
└── MEJORAS.md


---

## 📝 Ejercicio 1: Encapsulación Completa (30 puntos)
- Todos los atributos declarados como `private`.
- Getters para todos los atributos.
- Setters con validaciones (ejemplo: precios positivos, nombres no vacíos).
- Métodos auxiliares privados para validaciones internas.

---

## 📝 Ejercicio 2: Sobrecarga de Constructores (25 puntos)
- Cada clase principal (`Cliente`, `Servicio`, `Auto`, `Mecanicos`) tiene al menos 2 constructores.
- Ejemplo:
    - Constructor completo con todos los atributos.
    - Constructor básico con valores por defecto.
    - Constructor mínimo con un solo atributo clave.

---

## 📝 Ejercicio 3: Validaciones (25 puntos)
- Strings no nulos ni vacíos (`nombre`, `tipo`, `correo`).
- Números positivos (`precio`, `duracionHoras`, `anio`).
- Rango válido (`anio` del auto, edad si aplica).
- Formatos correctos (`email` debe contener `@`, teléfono con longitud mínima).

---

## 📝 Ejercicio 4: Documento `MEJORAS.md` (20 puntos)
Ejemplo de contenido:

```markdown
# Mejoras - Semana 03

## Encapsulación Aplicada
### Clase: Cliente
- Atributos encapsulados: nombre, email, telefono, direccion
- Validaciones: nombre no vacío, email válido, teléfono mínimo 7 dígitos

### Clase: Servicio
- Atributos encapsulados: tipo, nombre, precio, descripcion, duracionHoras, disponible
- Validaciones: precio positivo, duración mayor a 0, nombre y tipo no vacíos

## Constructores Sobrecargados
### Clase: Cliente
- Constructor completo: recibe todos los datos
- Constructor básico: nombre y email, asigna valores por defecto
- Constructor mínimo: solo nombre, genera email automático

### Clase: Servicio
- Constructor completo: recibe todos los datos
- Constructor básico: nombre y precio, asigna valores por defecto
- Constructor mínimo: solo nombre, asigna precio y descripción básica

## Beneficios Logrados
- Código más seguro y robusto gracias a validaciones
- Flexibilidad al crear objetos con distintos niveles de información
- Encapsulación que protege los atributos y evita inconsistencias

## Ejemplo de encapsulacion 

=== SISTEMA DE GESTIÓN DE TALLER MECÁNICO ===

Cliente creado: Carlos López | Email: carlos@gmail.com | Tel: 312456789
Servicio creado: Alineación | Precio: $45,000.00
Reparación registrada: ID 1 | Cliente: Carlos López | Servicio: Alineación | Estado: Pendiente

Estado actualizado: Finalizada
Total reparaciones en Taller Los Expertos: 1
