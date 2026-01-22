package Activity1;

import Utilities.MC;
import Utilities.MCFile;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 * 1. Crea una aplicación que pida la ruta tde dos ficheros de texto y de una ruta de destino (solo la ruta
 * del directorio). Debes copiar el contenido de los dos ficheros en uno, este tendrá el nombre de los
 * dos ficheros separados por un guion bajo, este se guardará en la ruta de destino que le hayamos
 * indicado.
 * Por ejemplo, si tengo un fichero A.txt con «ABC» como contenido, un fichero B.txt con «DEF» y
 * una ruta de destino D:\, el resultado sera un fichero llamado A_B.txt en la ruta D:\ con el contenido
 * «ABC
 * DEF».
 */
public class Activity1 {

    static Scanner sc = new Scanner(System.in);



    static void main() {
        File fileOne;
        File fileTwo;
        String directory;

        System.out.println("¿Donde está el primer fichero?");

        try{
            MC.title.outline("Seleccion de archivo 1");
            fileOne = MCFile.askFile("./");

            if ( !MCFile.isTextFile(fileOne)) {
                System.out.println("El archivo 1 tiene que ser de formato texto");
                return;
            }

            MC.title.outlineY("Archivo leido:", fileOne.getAbsolutePath() );

            MC.title.outline("Seleccion de archivo 2");
            fileTwo = MCFile.askFile("./");

            if ( !MCFile.isTextFile(fileTwo)) {
                System.out.println("El archivo 2 tiene que ser de formato texto");
                return;
            }


            MC.title.outlineY("Archivo leido:", fileOne.getAbsolutePath() );


            if ( fileOne.equals(fileTwo) )
            {
                System.out.println("No pueden ser los mismos archivos para mostrar");
                return;
            }

            MC.title.outline("Seleccion de directorio salida");
            directory = MCFile.askDirectoryPath("./");
            MC.title.outlineY("Directorio leido:", directory );

            System.out.println(directory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path dir = Paths.get(directory).normalize().toAbsolutePath();

        File fileOutput = new File(dir.resolve( MCFile.getBaseName(fileOne)+"_"+MCFile.getBaseName(fileTwo)+".txt" ).toUri());

        try
        {
            String content = MCFile.readAsCharacters( fileOne );

            content += "\n" + MCFile.readAsCharacters( fileTwo );
            System.out.println( content );

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutput));
            writer.write(content);
            writer.flush();
            writer.close();

            System.out.println("Fichero creado: " + fileOutput.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
