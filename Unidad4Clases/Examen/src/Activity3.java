import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 3. (3 puntos) Escribe un programa que trabaje con una matriz de enteros de tamaño 5 × 5. El
 * programa a través de un menú debe:
 * 1. Rellenar la matriz automáticamente con números enteros aleatorios entre 1 y 50 pero
 * teniendo presente que en cada fila serán los rangos: {1-10}, {11-20}, {21-30}, {31-40},
 * {41-50}. En este caso, harás una función generaFila(min,max) y la asignarás a cada fila de
 * la matriz 5x5. (1 punto)
 * 2. Mostrar la matriz en formato de tabla. (0,25 puntos)
 * 3. Calcular y mostrar los siguientes valores sobre la matriz: (1,25 puntos)
 * • La suma de cada fila.
 * • La suma de cada columna.
 * • El valor máximo y mínimo de toda la matriz y su posición (fila y columna).
 * 4. Modifica el valor de una coordenada introducida por el usuario. Hay que verificar que no se
 * introducen valores fuera de sus límites. (0,5 puntos)
 */
public class Activity3 {

    static Scanner sc = new Scanner(System.in);

    static int[][] matrix = {
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
    };

    static void main() {

        boolean takeData = true;

        do {
            Table.instance()
                    .addRow("Opciones")
                    .addRow("1", "Rellenar Automaticamente")
                    .addRow("2", "Mostrar matriz")
                    .addRow("3", "Mostrar suma de fila cols")
                    .addRow("4", "Calcular Min-Max")
                    .addRow("0", "Salir")
                    .print();
            System.out.println("Seleccione una opción:");
            switch ( Integer.parseInt(sc.nextLine()) ) {
                case 0: takeData = false; break;
                case 1: autoFill(); break;
                case 2: showMatrix(); break;
                case 3: sum(); break;
                case 4: showCalcs(); break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo");
                    break;
            }

        }while ( takeData );

        MC.title.outline("MUCHAS GRACIAS");
    }

    public static void autoFill()
    {
        int[][] data = {
                generaFila(1, 10),
                generaFila(11, 20),
                generaFila(21, 30),
                generaFila(31, 40),
                generaFila(41, 50),
        };

        matrix = data;
        //Me olvide que tengo que usar una funcion generaFila(min, max)
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//
//                switch (i)
//                {
//                    case 0: matrix[i][j] =  break;
//                    case 1: matrix[i][j] = random(11, 20); break;
//                    case 2: matrix[i][j] = random(21, 30); break;
//                    case 3: matrix[i][j] = random(31, 40); break;
//                    case 4: matrix[i][j] = random(41, 50); break;
//                }
//
//            }
//        }

        MC.title.outlineY("Se relleno correctamente ");
    }

    public static int[] generaFila(int min, int max)
    {
        int[] fila = new int[matrix[0].length];

        for (int i = 0; i < fila.length; i++) {
            fila[i] = random(min, max);
        }

        return fila;
    }

    public static void showMatrix()
    {
        Table table = Table.instance();

        for (int i = 0; i < matrix.length; i++) {
            String[] cols = new String[matrix[i].length];

            for (int j = 0; j < matrix[i].length; j++) {
                cols[j] = matrix[i][j] + "";
            }

            table.addRow(cols);
        }

        table.print();
    }

    public static void showCalcs()
    {
        boolean isMinSet = false;

        int[] min = { 0, 0, 0};
        int[] max = { 0, 0, 0};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ( !isMinSet )
                {
                    min = new int[]{matrix[i][j], i, j};
                    isMinSet = true;
                }

                if ( matrix[i][j] < min[0] )
                {
                    min = new int[]{matrix[i][j], i, j};
                }

                if ( matrix[i][j] > max[0] )
                {
                    max = new int[]{matrix[i][j], i, j};
                }
            }
        }

        Table.instance()
                .addRow("","", "x", "Y")
                .addRow("Min", min[0]+"", min[1]+"", max[2]+"")
                .addRow("Max", max[0]+"", max[1]+"", max[2]+"")
                .print();
    }

    public static void sum()
    {
        Table table = Table.instance();

        String[] header = new String[matrix.length+2];
        header[0] = "Suma";
        for (int i = 0; i < matrix.length; i++) {
            header[i+1] = "";
        }

        header[matrix.length+1] = "Filas";

        table.addRow(header);

        int[] sumCol = new  int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            String[] cols = new String[matrix[i].length+2];
            cols[0] = "";

            int sumFila = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                cols[j+1] = matrix[i][j] + "";
                sumFila += matrix[i][j];

                sumCol[j] += matrix[i][j];
            }

            cols[matrix[i].length+1] = sumFila+"";

            table.addRow(cols);
        }


        String[] footer = new String[sumCol.length+2];
        footer[0] = "Columnas";
        for (int i = 0; i < sumCol.length; i++) {
            footer[i+1] = sumCol[i]+"";
        }

        footer[matrix[0].length+1] = "";

        table.addRow(footer);

        table.print();
    }

    public static int random(int min, int max)
    {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
