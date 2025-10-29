import java.util.Scanner;

public class Main {

    static int[][] matriz = {
            {0, 0 ,0 },
            {0, 0 ,0 },
            {0, 0 ,0 }
    };

    static boolean player = true;

    final static int PLAYER1 = 1;
    final static int PLAYER2 = 2;

    static void main() {
        int position;
        Scanner input = new Scanner(System.in);

       printGame();


       do{
           System.out.println("Introduce una posición");
           position = input.nextInt();

           play(position);

           printGame();
           player = !player;
       }while ( !checkMatch() );

       if (player) {
           System.out.println("Congratulations! Jugador 1 Ganó!");
       }else{
           System.out.println("Congratulations! Jugador 2 Ganó");
       }
    }

    static void play(int position )
    {
        int icon = player ?  PLAYER1 : PLAYER2;

        switch (position)
        {
            case 1:  matriz[0][0] = icon; break;
            case 2:  matriz[0][1] = icon; break;
            case 3:  matriz[0][2] = icon; break;
            case 4:  matriz[1][0] = icon; break;
            case 5:  matriz[1][1] = icon; break;
            case 6:  matriz[1][2] = icon; break;
            case 7:  matriz[2][0] = icon; break;
            case 8:  matriz[2][1] = icon; break;
            case 9:  matriz[2][2] = icon; break;
        }
    }

    static void printGame()
    {
        for (int i = 0; i< matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }


    static boolean checkMatch()
    {
        int icon = player ?  PLAYER1 : PLAYER2;

        if( winByRow(0, icon) || winByRow(1, icon) || winByRow(2, icon) )
        {
            return true;
        } else if ( winByColumn(0, icon) | winByColumn(1, icon)|| winByColumn(2, icon)) {
            return true;
        } else return winByDiagonal(icon);
    }

    static boolean winByRow(int row, int icon )
    {
        return (matriz[row][0] == icon) && (matriz[row][1] == icon) && (matriz[row][2] == icon);
    }

    static  boolean winByColumn(int col, int icon )
    {
        return matriz[0][col] == icon && matriz[1][col] == icon && matriz[2][col] == icon;
    }

    static boolean winByDiagonal(int icon) {

        if ( matriz[0][0] == icon && matriz[1][1] == icon && matriz[2][2] == icon )
            return true;
        else if( matriz[0][2] == icon && matriz[1][1] == icon && matriz[2][0] == icon )
            return true;

        return false;
    }
}