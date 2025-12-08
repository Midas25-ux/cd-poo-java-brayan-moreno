# Jerarquía de Clases - Semana 04

## Diagrama
Empleado
|
+----+----+
|         |
EmpleadoPlanta   EmpleadoContrato

## Justificación
Se eligió la jerarquía de **Empleado** porque en un taller mecánico o empresa existen diferentes tipos de empleados.  
La clase padre `Empleado` contiene atributos y métodos comunes (nombre, identificación, salario base).  
Las subclases (`EmpleadoPlanta`, `EmpleadoContrato`) representan variaciones en el cálculo del salario según su tipo de contratación.

## Atributos Heredados
- nombre (String)
- identificacion (String)
- salarioBase (double)

## Métodos Sobrescritos
- `calcularSalario()`:
    - En `EmpleadoPlanta` se añade un bono por años de antigüedad.
    - En `EmpleadoContrato` se mantiene el salario base sin bonos.

## Beneficios
- Reutilización de código gracias a la herencia.
- Flexibilidad para extender el sistema con nuevos tipos de empleados.
- Polimorfismo que permite tratar a todos los empleados de forma uniforme.
