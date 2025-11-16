package Activities;

import Utilities.MC;

import java.util.Scanner;

/**
 * Problema de las 8 reinas. Vamos a resolverlo partiendo
 * del pseudocódigo fijando la posición de la primera reina
 *
 * ALGORITMO OchoReinas
 *  CREAR tablero[8][8] con ceros
 *  LEER primeraColumna
 *  tablero[0][primeraColumna] 1 ←
 *  SI resolver(tablero, 1) = VERDADERO ENTONCES
 *  imprimirTablero(tablero)
 *  SINO
 *  ESCRIBIR "No hay solución con la reina en esa columna"
 *  FIN_SI
 * FIN_ALGORITMO
 */
public class Activity9 {

    static void main() {
        int[][] tablero = {
                { 0, 0 ,0 ,0, 0, 0, 0 , 0},
                { 0, 0 ,0 ,0, 0, 0, 0 , 0},
                { 0, 0 ,0 ,0, 0, 0, 0 , 0},
                { 0, 0 ,0 ,0, 0, 0, 0 , 0},
                { 0, 0 ,0 ,0, 0, 0, 0 , 0},
                { 0, 0 ,0 ,0, 0, 0, 0 , 0},
                { 0, 0 ,0 ,0, 0, 0, 0 , 0},
                { 0, 0 ,0 ,0, 0, 0, 0 , 0},
        };

        /*
            LEER primeraColumna
            tablero[0][primeraColumna] 1
         */
        int position = -1;
        Scanner sc = new Scanner(System.in);

        do {
            //Solo visual para human-read, la posicion 3 sea 3 como humano en vez de 4/maquina
            System.out.println("Inserte posicion de reina (1-8):");
            position = Integer.parseInt(sc.nextLine()) - 1;

            if ( position < 0 || position >= tablero[0].length ) {
                MC.title.outlineY("Posicion no valida");
                position = -1;
            }else{
                tablero[0][ position ] = 1;
            }

        }while (position == -1);

        if ( resolver( tablero, 1) )
        {
            MC.printMatrix(  tablero );
        }else{
            MC.title.outlineY("No hay solucion ");
        }
    }

    static boolean resolver( int[][] tablero, int fila )
    {
        if ( fila == tablero.length )
        {
            return true; // Caso base
        }

        for ( int col = 0; col < tablero.length; col++ )
        {
            if ( esSeguro(tablero, fila, col) )
            {
                tablero[fila][col]  = 1;

                if ( resolver( tablero, fila + 1 ) )
                {
                    return true;
                }

                tablero[fila][col]  = 0; // ← Backtracking
            }
        }

        return false;
    }

    public static boolean esSeguro( int[][] tablero, int fila, int col )
    {
        // Revisar la columna
        /*
        PARA i DESDE 0 HASTA fila-1 HACER
            SI tablero[i][col] = 1 ENTONCES
                RETORNAR FALSO
        FIN PARA */
        for (int i = 0; i < fila; i++) {
            if ( tablero[i][col] == 1 )
                return false;
        }

        // Revisar diagonal superior izquierda

        int i = fila-1, j = col-1;

        /*
            MIENTRAS i 0 Y j 0 HACER ≥ ≥
                SI tablero[i][j] = 1 ENTONCES
                    RETORNAR FALSO
                i i-1 ; j j-1 ← ←
            FIN MIENTRAS
         */
        while ( i >= 0 && j >= 0 )
        {
            if ( tablero[i][j] == 1 )
                return false;
            i--;
            j--;
        }

        // Revisar diagonal superior derecha
        i = fila-1 ;
        j = col+1;

        /*
        MIENTRAS i 0 Y j < N HACER ≥
            SI tablero[i][j] = 1 ENTONCES
                RETORNAR FALSO
            i i-1 ; j j+1 ← ←
        FIN MIENTRAS
        */
        while ( i >= 0 && j < tablero.length )
        {
            if ( tablero[i][j] == 1 )
                return false;
            i--;
            j++;
        }

        //RETORNAR VERDADERO
        return true;
    }
}
