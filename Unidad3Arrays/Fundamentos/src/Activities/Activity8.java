package Activities;

/**
 *  Actividad: Vamos a simular una base de datos de alumnos con calificaciones
 * ➢ Vamos a tener la siguientes estructuras de datos:
 * ➢ Vamos a hacer el código JAVA para:
 * 1) Generar notas aleatorias y un procedimiento para sacar el formato tabla de
 * notas
 * 2) Obtener la calificación media, máximo y mínimo de un alumno
 * 3) ¿Cuántos alumnos han superado un módulo?
 * 4) ¿Cuántos módulos aprueba un alumno?
 * 5) Ahora, haciendo uso de memoria dinámica:
 * a) Añade un nuevo alumno y sus calificaciones.
 * b) Elimina la columna de Programación y sus notas.
 */
public class Activity8 {

    public static String[] alumnos = { "José", "Ana", "María", "Luis", "Domingo" };
    public static String[] modulos = { "Programación", "Entornos", "Bases Datos", "Sistemas" };
    public static double[][] notas = new double[5][4];

    static void main() {

    }

    public static int generarNotas() {
        int min = 0, max = 10;
        return (int) ( Math.random() * (max - min + 1) + min );
    }

    public static void generarModulo() {
    }
}
