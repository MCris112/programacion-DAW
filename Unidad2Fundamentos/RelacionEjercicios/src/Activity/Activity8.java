package Activity;

import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 8. Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
 * término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El
 * número n se debe introducir por teclado.
 */
public class Activity8 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        MC.printBanner();
        MC.title.outline( "Mostrar en Fibonacci");

        System.out.println("Ingrese un número");
        int numero = sc.nextInt();
        int a = 0, b = 1;

        Table table = new Table();
        table.addRow("Pos", "Resultado");

        for (int i = 0; i <= numero; i++) {
            table.addRow(String.valueOf(i), String.valueOf( a ) );

            int sum = a + b;
            a = b;
            b = sum;
        }

        table.print();
    }
}
