package Activity;

import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 10. Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un
 * número indicado por teclado. Genera dos funciones, una para que devuelva el número de pares y
 * otra para el número de impares. Ejemplo de salida: El 406783 contiene 4 dígitos pares y 2 dígitos
 * impares.
 */
public class Activity10 {

    static void main() {
        MC.title.outline("Te diré impar y pares hay");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero:");
        int numero = sc.nextInt();

        System.out.println();

        Table.instance()
            .addRow("Pares", String.valueOf(pares(numero)))
            .addRow("Impares", String.valueOf(impares(numero)))
                .print();
    }

    static int pares(int num) {
       if( num == 0 ){
           return 0;
       }

       int divided = num % 10;

       if ( divided % 2 == 0 ){
           return 1+ pares(num/10);
       }

       return  pares(num/10);
    }

    static int impares(int num) {
        if( num == 0 ){
            return 0;
        }

        int divided = num % 10;

        if ( divided % 2 != 0 ){
            return 1+ impares(num/10);
        }

        return  impares(num/10);
    }
}
