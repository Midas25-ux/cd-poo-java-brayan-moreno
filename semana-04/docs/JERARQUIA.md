# Jerarquía de Clases - Semana 04

## Diagrama
Empleado
|
+----+----+
|         |
Mecanico Administrador

## Justificación
Elegí esta jerarquía porque en un taller mecánico todos los empleados comparten atributos y métodos generales como nombre, identificación y salario. Las subclases `Mecanico` y `Administrador` representan roles específicos con cálculos de salario distintos según experiencia o nivel jerárquico.

## Atributos Heredados
- nombre (String)
- identificacion (String)
- salarioBase (double)

## Métodos Sobrescritos
- calcularSalario():
    - `Mecanico`: incluye bono por años de experiencia.
    - `Administrador`: incluye bono según nivel jerárquico.
