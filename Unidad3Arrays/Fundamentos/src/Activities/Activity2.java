package Activities;

import Utilities.MC;
import Utilities.Table;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Realiza un programa que muestra tu horario y qué clases tienes hoy
 */
public class Activity2 {

    static String[][] horario = {
            { "HORA", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES"},
            { "8:00", "IPEI", "LMSGI", "GBD", "PROG", "GBD"},
            { "9:00", "SIST.INF", "SIST.INF", "GBD", "ENT.DSA", "Digitalización"},
            { "10:00", "GBD", "SIST.INF", "SIST.INF", "ENT.DESA", "LMSGI"},
            { "11:00", "RECREO", "RECREO", "RECREO", "RECREO", "RECREO"},
            { "11:30", "GBD", "PROG", "SIST.INF", "IPE I", "LMSGI"},
            { "12:30", "PROG", "PROG", "PROG", "GBD", "IPE I"},
            { "1:30", "PROG", "ENT.DESA", "PROG", "Sostenibilidad", "PROG"}
    };

    static void main() {

        int option = 0;

        do {
            Table.instance()
                    .addRow("Opciones")
                    .addRow("1", "Mostrar todo")
                    .addRow("2", "¿Que tengo hoy?")
                    .print();

            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte una opción");

            option = Integer.parseInt( sc.nextLine() );

            if( option < 1 || option > 2)
            {
                option = 0;

                MC.title.outlineY("Opción incorrecta");
            }
        }while (option == 0);


        System.out.println();
        System.out.println();

        if (option == 1) {
            printTable(horario);
        }else{
            LocalDateTime time  = LocalDateTime.now();

            int day = time.getDayOfWeek().ordinal() + 1;

            if ( day >= (horario[0].length) )
            {
                MC.title.outlineY("No tienes clases hoy");
            }else{
                printDay( day );
            }

        }
    }

    public static void printTable(String[][] matrix)
    {
        Table table = Table.instance();

        for (int i = 0; i < matrix.length; i++) {
            table.addRow( matrix[i] );
        }

        table.print();
    }


    public static void printDay(int day)
    {
        Table table = Table.instance();

        for (int i = 0; i < horario.length; i++) {
            table.addRow( horario[i][0], horario[i][day] );
        }

        table.print();
    }
}
