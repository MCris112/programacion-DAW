package Practicas;

import Utilities.MC;

/**
 * Vamos a resolver el problema del laberinto desde el
 * pseudocódigo
 *
 * ALGORITMO ResolverLaberinto
 *  DADO un laberinto representado por una matriz:
     *  0 = camino libre
     *  # = pared
 *  INICIO = (0,0)
 *  FIN = (N-1, N-1)
 *  CREAR solucion[N][N] con ceros
 *  SI resolverDesde(0,0,laberinto,solucion) = VERDADERO ENTONCES
 *  imprimir(solucion)
 *  SINO
 *  ESCRIBIR "No existe camino"
 * FIN ALGORITMO
 */
public class Practica3Laberinto {

    static int[] fin;

    final char CAMINO = 0;
    static final char PARED = '#';

    static void main() {
        char[][] laberinto = {
                {'0', '0', '#', '0'},
                {'#', '0', '#', '0'},
                {'#', '0', '0', '0'},
                {'#', '#', '0', '0'}
        };

        final int[] INICIO = {0, 0};

        fin = new int[]{laberinto.length - 1, laberinto[0].length - 1};

        int[][] solucion = new int[laberinto.length][laberinto[0].length];

        for (int i = 0; i < solucion.length; i++) {
            for (int j = 0; j < solucion[0].length; j++) {
                solucion[i][j] = 0;
            }
        }

        if ( resolverDesde(0 , 0, laberinto, solucion) )
        {
            //solucion
            MC.printMatrix( solucion );
        }else {
            MC.title.outlineY("No existe camino");
            MC.printMatrix( solucion );

        }
    }

    static boolean resolverDesde(int x, int y, char[][] laberinto, int[][] solucion) {

        //SI (x,y) es la salida ENTONCES
        if (x == laberinto.length-1 && y == laberinto[0].length - 1)
        {
            System.out.println("FINAL");
            solucion[x][y] = 1;
            return true;
        }

        // SI esSeguro(x,y,laberinto) ENTONCES
        if ( esSeguro(x, y, laberinto) )
        {
            System.out.println("ES SEGURO");
            solucion[x][y] = 1;
            // Mover abajo
//            SI resolverDesde(x+1, y, laberinto, solucion) = VERDADERO ENTONCES
//            RETORNAR VERDADERO
            if ( resolverDesde( x + 1, y, laberinto, solucion) )
                return true;

//            // Mover derecha
//            SI resolverDesde(x, y+1, laberinto, solucion) = VERDADERO ENTONCES
//           RETORNAR VERDADERO

            if ( resolverDesde( x, y + 1, laberinto, solucion) )
                return true;
//            // Mover arriba
//            SI resolverDesde(x-1, y, laberinto, solucion) = VERDADERO ENTONCES
//            RETORNAR VERDADERO

            if ( resolverDesde( x - 1, y, laberinto, solucion) )
                return true;

//            // Mover izquierda
//            SI resolverDesde(x, y-1, laberinto, solucion) = VERDADERO ENTONCES
//            RETORNAR VERDADERO

            if ( resolverDesde( x, y - 1, laberinto, solucion) )
                return true;

//            solucion[x][y] 0 // retroceder ( ← backtracking)
//            RETORNAR FALSO

            solucion[x][y] = 0;

            return false;
        }
        return false;
    }

    static boolean esSeguro(int x, int y, char[][] laberinto) {
        return ( x >= 0 && x <= laberinto.length-1 &&  y >= 0 && y <= laberinto[0].length -1) && laberinto[x][y] != PARED;
    }
}
