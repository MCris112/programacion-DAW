package Activities.Activity8;

import Utilities.MC;

/**
 * Actividad 1: Realiza un método genérico que intercambie el contenido de
 * dos posiciones indicadas como parámetro
 */
public class Activity8 {

    static void main() {

        String[] nombres = {"Aurora", "Nicolas"};
        Integer[] numeros = {1, 2};

        MC.printArray( swap(nombres) );
        MC.printArray( swap(numeros) );
    }

    public static <T> T[] swap( T[] vector2D ){
        T aux = vector2D[0];

        vector2D[0] = vector2D[1];
        vector2D[1] = aux;

        return vector2D;
    }
}
