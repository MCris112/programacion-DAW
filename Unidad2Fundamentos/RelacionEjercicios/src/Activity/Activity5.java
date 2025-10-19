package Activity;

import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 5. Escribe un programa que muestre tu horario de clase. Si le pides un día de la semana (1 a 5) te
 * indicará las materias de ese día, si le indicas 6 devolverá el horario completo (hazle formato) y con
 * 7 se cerrará el programa.
 */
public class Activity5 {

    public static void main()
    {
        MC.title.outline("¿Cual es mi horario?");

        Scanner sc = new Scanner(System.in);
        boolean tomarDatos = true;

        while(tomarDatos) {
            System.out.println("Ingrese un dia de la semana (1-5), 6: completo:");
            int pos = sc.nextInt();

            switch (pos)
            {
                case 1:
                    printMonday();
                    break;
                case 2:
                    printTuesday();
                    break;
                case 3:
                    printWednesday();
                    break;
                case 4:
                    printThursday();
                    break;
                case 5:
                    printFriday();
                    break;
                case 6:
                    printFormated();
                    break;
                default:
                    tomarDatos = false;
                    break;
            }
        }

        MC.title.outline("Muchas Gracias");
    }

    public static void printMonday()
    {
        Table.instance()
                .addRow("Hora", "Lunes")
                .addRow("8-9am", "IPE I")
                .addRow("9-10", "SIST.INF")
                .addRow("10-11", "GBD")
                .addRow("11-11:30", "RECREO")
                .addRow("11:30-12:30", "GBD")
                .addRow("12:30-2:30", "PROGRAMACIÓN")
                .print();
    }

    public static void printTuesday() {
        Table.instance()
                .addRow("Hora", "Martes")
                .addRow("8-9am", "LMSGI")
                .addRow("9-11", "SIST.INF")
                .addRow("11-11:30", "RECREO")
                .addRow("11:30-1:30", "PROG")
                .addRow("1:30-2:30", "ENT.DESA")
                .print();
    }

    public static void printWednesday() {
        Table.instance()
                .addRow("Hora", "Miércoles")
                .addRow("8-10", "GBD")
                .addRow("10-11", "SIST.INF")
                .addRow("11-11:30", "RECREO")
                .addRow("11:30-12:30", "SIST.INF")
                .addRow("12:30-2:30", "PROGRAMACIÓN")
                .print();
    }

    public static void printThursday() {
        Table.instance()
                .addRow("Hora", "Jueves")
                .addRow("8-9am", "PROG")
                .addRow("9-11", "ENT.DESA")
                .addRow("11-11:30", "RECREO")
                .addRow("11:30-12:30", "IPE I")
                .addRow("12:30-1:30", "GBD")
                .addRow("1:30-2:30", "Sostenibilidad")
                .print();
    }

    public static void printFriday() {
        Table.instance()
                .addRow("Hora", "Viernes")
                .addRow("8-9", "GBD")
                .addRow("9-10", "Digitalización")
                .addRow("10-11", "LMSGI")
                .addRow("11-11:30", "RECREO")
                .addRow("11:30-12:30", "LMSGI")
                .addRow("12:30-1:30", "IPE I")
                .addRow("1:30-2:30", "PROG")
                .print();
    }

    public static void printFormated() {
        Table.instance()
                .addRow("Hora",    "Lunes",        "Martes",       "Miércoles",    "Jueves",       "Viernes")
                .addRow("8-9",     "IPE I",        "LMSGI",        "GBD",          "PROG",         "GBD")
                .addRow("9-10",    "SIST.INF",     "SIST.INF",     "SIST.INF",     "ENT.DESA",     "Digitalización")
                .addRow("10-11",   "GBD",          "SIST.INF",     "SIST.INF",     "ENT.DESA",      "LMSGI")
                .addRow("11-11:30", "RECREO")
                .addRow("11:30-12:30","GBD",       "PROG",         "SIST.INF",     "IPE I",        "LMSGI")
                .addRow("12:30-1:30","PROGRAMACIÓN","PROG",        "PROGRAMACIÓN", "GBD",          "IPE I")
                .addRow("1:30-2:30","PROGRAMACIÓN","ENT.DESA",     "PROGRAMACIÓN", "Sostenibilidad","PROG")
                .print();
    }

}
