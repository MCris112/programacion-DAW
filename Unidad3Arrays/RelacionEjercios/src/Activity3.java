import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 3. Escribir una función que devuelve un array que contiene el valor máximo y mínimo del array
 * introducido como parámetro.
 */
public class Activity3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        MC.title.outline("Dime el tamaño de tu array");
        int[] data = new int[ sc.nextInt() ];

        for (int i = 0; i < data.length; i++) {
            System.out.println("Inserte "+(i+1)+"° digito");
            data[i] = sc.nextInt();
        }

        MC.title.outlineY("Tu array inserido:");
        MC.printArray(data);

        int[] result = getMinMax(data);
        Table.instance()
                .addRow("Mayor", String.valueOf(result[0]))
                .addRow("Menor", String.valueOf(result[1]))
                .print();
    }

    public static int[] getMinMax( int[] data ){
        //{ max, min }
        int[] result =  { data[0], data[0]};

        for( int i = 0; i < data.length; i++ ){
            if ( result[0] < data[i] ){
                result[0] = data[i];
            }

            if ( data[i] < result[1] ){
                result[1] = data[i];
            }
        }

        return result;
    }
}
