package com.darkredgm.utilitiesmc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class MCFile {
    static Scanner sc = new Scanner(System.in);

    public static boolean isTextFile(File file) {
        return file.getAbsolutePath().endsWith(".txt");
    }

    public static String readAsCharacters(File file ) throws IOException {
        return Files.readString( file.toPath() );
    }

    public static File showContentFromPath( Path dir ) throws IOException {
        MCBox box = new MCBox();

        Stream<Path> stream = Files.list(dir);

        stream.forEach(item -> {
            String name = item.getFileName().toString();
            if (Files.isDirectory(item)) {
                name = "\u001B[35m" + name + "/\u001B[0m";
            }
            box.add(name);
        });

        box.print();

        System.out.println( " {nombre archivo / nombre carpeta} -> para seleccionar    |  {nombre_carpeta}/ -> ir al directorio");
        System.out.println(".. -> retroseder | {nombre_archivo} -> Usar archivo | {ruta_absoluta} -> usar archivo");

        System.out.println("\n Dime tu comando....");
        String action = sc.nextLine();

        if (action.contains(":/") || action.contains(":\\")) {

            File file = new File(action);
            if (file.exists()) {
                return file;
            }

            return showContentFromPath(dir);
        }

        if (action.equals("..")) {
            Path parent = dir.getParent();
            if (parent == null) {
                MC.title.outlineY("\u001B[31mYa estás en la raíz.\u001B[0m");
                return showContentFromPath(dir);
            }

            return showContentFromPath(parent);
        }

        Path target = dir.resolve(action);  // Safe resolve

        if ( !Files.exists(target) ) {
            MC.title.outlineY("\u001B[31mNo encontrado: " + action + "\u001B[0m");
            return showContentFromPath(dir);
        }

        if ( action.endsWith("/") )
        {
            return showContentFromPath(target);
        }

        return new File(target.toUri());
    }

    public static File askFile(String path) throws IOException {
        Path dir = Paths.get(path).normalize().toAbsolutePath();

        File file = showContentFromPath(dir);

        if (file.isDirectory()) {
            MC.title.outlineY("Tienes que seleccionar un arcivo");
        }

        return file;

    }

    public static String askDirectoryPath( String path ) throws IOException {
        Path dir = Paths.get(path).normalize().toAbsolutePath();

        File file = showContentFromPath(dir);

        if ( !file.isDirectory()) {
            MC.title.outlineY("Tienes que seleccionar un directorio");
        }

        return file.getAbsolutePath();
    }

    public static String getBaseName( File file) {
        String fileName = file.getName();

        int lastDot = fileName.lastIndexOf('.');
        if (lastDot > 0) {
            return fileName.substring(0, lastDot);
        }
        return fileName;
    }
}
