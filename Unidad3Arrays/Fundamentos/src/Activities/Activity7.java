package Activities;
import Utilities.MC;

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
/**
 * Actividad de grupo: Utilizando las funciones de String, vas a diseñar el
 * juego del ahorcado. De un array de palabras vas a coger una al azar y se
 * creará el vector con * de la longitud para que cuando el usuario acierte
 * una letra se vaya sustituyendo hasta que o bien la palabra se puede leer
 * (ganas) o acaba el juego si fallas 7 veces (pierdes)
 */

public class Activity7 {

    static String[] wordList = {
            "TARAPOTO",
            "NICOLAS",
            "JURASSIC WORLD",
            "LOS INCREIBLES"
    };

    static String word = wordList[3];

    static int tries = 0;
    static int gessed = 0;

    static void main() {

        Scanner sc = new Scanner(System.in);

        MC.printBanner();
        MC.title.outline("BIENVENIDO AL JUEGO DEL AHORCADO");
        System.out.println();

        word = wordList[getRandOption()];
        char[] user = new char[ word.length() ];

        for (int i = 0; i < word.length(); i++) {
            if ( word.charAt(i) == ' ' ) {
                user[i] = ' ';
                gessed++; //agregando que los espacios en blanco ya se adivino
            }else{
                user[i] = '*';
            }
        }

        do {
            System.out.println("Tienes: "+ (7 - tries) + " intentos");

            printScreen(user);

            System.out.print("Ingrese una letra: ");
            char letter =  sc.nextLine().toUpperCase().charAt(0);

            if ( !inWord(letter, user) )
            {
                tries++;
            }

            System.out.println();
            System.out.println();

        }while (tries < 7 && gessed != word.length());

        if ( gessed >= word.length() )
        {
            printWord(user);
            MC.title.outlineY("¡¡¡GANASTE!!!");
        }else{
            printScreen(user);
            MC.title.outlineY("Perdiste, intenta de nuevo....");
        }
    }

    static int getRandOption()
    {
        int min = 0;
        int max = wordList.length - 1;

        return (int) ( Math.random() * (max - min + 1) + min );
    }
    static void printScreen(char[] user)
    {
        printHuman();

        printWord(user);
    }

    static void printWord(char[] user)
    {
        for (int i = 0; i < user.length; i++) {
            System.out.print( user[i] );
        }

        System.out.println();
    }

    static void printHuman()
    {
        System.out.println("    +---+");
        if ( tries >= 1 ) {
            System.out.println("    |   |");
        }else{
            System.out.println("        |");
        }

        if (tries >= 2)
        {
            System.out.println("    o   |");
        }else{
            System.out.println("        |");
        }

        if ( tries >= 5) {
            System.out.println("   /|\\  |");
        }else if (tries == 4)
        {
            System.out.println("   /|   |");
        }else if (tries == 3)
        {
            System.out.println("    |   |");
        }else{
            System.out.println("        |");
        }

        if ( tries >= 7 )
        {
            System.out.println("   / \\  |");
        } else if (tries >= 6) {
            System.out.println("   /    |");
        } else {
            System.out.println("        |");
        }
        System.out.println("        |");

        System.out.println("=========");
        System.out.println();
    }

    static boolean inWord(char letter, char[] user)
    {
        boolean founded = false;

        for ( int i = 0; i < word.length(); i++ ) {
            if ( word.charAt(i) == letter ) {
                user[i] = letter;
                gessed++;

                founded = true;
            }
        }

        return founded;
    }
}
