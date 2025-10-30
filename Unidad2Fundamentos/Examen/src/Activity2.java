import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 2. (2,5 puntos) Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada
 * y luego el ordenador genera la suya de manera aleatoria. Para ambos, el valor de la jugada será el
 * valor 1 o 2 o 3 que se corresponde con piedra, papel o tijera. Hay que evaluar el resultado y decir
 * quién gana o si hay empate. El juego termina cuando el usuario introduce -1 o el ordenador gana 5
 * veces. Realiza una función para solicitar la acción del humano, otra para generar la del ordenador y
 * el procedimiento con la salida final según si gana o no gana. Puedes crear más funciones si lo crees
 * necesario.
 */
public class Activity2 {

    static boolean player = true;
    static boolean isPlaying = true;

    //guardar los valores de score
    static int winsMachine = 0;
    static int winsPerson = 0;

    static Scanner sc = new Scanner(System.in);

    final static int PIEDRA = 1;
    final static int PAPEL = 2;
    final static int TIJERA = 3;

    static void main() {

        int playerLastOption = 0;

        do {
            // Si le toca a la persona jugar
            if (player)
            {
                //Optiene opción correcta de la jugada
                playerLastOption = takeOptions();
            }else {
                // Si le toca a la maquina jugar

                int machineOption = randOption();

                checkGameAndUpdate(playerLastOption, machineOption);

            }

            Table.instance()
                    .addRow("Scores", "")
                    .addRow("Ganó maquina", String.valueOf(winsMachine) )
                    .addRow("Ganó personal", String.valueOf(winsPerson) )
                    .print();

            player = !player;
        }while ( isPlaying );

        //Print stats
    }

    /**
     * Imprimir y optener la opcion de piedra papel o tijera
     */
    public static int takeOptions()
    {
        int option = 0;

        do {
            Table.instance()
                    .addRow("Opción", "")
                    .addRow("1", "Piedra")
                    .addRow("2", "Papel")
                    .addRow("3", "Tijera")
                    .print();

            System.out.println("Introduce tu opción:");
            option = sc.nextInt();

            if (option == -1)
            {
                isPlaying = false;
            }

            if ( option < 1 || option > 3 )
            {
                System.out.println("Opcion no valida.");
            }
        }while ( option == 0 );

        return option;
    }

    /**
     * Optiene la opcion aleatoria para la maquina
     * @return
     */
    public static int randOption()
    {
        int max = 3;
        int min = 1;
        return (int)(Math.random() * (max - min+1)) +min;
    }


    /**
     * Verifica quien gano, y actualiza los stats
     * @param player
     * @param machine
     * @return
     */
    public static void checkGameAndUpdate(int player, int machine)
    {
        boolean wonPlayer = true;

        // PIEDRA(0) > tijera(3)
        // PIEDRA(0) < papel(2)

        // TIJERA(3) > PAPEL(2)
        // SI los dos botaron igual, nadie gado
        if ( machine != player )
        {

            if (machine == PIEDRA && player == PAPEL) {
                wonPlayer = false;
            }else if (machine == PIEDRA && player == TIJERA) {
                wonPlayer = false;
            } else if (machine == PAPEL && player == TIJERA) {
                wonPlayer = false;
            }else if (machine == PAPEL && player == PIEDRA) {
                wonPlayer = true;
            }else if (machine == TIJERA && player == PIEDRA) {
                wonPlayer = true;
            }else if (machine == TIJERA && player == PIEDRA) {
                wonPlayer = true;
            }

            // Actualizar score y terminar el juego
            if (wonPlayer)
            {
                winsPerson++;
                MC.title.outlineY("¡FELICIDADES!", "¡GANASTE!");
            }else{
                winsMachine++;
                MC.title.outlineY("😢 SORRY...", "Intentalo de nuevo");
            }

            if (winsMachine >= 5 )
            {
                isPlaying = false;
            }
        }else{
            MC.title.outlineY("¡EMPATE!", "¡juegen de nuevo!");
        }
    }


    public static boolean winByPiedra(int opt)
    {
        return switch (opt) {
            case PAPEL -> false;
            case TIJERA -> true;
            default -> false;
        };
    }
}
