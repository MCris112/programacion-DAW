package Activities.Activity2;

import Utilities.MC;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ¿Y si tuvieras que escribir
 * un array como la Bonoloto?
 */
public class Activity2 {

    static String PATH = "src/Activities/Activity2/data.txt";

    static void main() {

        int[] bonoloto = new int[8];

        for (int i = 0; i < bonoloto.length; i++) {
            //Generar numero al azar entre el 0 y 9
            bonoloto[i] = (int)(Math.random()*49)+1;
        }

        MC.title.outlineY("Bonoloto generado");
        MC.printArray(bonoloto);

        try{
            BufferedWriter writer = new BufferedWriter( new FileWriter(PATH) );

            for (int i = 0; i < bonoloto.length; i++) {
                writer.write( String.valueOf(bonoloto[i]) );
                if (i < bonoloto.length - 1) {
                    writer.write(","); // Separar con comas
                }
            }

            writer.flush();
            writer.close();

            System.out.println("Se guardo correctamente:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
