public class Matriz {
    
    public static void main(String[] args) {
        double[][] matrix1 = {
            {1, 1, 1},
            { 2, 2, 2},
            { 3, 3, 3}
        };

        double[][] matrix2 = {
            {3, 3, 3},
            { 1, 1, 1},
            { 2, 2, 2}
        };
        

        double[][] resultado = calcularMatrizes(matrix1, matrix2);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                System.out.print( resultado[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static double[][] calcularMatrizes( double[][] matrix1, double[][] matrix2 )
    {
        double[][] resultado = {
            {0, 0 ,0},
            {0, 0 ,0},
            {0, 0 ,0}
        };

        for (int i = 0; i < resultado.length; i++) {
           for (int j = 0; j < resultado.length; j++) {
            switch (j) {
                case 0:
                    resultado[i][j] = matrix1[i][j] + matrix2[i][j];
                    break;
                case 1:
                    resultado[i][j] = matrix1[i][j] * matrix2[i][j];
                    break;
                case 2:
                    resultado[i][j] = matrix1[i][j] + matrix2[i][j] / 2;
                    break;
            }
           } 
        }

        return resultado;
    }
}
