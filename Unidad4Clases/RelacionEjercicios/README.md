# Relación de Ejercicios

Este repositorio contiene una serie de ejercicios de programación en **Java** orientados a la práctica de **POO (Programación Orientada a Objetos)**, modelado de clases y relaciones, y uso de utilidades para mostrar resultados en consola de forma clara y elegante.

---

## 📘 Actividad 1 – Clase País
- **Objetivo:** Crear una clase `Pais` con atributos `nombre`, `poblacion` y `PIB`.
- **Métodos:**
    - Constructor con parámetros.
    - Getters y setters.
    - `getPIBPerCapita()` → calcula el PIB per cápita como `(PIB * 100000) / población`.
    - `show()` → imprime los datos del país en formato tabular usando `Utilities.Table`.
- **Ejemplo de uso:** España, Perú y Francia con sus respectivos valores.

---

## 📗 Actividad 2 – Clase Racional
- **Objetivo:** Implementar una clase `Racional` para representar fracciones `a/b`.
- **Métodos:**
    - `asignaNumerador(int x)` y `asignaDenominador(int y)`.
    - `imprimirRacional()` → muestra el racional en tabla.
    - Operaciones: `suma`, `resta`, `producto`, `division`.
    - `esIgual(Racional otro)` → compara dos racionales.
- **Extras añadidos:**
    - Impresión elegante con títulos (`SUMANDO`, `RESTANDO`, etc.).
    - Validación para evitar denominador cero.
    - Posibilidad de simplificar fracciones y mostrar valor decimal.

---

## 📙 Actividad 3 – (Ejemplo de relaciones simples)
- **Objetivo:** Practicar relaciones básicas entre clases.
- **Ejemplo:** Cliente–Pedido, Alumno–Curso, etc.  
  *(Dependiendo del enunciado, se modelan relaciones uno a uno o uno a muchos con clases intermedias).*

---

## 📕 Actividad 4 – Relaciones en un concesionario
- **Objetivo:** Modelar las relaciones de un sistema de ventas de coches.
- **Clases principales:**
    - `Cliente`, `Vendedor`, `CocheNuevo`, `Extra`, `Version`, `Marca`, `Modelo`.
- **Relaciones:**
    - `ClienteCompraCocheNuevoConVendedor` → cliente compra coche nuevo con vendedor.
    - `VersionTieneExtra` → versión de coche incluye extras con precio adicional.
    - `ExtraTieneCocheNuevo` → coche nuevo tiene extras asociados.
- **Métodos `show()`** en cada relación para imprimir datos en tablas.
- **Ejemplo de uso:**
    - Cliente “Aurora López” compra un Toyota Corolla Hybrid con extras (GPS, asientos de cuero) a un vendedor.
    - Se muestran las tablas de compra y extras asociados.