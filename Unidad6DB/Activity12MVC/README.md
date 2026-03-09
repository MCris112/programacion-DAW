# Activity 12 MVC (Diapositiva 40) - Aplicación de consola en Java

> 🚨 **¡Atención! Información Crítica:**
> **Este proyecto pertenece a la Diapositiva 40.** Antes de ejecutar el proyecto principal, **ES OBLIGATORIO** ejecutar primero las migraciones de base de datos alojadas en `src/Database/Migration.java`.

## Descripción

Este proyecto es una aplicación de consola en Java que implementa el patrón de arquitectura **MVC (Modelo-Vista-Controlador)**. La aplicación está orientada a gestionar una base de datos escolar, logrando realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) interactuando con diferentes entidades como alumnos, profesores, asignaturas, cursos escolares y matrículas. 

## Características

- **Arquitectura MVC Modulada**: Separación clara entre Modelos (entidades de base de datos), Vistas (salida por consola) y Controladores (lógica de negocio).
- **Autodescubrimiento Orientado a Reflexión**: La clase envoltorio principal (`App.java`) se encarga de explorar el paquete dinámicamente usando un `URLClassLoader`, detectando nuevas clases dentro del directorio `Controller`, para así montar los menús automáticamente sin necesidad de listarlos "en duro".
- **Sistema de Consola Robusto**: Se controlan intercepciones de memoria y limpieza de Buffer de Scanner, permitiendo que la navegación del menú y manejo de opciones no colapse cuando el usuario inserta un carácter inválido.

## Estructura de Directorios

El código fuente en `src/` se estructura en función de la modularización:

- `Controller/`: Incluye todos los controladores específicos de cada tabla de la base de datos (e.g. `AlumnoController`, `AsignaturaContoller`). Heredan de `BaseController` y enrutan la acción seleccionada.
- `Models/`: Clases de mapeo (entidad-relación) referenciando objetos de base de datos como `Alumno`, `Asignatura`, etc. Extienden de un `Model` universal.
- `Views/`: Clase centralizada `BaseView` que contiene utilidades para representar salidas visuales de tablas y confirmaciones directamente sobre el CLI de System.out.
- `Core/`: Núcleo para herencias (`BaseController`) y lógica común (`Service`). El Service intercepta dinámicamente a través de Reflection cualquier modelo de Base de Datos para consultar de manera general una inserción, modificación (actualización) o borrado (Search dinámico del Primary Key).
- `Database/`: Preparada para clases de migración estructural en la base de datos.
- `App.java` y `Main.java`: Puntos de entrada y carga de entorno de la aplicación.

## Configuración y Ejecución

### Requisitos Funcionales

- Java Development Kit **(JDK) 25** o superior instalado y configurado en tus variables de entorno.
- Un servicio activo de base de datos (MySQL/MariaDB). Necesita contener una base de datos funcional llamada `cristopher_activity_12`.
### Cómo Ejecutar

1. Clona o descarga todo el repositorio en tu orden local.
2. Abre tu IDE de Java (Eclipse, VS Code con extensiones para Java, IntelliJ, etc.).
3. ⚠️ **¡PASO CRUCIAL! EJECUTAR PRIMERO LAS MIGRACIONES:** ⚠️
   Antes de iniciar la aplicación por primera vez, **DEBES iniciar `src/Database/Migration.java` y ejecutar su método `main`**. Esto es obligatorio porque se encarga de construir todas las tablas iniciales dentro de tu base de datos.
4. Una vez preparadas las migraciones de tablas, dirígete a `src/Main.java`.
5. Ejecuta el archivo `Main.java`. Todo el ciclo de vida de la aplicación de consola se invocará a través de la función `App.init()`.

## Uso del Controlador de Módulos

Al arrancar recibirás un saludo con un menú listando todas las tablas disponibles encontradas en el sistema de Controladores.
Pulsando un **entero** (1, 2, 3...) seleccionarás en cuál módulo trabajar. Estando dentro del módulo específico, podrás consumir un menú idéntico a una estructuración API REST local:

1. `[GET] api/[Módulo]`: Recopila todos los registros existentes y los enumera interactivamente en una tabla SQL por consola.
2. `[POST] api/[Módulo]`: Pide campo por campo para crear una nueva instancia y la inserta automáticamente en la DB.
3. `[SHOW] api/[Módulo]/[id]`: Pide el ID a buscar y muestra los detalles completos únicamente del registro seleccionado.
4. `[PUT] api/[Módulo]/[id]`: Extrae los detalles de la base de datos y te pregunta línea por línea si deseas sobreescribir con un valor nuevo, impactando un borrado lógico en Runtime.
5. `[DELETE] api/[Módulo]`: Pregunta por la confirmación segura ("SI") y el ID para un DELETE permanente.

Si de casualidad introduces un carácter inesperado (letras o signos no válidos al esperar un número), el programa alertará y pedirá un formato correcto sin bucles o saltos de línea infinitos.