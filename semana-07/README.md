Semana 07 - Servicio, Modelo y Excepciones

📋 Información General

Semana: 07

Tema: Paquetes y Excepciones

Entrega: Repositorio GitHub personal

Peso en la evaluación: 100 pts

🎯 Objetivo

Reorganizar el sistema en paquetes profesionales, agregar validaciones con excepciones estándar, crear excepciones personalizadas y demostrar todo en un Main con casos de prueba.

📦 Estructura del Proyecto

src/
└── com/
└── recursoshumanos/
├── modelo/
│   ├── Empleado.java
│   ├── EmpleadoPlanta.java
│   └── EmpleadoContrato.java
├── servicio/
│   └── SistemaRH.java
├── excepciones/
│   ├── EmpleadoInvalidoException.java
│   └── DisponibilidadException.java
└── Main.java

📝 Cambios Realizados

Empleado convertido en clase abstracta con validaciones en el constructor.

EmpleadoPlanta y EmpleadoContrato implementan reglas específicas y validaciones.

SistemaRH gestiona empleados y lanza excepciones personalizadas.

Excepciones creadas:

EmpleadoInvalidoException

DisponibilidadException

Main demuestra casos exitosos y casos de error.

🧪 Casos de Prueba en Main

✅ Operación exitosa (empleado válido).

❌ Nombre inválido (lanza IllegalArgumentException).

❌ Salario negativo (lanza IllegalArgumentException).

❌ Cupo lleno (lanza DisponibilidadException).

✅ Recuperación después de error (empleado válido registrado tras error).

Ejemplo con finally para liberar recursos.

📊 Ejemplo de Salida

=== Sistema RH - Semana 07 ===

✅ Empleado registrado: Ana
❌ Error creando empleado: Nombre inválido
❌ Error creando empleado: Salario debe ser mayor a 0
❌ Error: No hay cupo disponible en el sistema
❌ Error: No hay cupo disponible en el sistema
✅ Empleado registrado correctamente después de error
Error leyendo archivo: Archivo no encontrado
Liberando recursos...

✅ Semana 07 completada: Servicio, Modelo y Excepciones

✅ Principios Aplicados

Encapsulación: atributos privados/protegidos con getters.

Validaciones: uso de IllegalArgumentException para datos inválidos.

Excepciones personalizadas: EmpleadoInvalidoException, DisponibilidadException para reglas de negocio.

Robustez: try-catch-finally en Main para manejar errores.

📊 Conclusiones

Se logró una estructura profesional de paquetes.

Se añadieron validaciones robustas.

Se implementaron excepciones personalizadas.

El Main demuestra casos exitosos y errores controlados.

El sistema ahora es más mantenible y extensible.