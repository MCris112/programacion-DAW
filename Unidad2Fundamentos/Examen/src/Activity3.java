import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 3. (2 puntos) Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
 * negativo y nos diga cuántos números se han introducido, la suma de los impares, el mayor de los
 * pares y el menor de todos. El número negativo sólo se utiliza para indicar el final de la introducción
 * de datos pero no se incluye en el cómputo.
 */
public class Activity3 {
    static void main() {
        MC.title.outline("Calcular info");

        Scanner sc = new Scanner(System.in);
        int totals = 0;
        int imparSuma = 0;
        int numMinus = 0;
        int numMayor = 0;

        //Si ya se declaro el numero menor, si intruce 0, no volver a reemplazar el 0
        boolean isCeroTaken = false;

        boolean takeData = true;

        do {
            System.out.println("Introduce un número (-1 para cancelar)");
            int digit =  sc.nextInt();

            if ( digit < 0 )
            {
                takeData = false;
            }else{
                totals += digit;

                if ( digit %2 != 0)
                    imparSuma += digit;

                if ( digit < numMinus || !isCeroTaken )
                    numMinus = digit;

                //Declarar que ya se tomo el primer numero menhor como existente
                isCeroTaken = true;

                if ( digit > numMayor )
                {
                    numMayor = digit;
                }
            }

        }while ( takeData );


        Table.instance()
                .addRow("Sum Impares", String.valueOf(imparSuma) )
                .addRow("Número Menor", String.valueOf(numMinus) )
                .addRow("Número Mayor", String.valueOf(numMayor) )
                .addRow("Suma total", String.valueOf(totals) )
                .print();

    }
}
