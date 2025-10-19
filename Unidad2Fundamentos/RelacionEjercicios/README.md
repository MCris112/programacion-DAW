# 📘 Tarea Unidad 2: Fundamentos de la programación

Este repositorio contiene la resolución de las actividades propuestas en la ficha en PDF.  
El código está organizado en **paquetes** dentro de la carpeta `src/` para mantener una estructura clara y modular.

---

## 📂 Estructura del proyecto

```
src/
├── Activity/ # Todas las actividades de la ficha (tarea principal)
│ ├── Activity1.java
│ ├── Activity2.java
│ ├── Activity3.java
│ └── ... # etc. hasta completar las actividades
│ ├── Utilities/ # Clases de apoyo para mejorar la presentación
│ ├── Table.java │ ├── TableRow.java
│ └── ... # otras utilidades (ej. impresión de títulos) │
└── main.java # Archivo de prueba (no contiene la tarea principal)
```


---

## 📝 Descripción de los paquetes

### 🔹 `Activity/`
- Contiene **todas las actividades de la ficha**.
- Cada archivo sigue el formato `Activity{n}.java` (por ejemplo, `Activity1.java`, `Activity2.java`, etc.).
- En la parte superior de cada clase hay un **comentario** que indica a qué ejercicio corresponde.
  ```java
  /**
   * Escribe un programa que imprima buenos días, buenas tardes y buenas noches según la hora
   * actual. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. (usa LocalDateTime)
   */
  public class Activity1 {
      public static void main() {
          // ...
      }
  }

## 🔹 Utilities/
Contiene clases auxiliares creadas para mejorar la salida en consola.

Ejemplos:
- `Table.java` y `TableRow.java`: permiten imprimir tablas con formato.
- Clases para imprimir títulos o separar secciones de manera más legible.

Estas utilidades no forman parte de los ejercicios de la ficha, pero mw ayudan a presentar los resultados de forma más clara.

## 🔹 main.java
Archivo de prueba.
Contiene únicamente una función de test.

Toda la tarea real está en el paquete `Activity/`.

🚀 Ejecución
Compilar el proyecto desde la carpeta src/.

Ejecutar la clase de la actividad que quieras probar.

```java
java Activity/Activity1.java
```