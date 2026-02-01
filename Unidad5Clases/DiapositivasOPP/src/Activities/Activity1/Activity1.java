package Activities.Activity1;

import Utilities.MC;

import java.io.*;
import java.util.Scanner;

/**
 * Como ejemplo para el 3
 * en Raya, ¿Cómo sería incorporar la
 * lectura y escritura de la estadística
 * de cuántas veces ha ganado jugador
 * 1 y 2. Se guarda como: jugador1=3
 */
public class Activity1 {

    static String PATH = "src/Activities/Activity1/data.txt";

    static void main() {
        // La posicion 0, es el jugador 1, y la posicion 1 es el jugador 2
        int[] score = { 0, 0 };

        // Leer archivo de configuración
        try
        {
            Scanner scanner = new Scanner(new FileReader(PATH));

            while (scanner.hasNextLine())
            {
                String[] line = scanner.nextLine().split("=");

                if ( line[0].equals("jugador1") )
                {
                    score[0] = Integer.parseInt(line[1]);
                }

                if ( line[0].equals("jugador2") )
                {
                    score[1] = Integer.parseInt(line[1]);
                }
            }

        }catch (FileNotFoundException e)
        {
            MC.title.outlineY("El archivo no pudo ser encontrado");
            throw new RuntimeException();
        }



        //SIMULAR EL JUEGO QUE AMBOS GANARON UN PUNTO EN 2 PARTIDAS
        score[0] +=1;
        score[1] +=1;

        // GUardar nueva configuración

        try{
            BufferedWriter writer = new  BufferedWriter( new FileWriter(PATH) );

            writer.write("jugador1="+score[0]+"\n"+"jugador2="+score[1]);
            writer.flush();

            writer.close();
            MC.title.outlineY("El archivo guardado exitosamente", new File(PATH).getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
