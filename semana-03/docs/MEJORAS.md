# Mejoras - Semana 03

## Encapsulación Aplicada

### Clase: Cliente
- Atributos encapsulados: nombre, email, telefono, direccion
- Validaciones agregadas: nombre no vacío, email con '@', teléfono mínimo 7 dígitos

### Clase: Servicio
- Atributos encapsulados: tipo, nombre, precio, descripcion, duracionHoras, disponible
- Validaciones agregadas: precio positivo, duración mayor a 0, nombre y tipo no vacíos

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
