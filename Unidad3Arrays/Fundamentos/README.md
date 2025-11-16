# UNIDAD 3 - Diapositivas

Este repositorio contiene las actividades y prácticas correspondientes a la **Unidad 3** del curso, basadas en los problemas planteados en las diapositivas.

---
## 📂 Estructura del proyecto

```
Actividades/
│── Activity1.java
│── Activity2.java
│── Activity3.java
│── ...
│── Activity9.java

Practicas/
│── Practica1.java
│── Practica2Matriz.java
│── Practica3Laberinto.java

Utilities/
│── (helpers y utilidades para las clases)
```
---

---

## 📝 Descripción de las carpetas

### Actividades
Cada archivo `ActivityX.java` corresponde a un ejercicio de las diapositivas:
- **Activity9.java – Problema de las 8 reinas**  
  Implementa el algoritmo de backtracking para colocar 8 reinas en un tablero de ajedrez sin que se ataquen entre sí.  
  - Entrada: columna inicial de la primera reina.  
  - Salida: tablero con solución o mensaje de que no existe solución.  
  - Conceptos: recursividad, backtracking, validación de posiciones seguras.

*(Las demás actividades siguen la misma lógica: ejercicios progresivos de la unidad.)*

---

###  Prácticas
Ejercicios más completos que refuerzan los conceptos:

- **Practica1.java – Recorridos de matrices**  
  - Imprime una matriz **2x2** básica.  
  - Imprime una matriz **3x3 con valores positivos y negativos**.  
  - Usa el método auxiliar `printMatrix2d()` para recorrer matrices genéricas.  
  - Conceptos: bucles anidados, manejo de matrices irregulares.

- **Practica2Matriz.java – Conversión de matriz a vector**  
  - Convierte una matriz **3x3** en un arreglo unidimensional.  
  - Usa indexación lineal: `(r*cols)+col`.  
  - Imprime el tamaño y contenido del vector resultante.  
  - Conceptos: transformación de estructuras de datos, recorrido sistemático.

- **Practica3Laberinto.java – Resolución de laberinto**  
  - Representa un laberinto con `0` (camino) y `#` (pared).  
  - Usa backtracking para encontrar un camino desde `(0,0)` hasta `(N-1,N-1)`.  
  - Marca la solución en una matriz auxiliar.  
  - Conceptos: recursividad, búsqueda en grafos implícitos, validación de movimientos seguros.
