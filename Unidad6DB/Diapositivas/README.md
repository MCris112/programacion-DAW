# Unidad 6: Bases de Datos (Programación - DAW)

Bienvenido al repositorio de mis prácticas de la Unidad 6: Bases de Datos de la asignatura de Programación (1º DAW).

Este proyecto en Java recopila todos los ejercicios y actividades que hemos ido desarrollando durante la unidad para aprender a modelar datos, crear clases modelo (POJOs), gestionar relaciones entre tablas e integrar la lógica de negocio con las bases de datos.

## Estructura del Proyecto

Todo el proyecto está estructurado de manera directa y sencilla. En la raíz se encuentran los archivos de configuración y la carpeta lib, pero lo verdaderamente importante y donde reside todo el trabajo de la unidad es en el directorio src/Activities/.

Unidad6DB (Diapositivas)
 /lib/               - Librerías externas requeridas para el proyecto
 /out/               - Binarios y clases compiladas
 /src/Activities/    - El núcleo del proyecto. Todas las prácticas están aquí.

## Las Actividades (src/Activities/)

Como le he dado prioridad a tener el código bien organizado para repasar, he dividido cada ejercicio o caso práctico en su propio paquete dentro de src/Activities. Cada carpeta contiene sus propias clases Java que modelan las bases de datos de diferentes tipos de negocios, además de su clase principal (la que contiene el main) para ejecutar y probar que todo funciona bien.

Algunos ejemplos de lo que puedes encontrar en estos paquetes son:

- Activity 9 (Gestión de Cursos): Modelado de un sistema educativo con clases como Curso, Edicion, Empleado (con herencia para capacitados y no capacitados) y gestión de pre-requisitos.
- Activity 10 (Tienda de Libros): Un esquema bastante completo que gestiona libros físicos y digitales (LibroPapel, LibroEbook), autores, editoriales, clientes, y carritos de compra (Cesta). Implementación de relaciones completas con Foreign Keys para conectar almacenes, clientes y editoriales de forma correcta.
- Activity 11 (Sector Editorial de Revistas): Gestión de todo lo relacionado con revistas, involucrando entidades como Sucursal, Periodista, Seccion, Ejemplar y las diferentes relaciones N:M (por ejemplo, qué sucursal publica qué revista o qué periodista la escribe).
- Otras Actividades (1-8, 12, 13): Incluyen desde los ejercicios más iniciales del tema con modelos sencillos, hasta resoluciones de casos más avanzados que requerían diseñar los diagramas en clases de Java.

Cada actividad está pensada para ser probada de forma independiente ejecutando su respectiva clase principal (por ejemplo, Activity10.java para ver el menú interactivo).

## Tecnologías y Conceptos Aplicados

- Lenguaje: Java
- Base de Datos: Relacional (MySQL / MariaDB)
- Conceptos aplicados:
  - Orientación a objetos aplicada a persistencia de datos (Clases Modelo).
  - Manejo de herencias en base de datos.
  - Uso de menús interactivos por terminal.
  - Diseño y gestión de relaciones de bases de datos desde el código (1:1, 1:N, N:M).

## Ejecución del Proyecto e Instalación de Librerías

Para ejecutar el proyecto correctamente, es fundamental configurar las dependencias de la base de datos.
Dentro de la carpeta lib/ que hay en la raíz del proyecto se encuentran las librerías necesarias. Tienes que añadir todos los archivos .jar de ese directorio a las bibliotecas de tu IDE (IntelliJ IDEA, Eclipse, VSCode...) para que el programa pueda conectar con la base de datos y compilar sin problemas. Si las librerías no se incluyen, el proyecto fallará al ejecutarse.

## Notas del desarrollo

Dentro del código seguramente encuentres comentarios y partes de prueba y error, por ejemplo arreglando bucles infinitos en el manejo de menús (un clásico peleándose con el objeto Scanner), resolviendo excepciones de claves foráneas sueltas por ahí y refactorizando el diseño para que todo el Modelo quede claro. Todo forma parte del proceso de aprendizaje de DAW.
