package Activity1;

import Utilities.MC;
import Utilities.MCFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Realiza un programa que lee un fichero java indicado por teclado y que tiene comentarios
 * indicados con //. Se quiere sobre escribir el mismo archivo de salida con el mismo código funcional
 * de java pero sin los comentarios, para ello utilizarás un ArrayList<String> donde guardarás cada
 * línea que vas leyendo y que luego pasarás para escribir. Sólo se borrarán los que tienen el
 * comentario al principio de línea y hay que comprobar si el archivo que pasas existe o no. (2 puntos)
 * Ejemplo:
 * // Comentario de cabecera
 * public class Ejemplo {
 *  public static void main(String[] args) {
 *  System.out.println("Hola"); // este comentario NO se borra
 *  }
 *  // Otro comentario
 * }
 * Tras ejecutar vuestro programa quedará como este y este fichero java resultado funcionará igual:
 * public class Ejemplo {
 *  public static void main(String[] args) {
 *  System.out.println("Hola"); // este comentario NO se borra
 *  }
 * }
 */
public class Activity1 {

    static void main() {
        File file;

        try{
            file = MCFile.askFile("./");

            if ( !MCFile.isCharacterFile(file) )
            {
                MC.title.outlineY("TIENE QUE SER UN ARCHIVO DE TEXTO");
                throw new IOException();
            }
        } catch (IOException e) {
            MC.title.outlineY("OCURRIO UN ERROR");
            throw new RuntimeException(e);
        }

        ArrayList<String> content = new ArrayList<>();

        try{
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {

                String line =  reader.nextLine();

                // Omitir toda la linea si está al comienzo
                if ( !line.startsWith("//") )
                {
                    // omitir el comentario si está al final eo en otra parte, solo la primera parte es verdadera
                    content.add( line.split("//")[0] );
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String folder = file.getParent();
        String extension = file.getName().substring( file.getName().lastIndexOf('.') );

        String name = file.getName().replace(extension, "") + "Copy."+extension;

        String fullPath = folder + "/" + name;

        try{
            BufferedWriter writer = new BufferedWriter( new FileWriter( fullPath ) );

            String result = "";
            for (String line : content) {
                writer.write(line);
                writer.newLine();
            }

            writer.flush();
            writer.close();
            MC.title.outlineY("Compilacion exitosa", fullPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
