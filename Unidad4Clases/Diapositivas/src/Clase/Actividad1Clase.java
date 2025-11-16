package Clase;

import Prueba.Matematicas;
import Prueba.Persona;

public class Actividad1Clase {

    static void main() {
        Persona aurora = new Persona("Aurora", 22);

        aurora.imprimirDatos();

        double a = 4;
        double b = 5;

        System.out.println( Matematicas.suma(a, b) );
    }
}
