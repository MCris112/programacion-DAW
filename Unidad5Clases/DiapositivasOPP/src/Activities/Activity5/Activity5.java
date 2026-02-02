package Activities.Activity5;

import Utilities.Table;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 3) Implementa una clase que procesa un fichero csv con datos de alumnos,
 * donde la primera fila son los nombres de columnas (no sabes los que
 * tendrá), y trata de hacer un menú que permita leer los alumnos
 * guardados y que permita insertar nuevos.
 */
public class Activity5 {

    public static String PATH = "src/Activities/Activity5/students.csv";
    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> headers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();

    static void main() {

        try {
            Scanner reader = new Scanner( new File(PATH) );

            int position = 0;
            while ( reader.hasNextLine() ){
                String line = reader.nextLine();
                // separar por uno o varios espacios en blanco
                String[] data = line.split(",");

                if ( position == 0 ){
                    headers.addAll(Arrays.asList(data));
                }else {
                    students.add( new Student( data ) );
                }

                position++;
            }

            menu();

        } catch (FileNotFoundException e) {
            System.out.println("File not exists");
        }

    }

    public static void menu(){
        Table.instance()
                .addRow("1", "Mostrar datos")
                .addRow("2", "Insertar dato")
                .addRow("0", "Salir")
                .print();

        try{
            int option = Integer.parseInt( sc.nextLine() );

            switch (option){
                case 0: break;
                case 1: showData(); menu(); break;
                case 2: insertData(); menu(); break;
                default:
                    System.out.println("--- Opción incorrecta, intente de nuevo ---");
                    break;
            }
        }catch ( Exception e){
            System.out.println("--- Opción incorrecta, intente de nuevo ---");
            System.out.println();
            menu();
        }
    }


    private static void showData() {

        Table table = new Table();

        table.addRow( headers );

        for( Student student: students){
            table.addRow( student.getData() );
        }

        table.print();
    }

    private static void insertData() {
        // Pedir datos de cada columna
        String[] data = new String[headers.size()];

        System.out.println("=== Insertar nuevo alumno ===");
        for (int i = 0; i < headers.size(); i++) {
            System.out.print(headers.get(i) + ": ");
            data[i] = sc.nextLine();
        }

        // Crear objeto Student y añadir a la lista en memoria
        Student newStudent = new Student(data);
        students.add(newStudent);

        // (Opcional) Persistir la lista completa de nuevo al CSV
        File file = new File("src/Activities/Activity5/students.csv");


        try (java.io.PrintWriter pw = new java.io.PrintWriter(file)) {
            // cabecera
            pw.println(String.join(",", headers));

            // filas
            for (Student s : students) {
                pw.println(String.join(",", s.getData()));
            }

            System.out.println("--- Alumno insertado correctamente ---");
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo escribir en el fichero.");
        }
    }
}
