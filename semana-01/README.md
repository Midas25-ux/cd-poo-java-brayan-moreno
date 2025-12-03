# Semana 01 - Taller Mecánico AutoServicio Express

## 📝 Descripción

Esta semana se implementó un sistema básico de gestión para un **taller mecánico** utilizando Programación Orientada a Objetos en Java.  
El programa incluye clases para representar vehículos, mecánicos y servicios del taller.  
También se creó un programa principal (`Main1`) que demuestra la interacción entre los objetos del dominio.

## 🎯 Objetivos Cumplidos

- [x] Implementar clase principal del dominio (`Servicio`)
- [x] Implementar clase secundaria relacionada (`Mecanico`)
- [x] Implementar clase adicional (`Autos`)
- [x] Crear programa de demostración con múltiples objetos
- [x] Mostrar estados, atributos y comportamiento de los objetos
- [x] Documentar análisis del dominio

## 📂 Archivos Entregados

- `src/Autos.java`  
  Clase que representa un vehículo del taller con atributos como placa, marca, modelo y año.

- `src/Mecanico.java`  
  Clase que modela la información de un mecánico, incluyendo su identificación, especialidad y cantidad de reparaciones realizadas.

- `src/Servicio.java`  
  Clase que describe un servicio del taller: tipo, precio, tiempo estimado y estado (activo/inactivo).

- `src/Main1.java`  
  Programa que crea varios vehículos, servicios y mecánicos, mostrando su información en consola.

- `docs/ANALISIS.md`  
  Documento con el análisis del dominio, entidades y relación entre los objetos.

## 🚀 Instrucciones de Ejecución

```bash
cd src
javac *.java
java Main1

