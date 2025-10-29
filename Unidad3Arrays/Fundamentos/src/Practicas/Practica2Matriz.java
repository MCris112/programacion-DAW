package Practicas;

public class Practica2Matriz {

    static void main() {
        int[][] matriz = {
                { 3,7,1 },
                { 4, -4, 2},
                { 5, 0, 5}
        };

        int rows = matriz.length;
        int cols = matriz[0].length;


        int[] asArray = toArray( matriz, rows, cols );

        System.out.println("Size: "+asArray.length);
        for (int i = 0; i < asArray.length; i++) {
            System.out.print( asArray[i] + ", ");
        }

    }

    static int[] toArray(int[][] matriz, int rows, int cols) {
        int[] matrix = new int[rows * cols];

        for (int r = 0; r < rows; r++) {
            for (int col = 0; col < cols; col++) {
                    matrix[(r*cols)+col]  = matriz[r][col];
            }
        }

        return matrix;
    }
}
