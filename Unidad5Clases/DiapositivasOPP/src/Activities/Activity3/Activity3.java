package Activities.Activity3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 1) Implementa una clase que lee el contenido de un fichero, solicita una
 * palabra por teclado y dice cuántas veces aparece en el texto. Utiliza
 * split("\\s+") para separar por uno o varios espacios.
 */
public class Activity3 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra a buscar");

        String word = sc.nextLine();
        int counter = 0;

        File file = new File("src/Activities/Activity3/tale.txt");
        // Scanner para leer el fichero línea a línea
        try (Scanner lector = new Scanner(file)) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                // separar por uno o varios espacios en blanco
                String[] palabras = linea.split("\\s+");
                for (String p : palabras) {
                    if (p.equalsIgnoreCase(word) || p.equalsIgnoreCase(word + ",")) {
                        counter++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero: " + file.getPath());
            return;
        }

        System.out.println("La palabra \"" + word
                + "\" aparece " + counter + " veces en el texto.");
    }
}
