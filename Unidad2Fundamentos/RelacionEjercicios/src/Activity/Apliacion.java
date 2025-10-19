package Activity;

import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * Escribe un método que diga si un número introducido por teclado es o no primo y
 * utilízalo para encontrar los 100 primeros números primos. Un número primo es aquel que sólo es
 * divisible entre él mismo y la unidad.
 */
public class Apliacion {

    static void main() {
        MC.printBanner();
        MC.title.outline("Calcular numeros primos");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int num = sc.nextInt();

        if ( esPrimo(num) )
        {
            MC.title.outlineY("Es PRIMO");
        }else{
            MC.title.outlineY("No es PRIMO");
        }

        System.out.println();

        Table table = new  Table();
        table.addRow("Primos");

        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                table.addRow(String.valueOf(i) );
            }
        }

        table.print();

        MC.title.outline("Muchas Gracias");
    }

    static boolean esPrimo( int num )
    {
        if (num <= 1) return false; // 0 y 1 no son primos
        if (num == 2) return true;  // 2 es primo
        if (num % 2 == 0) return false; // pares > 2 no son primos

        // comprobamos divisores desde 3 hasta raíz de n
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
