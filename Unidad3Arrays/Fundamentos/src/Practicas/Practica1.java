    package Practicas;

    /**
     *  Realizar el recorrido para la siguiente matrices
     *  Página 10
     */
    public class Practica1 {

        static void main() {
            int[][] matriz = {
                    {1, 2},
                    {3, 4}
            };
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++)
                    System.out.print(matriz[i][j] + " ");
                System.out.println();
            }


            int[][] matrix = {
                    {1,2,3,4,5},
                    {2,3,4,5},
                    {3,4,5},
                    {4,5},
                    {5}
            };

            printMatrix2d(matrix);

            int[][] matriz2 = {
                    {3,7,1},
                    {4, -4, 2},
                    {5, 0, 5}
            };

            printMatrix2d(matriz2);
        }

        static void printMatrix2d( int[][] matrix) {
            System.out.println("-----------------");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++)
                    System.out.print(matrix[i][j] + " ");
                System.out.println();
            }
            System.out.println("-----------------");
        }
    }
