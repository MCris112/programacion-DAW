package Activities.Activity6;

import Activities.Activity5.Student;
import Utilities.MC;
import Utilities.Table;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 4) Añade otra opción para modificar el nombre de un alumno tras pasar el
 * id. Si tuviera que modificar el nombre de un alumno tendría que leer el
 * fichero, ir guardando las líneas, cambiar el afectado y luego sobre
 * escribir el resultado. Utiliza un ArrayList<String>
 */
public class Activity6 {

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
                .addRow("3", "Modificar alumno")
                .addRow("0", "Salir")
                .print();

        try{
            int option = Integer.parseInt( sc.nextLine() );

            switch (option){
                case 0: break;
                case 1: showData(); menu(); break;
                case 2: insertData(); menu(); break;
                case 3: modifyData(); menu(); break;
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

        save();
    }

    public static void save()
    {
        File file = new File( PATH );


        try (java.io.PrintWriter pw = new java.io.PrintWriter(file)) {
            // cabecera
            pw.println(String.join(",", headers));

            // filas
            for (Student s : students) {
                pw.println(String.join(",", s.getData()));
            }

            System.out.println("--- Alumno guardado correctamente ---");
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo escribir en el fichero.");
        }
    }

    private static void modifyData()
    {
        System.out.println("=== Buscar alumno por ID ===");

        System.out.println("Escriba la ID: ");
        String id = sc.nextLine();

        boolean found = false;

        for (Student student : students) {
            if ( student.getData()[0].equals(id) ) {
                found = true;
                boolean canContinue = false;

                do {
                    Table table = Table.instance()
                            .addRow("¿Que campo quieres editar?");

                    for (int i = 0; i < headers.size(); i++) {
                        table.addRow((i + 1) + "", headers.get(i));
                    }

                    table.addRow("0", "cancelar");
                    table.print();

                    System.out.println("Inserte una opción:");

                    if ( sc.hasNextInt() ) {
                        int option = sc.nextInt();
                        sc.nextLine();

                        if ( option < headers.size() ) {

                            System.out.println("Valor actual: [ "+student.getData()[option]+" ]");

                            System.out.println("Inserte el nuevo valor:");

                            student.setValueOn(option, sc.nextLine());

                            System.out.println(student);
                            save();
                            canContinue = true;

                        }else{
                            System.out.println("El valor no es valido");
                        }

                    }else{
                        System.out.println("Opcion incorrecta, intente de nuevo");
                    }

                }while (!canContinue);
            }
        }

        if (!found) {
            MC.title.outlineY("No existe el usuario que estas buscando");
        }
    }
}
