# Activity 13 MVC - Aplicación de consola en Java (Vista y Controlador Único)

> 🚨 **¡Atención! Información Crítica:**
> Antes de ejecutar el proyecto principal, **ES OBLIGATORIO** ejecutar primero las migraciones de base de datos alojadas en `src/Database/Migration.java` (si no lo has hecho ya en la actividad anterior).

## Descripción

Este proyecto es una aplicación de consola en Java que implementa el patrón de arquitectura **MVC (Modelo-Vista-Controlador)**. A diferencia de las aproximaciones tradicionales con múltiples controladores, en esta versión el proyecto ha sido refactorizado para utilizar **un único Controlador y una única Vista**, reduciendo la complejidad del código pero manteniendo intacto el patrón MVC. La aplicación está orientada a gestionar una base de datos escolar, logrando realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) interactuando con diferentes entidades como alumnos, profesores, asignaturas y cursos escolares. 

## Características

- **Arquitectura MVC Simplificada**: Separación clara entre Modelos (entidades de base de datos), y un flujo centralizado a través de una sola Vista (`MainView`) y un solo Controlador (`MainController`).
- **Punto de Entrada Unificado**: Se centralizó la lógica principal de la aplicación en el `MainController`, eliminando clases dinámicas complejas o descargas mediante `URLClassLoader`.
- **Sistema de Consola Robusto**: Se controlan intercepciones de memoria y limpieza de Buffer de Scanner, permitiendo que la navegación del menú y manejo de opciones no colapse cuando el usuario inserta un carácter inválido.

## Estructura de Directorios

El código fuente en `src/` se estructura en función de la modularización:

- `Controller/`: Incluye de manera exclusiva a `MainController.java`, único punto central de enrutamiento y lógica de aplicación.
- `Models/`: Clases de mapeo (entidad-relación) referenciando objetos de base de datos como `Alumno`, `Asignatura`, etc. Extienden de un `Model` universal.
- `Views/`: Incluye de manera exclusiva a `MainView.java`, única vista encargada de renderizar todas las salidas y formularios por consola en la interactividad CLI.
- `Core/`: Lógica centralizada (`Service.java`). El Service intercepta dinámicamente cualquier modelo de Base de Datos para consultar de manera general una inserción, modificación (actualización) o borrado (Search dinámico del Primary Key).
- `Database/`: Preparada para clases de migración estructural en la base de datos.
- `Main.java`: Punto de entrada directo del proyecto.

## Configuración y Ejecución

### Requisitos Funcionales

- Java Development Kit **(JDK) 25** o superior instalado y configurado en tus variables de entorno.
- Un servicio activo de base de datos (MySQL/MariaDB). Necesita contener una base de datos funcional llamada `cristopher_activity_12` (o el nombre correspondiente configurado).

### Cómo Ejecutar

1. Clona o descarga todo el repositorio en tu orden local.
2. Abre tu IDE de Java (Eclipse, VS Code con extensiones para Java, IntelliJ, etc.).
3. ⚠️ **¡PASO CRUCIAL! EJECUTAR PRIMERO LAS MIGRACIONES:** ⚠️
   Antes de iniciar la aplicación por primera vez (si no tienes la base de datos de los ejercicios previos), **DEBES ejecutar `src/Database/Migration.java` y su método `main`**. Esto es obligatorio porque se encarga de construir todas las tablas iniciales dentro de tu base de datos.
4. Una vez preparadas las migraciones de tablas, dirígete a `src/Main.java`.
5. Ejecuta el archivo `Main.java`. Todo el ciclo de vida de la aplicación de consola se invocará a través del inicio del `MainController`.

## Uso del Menú y de Aplicación

Al arrancar recibirás un saludo con un Menú Principal estático listando las entidades a gestionar. Pulsando un **entero** (1, 2, 3...) seleccionarás en cuál módulo trabajar. Estando dentro del módulo específico, el `MainController` te mostrará el siguiente flujo CRUD para ese modelo en particular:

1. `1 - [GET] Ver todos`: Recopila todos los registros existentes y los enumera interactivamente en una tabla SQL por consola.
2. `2 - [POST] Crear nuevo`: Pide campo por campo para crear una nueva instancia y la inserta automáticamente en la DB.
3. `3 - [SHOW] Ver detalles por ID`: Pide el ID a buscar y muestra los detalles completos únicamente del registro seleccionado.
4. `4 - [PUT] Actualizar por ID`: Extrae los detalles de la base de datos y te pregunta línea por línea si deseas sobreescribir con un valor nuevo, impactando un un `UPDATE` en la DB.
5. `5 - [DELETE] Eliminar por ID`: Pregunta por la confirmación segura ("SI") y el ID para un DELETE permanente.
6. `0 - Volver atrás`: Regresa al menú principal.

Si de casualidad introduces un carácter inesperado (letras o signos no válidos al esperar un número), el programa alertará y pedirá un formato correcto sin bucles o saltos de línea infinitos.