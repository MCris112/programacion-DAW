# Formulario GUI - Java Swing

> [!TIP]
> **Video Explicativo**: [Ver demostración en YouTube](https://www.youtube.com/watch?v=St-Y6VVhlzQ)

Este proyecto es una aplicación de escritorio desarrollada en **Java** utilizando la biblioteca **Swing**. Se trata de un formulario interactivo multi-paso diseñado para recopilar información personal del usuario de manera intuitiva y visualmente atractiva.

## Características principales

- **Diseño Multi-paso**: Utiliza `CardLayout` para dividir el proceso de registro en dos secciones: Información Básica e Información Adicional.
- **Validación de Datos**: Comprueba que los campos obligatorios (nombre, teléfono, género, etc.) no estén vacíos antes de avanzar o enviar.
- **Fecha de Nacimiento Dinámica**: El selector de días se ajusta automáticamente según el mes y el año seleccionados (incluyendo años bisiestos).
- **Gestión de Imágenes**: Permite al usuario proporcionar una URL de imagen o seleccionar un archivo local mediante un explorador de archivos (`JFileChooser`).
- **Resumen de Datos**: Incluye una pantalla de confirmación que muestra todos los datos ingresados junto con una previsualización de la imagen seleccionada.
- **Interfaz Personalizada**: Ventana sin bordes (*undecorated*) con controles de cierre y arrastre personalizados.

## Tecnologías utilizadas

- **Lenguaje**: Java 25+
- **Interfaz Gráfica**: Java Swing & AWT
- **Gestión de Dependencias**: Maven
- **Librerías Externas**: `AbsoluteLayout` (para un posicionamiento preciso de los componentes).

## Estructura del Proyecto

```text
src/main/java/com/darkredgm/formulariogui/
├── App.java           # Clase principal (JFrame) y punto de entrada
├── Confirmation.java  # Diálogo de resumen de datos (JDialog)
└── FormData.java      # Clase modelo para almacenar los datos del formulario
```

## Requisitos

- **Java JDK 25** o superior.
- **Maven** instalado (opcional, si se desea compilar desde terminal).
- Un IDE como **NetBeans**, **IntelliJ IDEA** o **VS Code**.

## Cómo ejecutar

### Desde un IDE
1. Importa el proyecto como un proyecto Maven existente.
2. Ejecuta la clase main de `App.java`.

### Desde la Terminal (usando Maven)
```bash
mvn package
java -jar target/FormularioGUI-1.0-SNAPSHOT.jar
```

---

*Proyecto desarrollado como parte del módulo de Programación - DAW.*