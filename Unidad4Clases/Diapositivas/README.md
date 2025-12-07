# 🧠 Actividades de Programación en Java

Este repositorio contiene una colección de actividades desarrolladas en Java como parte del aprendizaje de programación orientada a objetos.  
Cada actividad representa un caso práctico diferente, aplicando conceptos como clases, relaciones, colecciones, herencia, y estructuras de datos.

---

## 📁 Estructura del proyecto

```
src/
├── Actividades/ ← Actividades principales (1–9)
├── Clase/ ← Clases de prueba realizadas en clase presencial
├── Prueba/ ← Ejercicios y pruebas adicionales
├── Utilities/ ← Utilidades personalizadas (Table, MC, etc.)
```
---

## 📂 Actividades

### 🔹 Actividad 1 – Cuenta Corriente
- Clases: `Persona`, `CuentaCorriente`
- Atributos como nombre, DNI, fecha de nacimiento, género, estado civil.
- Impresión en consola con `Utilities.Table`.

### 🔹 Actividad 2 – Persona, Fecha y Ciudad
- Clases: `Persona`, `Fecha`, `Ciudad`
- Asociación entre persona y sus ciudades de nacimiento y residencia.
- Impresión tabular y títulos con `Utilities.MC`.

### 🔹 Actividad 3 – Sistema de Suministros
- Clases: `Categoria`, `Pieza`, `Proveedor`, `Suministra`
- Relación entre proveedor y piezas suministradas.
- Uso de `toString()` para mostrar relaciones.

### 🔹 Actividad 4 – Sistema Editorial
- Clases: `Revista`, `Periodista`, `Ejemplar`, `Seccion`, `Sucursal`, `Empleado`
- Relaciones: `Publica` (sucursal–revista), `Escribe` (periodista–revista)
- Modelado completo de un sistema editorial.

### 🔹 Actividad 5 – Sistema Académico
- Clases: `Profesor`, `Alumno`, `Modulo`, `Cursa`
- Relaciones: `imparte`, `cursa`, `delegado`
- Simulación de asignación de módulos y delegados.

### 🔹 Actividad 6 – Sistema de Reservas de Viajes
- Clases: `Turista`, `Hotel`, `Reserva`, `Sucursal`, `Vuelo`
- Relaciones basadas en un diagrama E-R.
- Impresión con `Utilities.Table`.

### 🔹 Actividad 7 – Empresa Ferroviaria
- Clases: `Maquinista`, `Mecánico`, `Locomotora`, `Vagón`, `Tren`
- Métodos para agregar vagones y mostrar el tren completo.

### 🔹 Actividad 8 – Biblioteca
- Clases: `Biblioteca`, `Usuario`, `Libro`, `Autor`
- Préstamos, devoluciones, búsqueda por autor y categoría.
- Uso de `ArrayList` y validación de préstamos repetidos.

### 🔹 Actividad 9 – Juego del Adivino de Cartas
- Clases: `Carta`, `Mazo`, `Jugador`, `Juego`
- Predicción de si la siguiente carta será mayor o menor.
- Sistema de puntuación y rondas.
- Representación visual de cartas en consola.

---

## ⚙️ Tecnologías utilizadas

- **Java 25**
- **Colecciones (`ArrayList`)**
- **POO (Programación Orientada a Objetos)**
- **Utilidades personalizadas (`Utilities.Table`, `Utilities.MC`)**