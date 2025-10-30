import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 5. (1 punto) Escribe un procedimiento que genere la siguiente salida para el juego 4 en raya y 3 en
 * raya. No tienes que programar nada del juego, sólo mostrar estos ejemplos de salida al llamar a
 * imprimeTablero(valor); Si el valor es true mostrará la primera salida y si el valor es false mostrará
 * la otra.
 */
public class Activity5 {

    static void main() {


        MC.printBanner();
        MC.title.outline("¿Qúe juego quieres ver?");
        Scanner sc = new Scanner(System.in);

        boolean takeData = true;
       boolean valor = false;

       do {
           Table.instance()
                   .addRow( "Opción", "Juego")
                   .addRow("1", "Cuatro en raya")
                   .addRow("2", "Tres en raya")
                   .print();

           switch (sc.nextInt()) {
               case 1: valor = true; takeData = false; break;
               case 2:
                   takeData = false;
                   break;
                   default:
                       System.out.println("Inserte nuevamente:");
           }

       }while ( takeData );

       System.out.println();
       System.out.println();

        imprimeTablero(valor);
    }

    public static void imprimeTablero(boolean valor) {
        if (valor){
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|   |   | x |   |   |   |   |");
            System.out.println("|   |   | 0 | x |   |   |   |");
            System.out.println("|   | x | 0 | 0 |   |   |   |");
            System.out.println("| x | 0 | x | 0 | x |   |   |");
            System.out.println("----------------------------");
            System.out.println("  0   1   2   3   4   5   6");
        }else{
            System.out.println("| x | 0 | x |");
            System.out.println("-------------");
            System.out.println("|   | 0 |   |");
            System.out.println("-------------");
            System.out.println("|   | x |   |");
            System.out.println("-------------");
            System.out.println("  0   1   2");
        }
    }
}
