import Utilities.MC;

/**
 * 7. Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
 * posición en el sentido de las agujas del reloj. La matriz debe tener 5 filas por 5 columnas y debe
 * contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz original como la
 * matriz resultado.
 */
public class Activity7 {

    static void main() {
        int[][] matrix = {
                generateCols(5),
                generateCols(5),
                generateCols(5),
                generateCols(5),
                generateCols(5)
        };

        MC.printBanner();
        MC.title.outline("Rotamineto en relog");

        MC.title.outlineY("Matrix original");
        MC.printMatrix(matrix);

        System.out.println();

        rotate(matrix);

        MC.title.outlineY("Matrix en relog");
        MC.printMatrix(matrix);
    }

    /**
     * Generar numeros aleatorios por cada item del array
     * @return int
     */
    public static int generateRandNum()
    {
        int min = 0;
        int max = 100;
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    /**
     * Generar las columnas de  manera dinamica y no estar repitiendo codigo
     * @param size
     * @return int[]
     */
    public static int[] generateCols(int size)
    {
        int[] cols = new int[size];

        for (int i = 0; i < size; i++) {
            cols[i] = generateRandNum();
        }

        return cols;
    }

    /**
     * La funcion de rotar en manija hacia el relog
     * @param matrix
     */
    public static void rotate(int[][] matrix)
    {
       int[] order = {
               matrix[0][0], matrix[0][1], matrix[0][2], matrix[0][3], matrix[0][4],
               matrix[1][0],                                            matrix[1][4],
               matrix[2][0],                                            matrix[2][4],
               matrix[3][0],                                            matrix[3][4],
               matrix[4][0], matrix[4][1], matrix[4][2], matrix[4][3], matrix[4][4],
       };


       matrix[0][0] = order[5]; matrix[0][1] = order[0]; matrix[0][2] = order[1]; matrix[0][3] = order[2]; matrix[0][4] = order[3];
       matrix[1][0] = order[7];                                                                            matrix[1][4] = order[4];
       matrix[2][0] = order[9];                                                                            matrix[2][4] = order[6];
       matrix[3][0] = order[11];                                                                           matrix[3][4] = order[8];
       matrix[4][0] = order[12]; matrix[4][1] = order[13]; matrix[4][2] = order[14]; matrix[4][3] = order[15]; matrix[4][4] = order[10];
    }
}
