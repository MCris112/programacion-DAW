package Activity;

import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 7. Realiza un programa que introduzca números hasta poner 0 y te diga cuántos positivos y
 * negativos has introducido.
 */
public class Activity7 {
    static void main() {
        int positivos = 0, negativos = 0;
        boolean continuar = true;

        Scanner sc = new Scanner(System.in);

        MC.printBanner();
        MC.title.outline("Calcular negativos y Positivos");
        System.out.println("Ingrese 0 para cancelar");

        while (continuar) {
            System.out.println("Introduce un número: ");
            int numero = sc.nextInt();

            if ( numero < 0)
            {
                negativos++;
            }else if ( numero > 0)
            {
                positivos++;
            }else{
                continuar = false;
            }

            Table table = new Table();

            table.addRow("Positivos", String.valueOf(positivos) );
            table.addRow("Negativos", String.valueOf(negativos) );

            table.print();
        }

        MC.title.outline("Muchas Gracias");
    }
}
