package Activities;

import java.util.Scanner;
/**
 * Actividad de grupo: Utilizando las funciones de String, vas a diseñar el
 * juego del ahorcado. De un array de palabras vas a coger una al azar y se
 * creará el vector con * de la longitud para que cuando el usuario acierte
 * una letra se vaya sustituyendo hasta que o bien la palabra se puede leer
 * (ganas) o acaba el juego si fallas 7 veces (pierdes)
 */


/**
 * Necesitamos
 *  borrar el archivo
 * - Lista de palabras
 * - Contador de aciertos / fallas
 * - que el programa eliga la palabra al azar
 * - AdriMVP--GGez (DIBUJA AL CACHACIO AHOGADO)
 * - Usuario inserte datos
 * - Que el programa lea letra por letra la palabra elegida
 * - Acaba el juego cuando hay 7 fallos pierdes */
public class Activity7IntentoEquipo {

    static String[] palabras = {"domingo", "perro", "Mama", "gato", "aurora", "rocio"};
    //static char[][] palabras ={"domingo","perro","Mama","gato","aurora","rocio"};

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);


        int falladas = 0;
        // Programa elige azar


        // Programa elige azar
        String palabraAleatoria = palabras[(int) (Math.random() * palabras.length)];
        char[] usuario = new char[palabraAleatoria.length()];
        //ArrayList<Character> usuario = new ArrayList<>();

        System.out.println("¡Bienvenido al juego del Ahorcado!");
        System.out.println("Tienes 7 intentos para adivinar la palabra.\n");


        // Pedir datos
        do {
            printGame(usuario, palabraAleatoria);
            System.out.println("Palabra: " + new String(usuario));
            System.out.println("Di una letra");
            char letra = teclado.next().toLowerCase().charAt(0);

            boolean hayAcierto = false;

            for (int i = 0; i < palabraAleatoria.length(); i++) {
                if (palabraAleatoria.charAt(i) == letra) {
                    usuario[i] = letra;
                    hayAcierto = true;
                }
            }

        } while (falladas != 7);

        // verificar acerto o fallo

        // Validar datos 
        // ACABAR JUEGO / CONTINUAR


    }

    /**
     * @param char[] usuario Charactenes que el usuario inserto
     * @param String palabra Palabra aleatoria que eligio el sistema
     */
    public static void printGame(char[] usuario, String palabra) {
        //RAFA
        /**
         * inicio
         * leer la palabra
         * sustituimos cada uno de los char por un "*"
         * imprimir
         * fin-programa
         */

        //maria
        for (int i = 0; i < palabra.length(); i++) {

            if ( enPalabra(usuario[i], palabra) ) {
                System.out.print(usuario[i]);
            } else
                System.out.print("*");
        }

        System.out.println();
    }

    public static boolean enPalabra(char input, String palabra)
    {
        boolean encontrado = false;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == input) {
                encontrado = true;
            }
        }

        return encontrado;
    }
}
