package Activities;

import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * Realiza un programa que inserta valores en una matriz dinámica y devuelva la
 * suma de los valores de cada fila y columna
 */
public class Activity3 {

    static void main() {
        int[][] matriz;

        MC.title.outline("Calculo");

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la cantidad de filas");

        matriz = new int[Integer.parseInt(sc.nextLine())][];
        System.out.println("Inserte la cantidad de columnas");

        int columnas = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < matriz.length; i++) {

            matriz[i] = new int[columnas];

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Inserte dato de Fila: "+i + " columna: "+j);
                matriz[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        MC.title.outlineY("Tu matriz");
        MC.printMatrix(matriz);

        System.out.println();

        MC.title.outlineY("Suma de filas");

        Table table = Table.instance().addRow("Fila", "Suma");

        // Suma de filas
        for ( int i = 0; i < matriz.length; i++ ) {
            int sum = 0;
            for ( int j = 0; j < matriz[i].length; j++ )
                sum += matriz[i][j];

            table.addRow("F1", sum+"");
        }

        table.print();

        System.out.println();

        MC.title.outlineY("Suma de Columnas");

        Table tableCol = Table.instance().addRow("Columna", "Suma");

        int[] sumCol =  new int[columnas];

        // Suma de filas
        for ( int i = 0; i < matriz.length; i++ ) {

            for ( int j = 0; j < matriz[i].length; j++ )
            {
                sumCol[j] += matriz[i][j];
            }

        }

        for (int k = 0; k < sumCol.length; k++ ) {
            tableCol.addRow("C"+k, sumCol[k]+"");
        }

        tableCol.print();
    }
}
