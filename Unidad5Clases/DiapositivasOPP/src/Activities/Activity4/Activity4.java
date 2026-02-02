package Activities.Activity4;

import Utilities.MC;
import Utilities.MCFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 2) Implementa una clase que lee el contenido de un fichero, cuya ruta le
 * indicas por teclado, y lo escribe en otro fichero con el mismo nombre y
 * añadiendo copia y fecha. Ejemplo: fichero→
 * fichero_copia_yyyy_mm_dd.txt. Recuerda usar LocalDate.now() y que
 * para sacar el nombre sin la extensión puedes usar nombre.substring(0,
 * nombre.lastIndexOf('.'));
 */
public class Activity4 {

    static void main() {
        File file;

        try{
            //Pide el archivo para leer
             file = MCFile.askFile("./");

             // Verifica si realmente el archivo se puede leer
             if ( !MCFile.isCharacterFile(file) )
             {
                 MC.title.outlineY("El archivo seleccionado no es un texto");
                 throw new IOException();
             }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Guarda el contenido del archivo

        String content = "";

        try{
            Scanner sc = new Scanner( file );

            while ( sc.hasNextLine() )
            {
                content += sc.nextLine()+ "\n";;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Normaliza el nombre para guardar
        String finalPath = generateCopySlug(file);

        try{
            FileWriter writer = new FileWriter(finalPath);

            // guarda el nuevo archivo
            writer.write(content);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        MC.title.outline("El archivo fue guardado correctamente", new File(finalPath).getAbsolutePath());
    }


    /**
     * Normaliza el nombre del archivo a lo pedido en la actividad
     * @param file
     * @return
     */
    public static String generateCopySlug(File file) {
        String originalName = file.getName();

        // 1. Obtener nombre y extensión correctamente
        String nameWithoutExt = originalName;
        String extension = "";

        int dotIndex = originalName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < originalName.length() - 1) {
            nameWithoutExt = originalName.substring(0, dotIndex);
            extension = originalName.substring(dotIndex + 1);
        }

        // 2. Sanitizar nombre (remover caracteres inválidos)
        String cleanName = nameWithoutExt
                .replaceAll("[^a-zA-Z0-9\\s-]", "")  // Solo letras, números, espacios, guiones
                .trim()
                .replaceAll("[\\s-]+", "_")          // Múltiples espacios/guiones -> un solo _
                .replaceAll("^_+|_+$", "");          // Remover guiones al inicio/final

        // 3. Fecha formateada
        String dateStr = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("yyyy_MM_dd"));

        // 4. Construir nombre final
        String finalFileName = String.format("%s_copia_%s%s%s",
                cleanName,
                dateStr,
                !extension.isEmpty() ? "." + extension : "",
                !extension.isEmpty() ? "" : ".txt" // Extensión por defecto si no tiene
        );

        // 5. Ruta final
        return "src/Activities/Activity4/" + finalFileName;
    }
}
