# Polimorfismo - Semana 05

## 1. Sobrecarga (Overloading)
### Métodos:
- `buscarVehiculo(String marca)`
- `buscarVehiculo(String marca, String modelo)`

### Justificación:
Permite buscar vehículos por diferentes criterios sin crear métodos con nombres distintos.

---

## 2. Sobrescritura (Overriding)
### Métodos sobrescritos con @Override

| Método           | Clase Padre | Subclase 1  | Subclase 2     |
|-----------------|------------|------------|----------------|
| calcularSalario() | Empleado   | Mecanico   | Administrador |
| obtenerDescripcion() | Empleado | Mecanico | Administrador |

---

## 3. Polimorfismo dinámico
### Ejemplo:
```java
Empleado emp = new Mecanico("Juan", "M001", 1500000, 5);
System.out.println(emp.calcularSalario());  // Llama a Mecanico.calcularSalario()
