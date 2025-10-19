package Activity;

import Utilities.MC;

import java.util.Scanner;

/**
 * 8. Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
 * término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El
 * número n se debe introducir por teclado.
 *
 * 9. Escribe el mismo programa anterior pero con una función recursiva
 */
public class Activity9 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        MC.printBanner();
        MC.title.outline( "Mostrar en Fibonacci Recursivo");

        System.out.println("Ingrese un número");
        int numero = sc.nextInt();
        int a = 0, b = 1;

        MC.printLine();
        System.out.println( fibonacci(numero, a, b) );
        MC.printLine();
    }

    public static String fibonacci(int num, int a, int b )
    {
        if ( num <=  0 )
        {
            return " ";
        }

        return a + " " + fibonacci(num - 1, b, a + b) ;
    }
}
