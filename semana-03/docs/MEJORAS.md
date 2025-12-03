# Mejoras - Semana 03

## Encapsulación Aplicada

### Clase: Cliente
- Atributos encapsulados: nombre, telefono, correo
- Validaciones agregadas:
    - Nombre no vacío
    - Teléfono válido (7-15 dígitos)
    - Correo contiene "@"

### Clase: Vehiculo
- Atributos encapsulados: marca, modelo, anio, propietario, servicio
- Validaciones agregadas:
    - Marca y modelo no vacíos
    - Año entre 1900 y 2050
    - Propietario no nulo
    - Servicio no vacío

### Clase: TallerMecanico
- Atributos encapsulados: nombre, vehiculos
- Validaciones agregadas:
    - Nombre del taller no vacío

## Constructores Sobrecargados

### Clase: Cliente
- Constructor completo: nombre, teléfono, correo
- Constructor básico: nombre, correo (teléfono por defecto)
- Constructor mínimo: solo nombre (correo generado automáticamente)

### Clase: Vehiculo
- Constructor completo: marca, modelo, año, propietario, servicio
- Constructor básico: marca, modelo, año, propietario (servicio por defecto)
- Constructor mínimo: marca y modelo solo (propietario y servicio por defecto)

## Beneficios Logrados
- Control total sobre los datos internos (encapsulación)
- Prevención de errores con validaciones
- Flexibilidad al crear objetos con distintos niveles de información
