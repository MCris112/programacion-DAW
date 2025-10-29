import Utilities.MC;

/**
 * 6. Escribir una función que dadas dos matrices devuelve la matriz donde la primera columna es la
 * suma, la segunda columna el producto y la tercera columna la media de las correspondientes
 * columnas de las matrices pasadas como argumento.
 */
public class Activity6 {

    static void main() {
        int[][] matrix1 = {
                { 1, 1, 10},
                { 2, 7, 20},
                { 3, 9, 40},
        };

        int[][] matrix2 = {
                { 1, 2, 20},
                { 10, 5, 5},
                { 12, 3, 30},
        };

        int[][] restult = {
                { 0, 0, 0},
                { 0, 0, 0},
                { 0, 0, 0},
        };

        for (int i = 0; i < restult.length; i++) {
            for (int j = 0; j < restult[i].length; j++) {
                switch (j) {
                    case 0:
                        restult[i][j] = matrix1[i][j] + matrix2[i][j];
                        break;
                    case 1:
                        restult[i][j] = matrix1[i][j] * matrix2[i][j];
                        break;
                    case 2:
                        restult[i][j] = (matrix1[i][j] + matrix2[i][j]) / 2;
                        break;
                }
            }
        }

        MC.printBanner();
        MC.title.outline("Resultado de matrices");

        MC.printMatrix(restult);
    }
}
