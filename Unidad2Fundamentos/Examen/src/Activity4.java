import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 4. (2 puntos) Siguiendo este pseudocódigo, genera la función que pasado un número nos diga si es
 * primo o no.
 * Algoritmo EsPrimo (n)
 *  Definir esPrimo como Lógico
 *  Si n < 2 Entonces
 *  devolver esPrimo ← Falso
 *  Sino
 *  esPrimo ← Verdadero
 *  Para i=2 Hasta n-1 Hacer
 *  Si n % i = 0 Entonces
 *  devolver esPrimo ← Falso
 *  FinSi
 *  FinPara
 *  FinSi
 *  devolver esPrimo ← Verdadero
 * FinAlgoritmo
 * Una vez lo tengas, usa esa función para obtener los números primos que hay entre dos números
 * introducidos por teclado por el usuario. Tienes que comprobar que estos dos números siempre
 * tienen que ser mayores que 50.
 */

public class Activity4 {
    static Scanner sc = new Scanner(System.in);

    static int num1 = 0;
    static int num2 = 0;

    static void main() {
        MC.title.outline("¿Son primos?");

        boolean canContinue = false;

        do {
            num1 = getNumber();
            num2 = getNumber();

            if (num1 < num2) {
                canContinue = true;
            }else{
                System.out.println("Los numeros introducidos son: (Menor, Mayor)");
            }

        }while ( !canContinue );


        Table table = new Table();
        table.addRow("Números Primos");

        for (int i = num1; i < num2; i++) {
            if ( esPrimo(i) ) {
                table.addRow(String.valueOf(i) );
            }
        }

        table.print();
    }

    public static boolean esPrimo(int num)
    {
        boolean primo = true;

        if ( num < 2)
        {
            primo = false;
        }else{
            for (int i = 2; i < num-1; i++)
            {
                if (num % i == 0) {
                    primo = false;
                }
            }
        }

        return primo;
    }

    public static int getNumber()
    {
        int num = 0;

        do {
            System.out.print("Introduce el numero: ");
            num = sc.nextInt();

            if ( num <= 50 )
            {
                System.out.println( "El numero introducido tiene que ser mayor que 50 ");
            }
        }while (  num <= 50 );

        return num;
    }
}
