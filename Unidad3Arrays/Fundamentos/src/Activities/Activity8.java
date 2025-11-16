package Activities;

import Utilities.MC;
import Utilities.Table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *  Actividad: Vamos a simular una base de datos de alumnos con calificaciones
 * ➢ Vamos a tener la siguientes estructuras de datos:
 * ➢ Vamos a hacer el código JAVA para:
 * 1) Generar notas aleatorias y un procedimiento para sacar el formato tabla de
 * notas
 * 2) Obtener la calificación media, máximo y mínimo de un alumno
 * 3) ¿Cuántos alumnos han superado un módulo?
 * 4) ¿Cuántos módulos aprueba un alumno?
 * 5) Ahora, haciendo uso de memoria dinámica:
 * a) Añade un nuevo alumno y sus calificaciones.
 * b) Elimina la columna de Programación y sus notas.
 */
public class Activity8 {

    public static String[] alumnos = { "José", "Ana", "María", "Luis", "Domingo" };
    public static String[] modulos = { "Programación", "Entornos", "Bases Datos", "Sistemas" };
    public static double[][] notas = new double[5][4];
    static Scanner sc = new Scanner(System.in);

    static void main() {

        fillNotas();

        Table options = Table.instance()
                .addRow("Opciones")
                .addRow("0", "Cancelar")
                .addRow("1", "Mostrar notas")
                .addRow("2", "Añadir Alumno")
                .addRow("3", "Mostar Alumno")
                .addRow("4", "Mostar Superados")
                .addRow("5", "Eliminar primer módulo");

        boolean takeData = true;
        do {
            options.print();
            System.out.println("Ingrese una opción:");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 0: takeData = false; break;
                case 1:
                    MC.title.outlineY("Notas de los alumnos");
                    System.out.println();
                    printNotas();
                    break;
                case 2: addStudent(); break;
                case 3: showStudent(); break;
                case 4: showSuperados(); break;
                case 5: deleteModule(); break;
                default:
                    System.out.println("Opcion incorrecta, intente de nuevo");
            }

            System.out.println();
            System.out.println();
        }while ( takeData );

        MC.title.outlineY("MUCHAS GRACIAS");
    }

    public static void fillNotas()
    {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = generarNota();
            }
        }
    }

    public static double generarNota() {
        int min = 0, max = 10;
        double number = Double.parseDouble( String.format("%.2f", (Math.random() * (max - min + 1) + min) ) );

        if ( number > 10)
            return 10;

        return number;
    }

    public static void generarModulo() {
    }

    /**
     * Imprime en pantalla el cuadro de notas
     */
    public static void printNotas() {

        Table table = new Table();

        String[] header = new String[ modulos.length + 1];
        header[0] = "";
        for (int m = 0; m < modulos.length; m++) {
            header[m+1] = modulos[m];
        }
        table.addRow( header );

        for (int i = 0; i < notas.length; i++) {

            String[] columns = new  String[ notas[i].length + 1 ];

            columns[0] = alumnos[i];
            for (int j = 0; j < notas[i].length; j++) {
                columns[j+1] = notas[i][j]+"";
            }

            MC.printArray(columns);

            table.addRow( columns );
        }

        table.print();
    }

    static void addStudent()
    {
        String name = "";

        do {
            System.out.print("Ingresa el nombre del alumno: ");
            name = sc.nextLine();

            for (int i = 0; i < alumnos.length; i++) {
                if ( name.equals( alumnos[i] ) )
                {
                    name = "";
                }
            }

            if (name.isEmpty())
            {
                System.out.println("Inserte un nombre que no esté en la lista");
            }

        }while (name.isEmpty());

        String[] newALumns = new String[alumnos.length + 1];
        for (int i = 0; i < alumnos.length; i++) {
            newALumns[i] = alumnos[i];
        }
        newALumns[alumnos.length] = name;

        alumnos = newALumns;

        //Añadir notas

        double[][] newNotas =  new double[alumnos.length][ modulos.length ];
        for (int i = 0; i < newNotas.length; i++) {

            for (int j = 0; j < newNotas[i].length; j++) {
                if ( i == notas.length )
                {
                    newNotas[i][j] = generarNota();
                }else{
                    newNotas[i][j] = notas[i][j];
                }
            }
        }

        notas = newNotas;

        MC.title.outlineY("SE GUARDDO CORRECTAMENTE");
    }

    static void showStudent()
    {
        Table table = new Table();

        for (int i = 0; i < alumnos.length; i++) {
            table.addRow( String.valueOf(i+1), alumnos[i] );
        }

        table.print();

        int alumno = -1;

        do {
            System.out.println("Seleccione una opcion:");
            String option =  sc.nextLine().trim();

            if ( isNumericRegex(option) ) {
                System.out.println("Es un numero");
                int selected = Integer.parseInt( option );

                if ( selected == 0) selected = 1;

                if ( selected <= alumnos.length)
                {
                    System.out.println("Seleccionaste: "+selected+"-1");
                    alumno = selected - 1;
                }
            }else
            {
                for (int i = 0; i < alumnos.length; i++) {
                    if ( alumnos[i].equals(option) ) {
                        alumno = i;
                    }
                }
            }

            if ( alumno == -1 )
            {
                System.out.println("No existe el alumno, introduce el id o el nombre");
            }
        }while( alumno == -1 );

        MC.title.outlineY("SELECCIONASTE", alumnos[alumno]);

        Table data = Table.instance()
                .addRow( alumnos[alumno] );

        double media = 0;
        double max = notas[alumno][0];
        double min = notas[alumno][0];
        ArrayList<String> approvados = new  ArrayList<>();

        for ( int i = 0; i < modulos.length; i++ ) {
            double nota = notas[alumno][i];

            media += nota;

            if ( nota > max ) max = nota;

            if( nota < min ) min = nota;

            if ( nota >= 5)
                approvados.add( modulos[i] );
        }

        media = media / modulos.length;

        data.addRow("Media: ", media+"")
                .addRow( "Maxima", max+"")
                .addRow( "Min", min+"")
                .addRow( "Aprovados ("+approvados.size()+")")
                .addRow("Lista: ", approvados.toString() );

        data.print();
    }

    public static boolean isNumericRegex(String str) {
        return str != null && str.matches("\\d+");
    }

    static void showSuperados()
    {
        Table data = Table.instance().addRow("", "Superados", "Lista");

        for (int i = 0; i < modulos.length; i++) {
            // Guardamos lista de alumnos por course
            //asi sea mas facil en vez de hacer for directo a notas

            ArrayList<String> list = new  ArrayList<>();

            for (int alum = 0; alum < notas.length; alum++) {
                double nota = notas[alum][i];

                if ( nota >= 5)
                {
                    list.add( alumnos[alum] );
                }
            }

            data.addRow( modulos[i], list.size()+"", list.toString() );
        }

        data.print();
    }

    static void deleteModule() {
        if (modulos.length == 0)
        {
            MC.printLine();
            System.out.println("No puedes eliminar mas modulos");
            MC.printLine();
        }else{
            double[][] newNotas = new double[alumnos.length][ modulos.length - 1];

            for (int i = 0; i < notas.length; i++) {
                for (int j = 1; j < notas[i].length; j++) {
                    newNotas[i][j-1] = notas[i][j];
                }
            }

            notas = newNotas;

            String[] names = new String[modulos.length - 1];

            for (int i = 1; i < modulos.length; i++) {
                names[i-1] = modulos[i];
            }

            modulos = names;

            MC.title.outlineY("SE ELIMINO CORRECTAMENTE");
        }
    }
}
