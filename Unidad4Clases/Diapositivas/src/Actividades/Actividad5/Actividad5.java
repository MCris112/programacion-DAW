package Actividades.Actividad5;

import java.util.ArrayList;

/**
 * Actividad: Crea las clases en JAVA con sus correspondientes
 * constructores y funciones necesarias para mostrar información y
 * modificar los atributos del siguiente diagrama E-R
 */
public class Actividad5 {

    static void main() {
        // Profesores
        Profesor domingo = new Profesor("3434343", "34343535", "Domingo", "Calle granada");
        Profesor laura = new Profesor("343657343", "999943535", "Laura", "Murcia v234");

        // Módulos
        Modulo modProg = new Modulo(1, "Programacion");
        Modulo modEntDesa = new Modulo(2, "Entorno desarrollo");

        // Relacionar módulos con profesores
        modProg.setProfesor(domingo);
        modEntDesa.setProfesor(laura);

        // Simulacion de una tabla donde almacena todas las relaciones
        ArrayList<Cursa> cursan = new ArrayList<>();

        Alumno aurora = new Alumno(1, "Aurora", "Lopez", "30/01/2003");
        Alumno nicolas = new Alumno(2, "Nicolas", "Lopez", "30/01/2003");
        nicolas.setDelegado(aurora);

        // Relaciones Cursa cada alumno
        cursan.add(new Cursa(aurora, modProg));
        cursan.add(new Cursa(nicolas, modProg));
        cursan.add(new Cursa(aurora, modEntDesa));
        cursan.add(new Cursa(nicolas, modEntDesa));

        // Mostrar los módulos
        System.out.println(modProg);
        System.out.println(modEntDesa);

        System.out.println();

        // Mostrar relaciones alumno-módulo
        for (Cursa c : cursan) {
            System.out.println(c);
        }
    }
}
