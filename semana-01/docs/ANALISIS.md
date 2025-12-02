# Análisis Orientado a Objetos – Taller Mecánico

## 1. Identificación del Dominio

### Nombre del negocio: Taller Mecánico "AutoServicio Express"
### Tipo: Taller Mecánico Automotriz
### Descripción:
### AutoServicio Express es un taller mecánico especializado en mantenimiento y reparación de vehículos. Ofrece servicios mecánica general, electricidad automotriz, latonería y pintura. Cuenta con 8 mecánicos especializados y atiende aproximadamente 20 vehículos al día.

2. Objetos Identificados
   🛠 Objeto Principal: Mecanico
   ¿Qué es?

Un Mecánico es un empleado del taller responsable de ejecutar reparaciones o mantenimientos en los vehículos de los clientes.

Atributos identificados:

idMecanico : String – Código único para identificar al mecánico.

nombre : String – Nombre completo del mecánico.

correo : String – Correo de contacto laboral.

telefono : int – Número telefónico del mecánico.

direccion : String – Dirección de residencia.

especialidad : String – Área técnica en la que el mecánico está capacitado.

reparacionesRealizadas : int – Cantidad de reparaciones completadas por el mecánico.

Métodos identificados:

mostrarDatos() – Imprime todos los datos del mecánico.

registrarReparacion() – Aumenta en 1 el contador de reparaciones realizadas.

esMecanicoActivo() – Retorna si el mecánico está activo (si ha hecho al menos 1 reparación).

getNombre() – Retorna el nombre del mecánico.

🔧 Objeto Secundario: Servicio
¿Qué es?

Un Servicio es un trabajo técnico que el taller ofrece, como alineación, cambio de batería o revisión eléctrica.

Atributos identificados:

tipoServicio : String – Categoría del servicio (mecánico, eléctrico, etc.).

nombreServicio : String – Nombre específico del servicio.

precioServicio : double – Precio del servicio ofrecido.

descripcionServicio : String – Explicación detallada del servicio.

tiempoServicio : int – Duración estimada del servicio.

activo : boolean – Indica si el servicio está disponible.

Métodos identificados:

mostrarInfo() – Imprime toda la información del servicio.

Getters y Setters – Permiten acceder y modificar los atributos.

3. Relación entre Objetos
   Tipo de relación: Asociación simple
   Descripción:

En un taller mecánico, los servicios son realizados por los mecánicos, pero no existe una dependencia estricta entre ellos dentro de las clases.
La relación se representa dentro de la lógica del programa, cuando los mecánicos realizan reparaciones y se muestran junto con los servicios disponibles.

Ejemplo:
“El mecánico Juan puede realizar el servicio de Alineación o Cambio de batería según su especialidad, pero ambos objetos funcionan de forma independiente.”

4. Justificación del Diseño
   ¿Por qué elegí estos objetos?

Porque representan las dos entidades principales que necesita gestionar un taller real:

las personas que realizan los trabajos (mecánicos),

y los servicios que el taller ofrece a los clientes.

¿Por qué estos atributos son importantes?

En Mecanico:

idMecanico permite identificarlo.

especialidad evita asignar trabajos incorrectos.

reparacionesRealizadas permite conocer su experiencia y actividad.

En Servicio:

precioServicio es fundamental para cobrar al cliente.

descripcionServicio ayuda a entender qué incluye el trabajo.

activo permite saber si el servicio está disponible.

¿Por qué estos métodos son necesarios?

mostrarDatos() y mostrarInfo() → permiten visualizar la información en consola.

registrarReparacion() → simula la actividad del mecánico.

esMecanicoActivo() → muestra si el mecánico está trabajando o no.

Getters/Setters → permiten modificar atributos si es necesario.

5. Comparación: POO vs Programación Estructurada
   Sin POO (Estructurada):

El programa debería usar solo variables globales y funciones.
Ejemplo:

Arrays separados para nombres, correos, precios, tipos, etc.

Funciones que reciban muchos parámetros.

Alto riesgo de errores por mezclar información.

Desventajas:

Difícil de mantener.

Código repetido.

No hay agrupación lógica de datos.

Con POO:

Los datos están organizados en clases.

Cada objeto controla sus propios datos.

Reutilización de código.

Mejor legibilidad.

Ventajas específicas en mi dominio:

Cada mecánico y servicio está claramente representado.

Es más fácil agregar nuevos servicios o nuevos empleados.

La lógica del negocio (mostrar datos, registrar reparaciones, etc.) está encapsulada dentro de los objetos.

6. Diagrama de clase 

+------------------------------------+
|             Mecanico               |
+------------------------------------+
| - id: String                       |
| - nombre: String                   |
| - email: String                    |
| - telefono: int                    |
| - direccion: String                |
| - especialidad: String             |
| - reparacionesRealizadas: int      |
| - activo: boolean                  |
+------------------------------------+
| + Mecanico(id, nombre, email,      |
|            telefono, direccion,    |
|            especialidad, activo)   |
| + registrarReparacion(): void      |
| + mostrarDatos(): void             |
+------------------------------------+


            1        * 
Mecanico ---------------------- Servicio
(realiza)


+--------------------------------------------+
|                 Servicio                    |
+--------------------------------------------+
| - tipo: String                              |
| - nombre: String                            |
| - costo: double                             |
| - descripcion: String                       |
| - horas: int                                |
| - disponible: boolean                       |
+--------------------------------------------+
| + Servicio(tipo, nombre, costo,             |
|            descripcion, horas, disponible)  |
| + mostrarInfo(): void                       |
+--------------------------------------------+


+-----------------------------+
|            Main             |
+-----------------------------+
| + main(args: String[]):void|
+-----------------------------+
