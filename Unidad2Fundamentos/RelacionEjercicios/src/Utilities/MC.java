package Utilities;

import java.util.ArrayList;

public class MC {

    private static int containerLenght = 30;

    public static MCTitle title = new MCTitle();

    public static void printBanner()
    {
        /**
         *   ██████╗██████╗ ██╗██╗███████╗
         *  ██╔════╝██╔══██╗██║██║██╔════╝
         *  ██║     ██████╔╝██║██║███████╗ 24 {9}, 25 {10}
         *  ██║     ██╔═══╝ ██║██║╚════██║
         *  ╚██████╗██║     ██║██║███████║
         *   ╚═════╝╚═╝     ╚═╝╚═╝╚══════╝
         */
        System.out.println("\n");
        System.out.println("   ██████╗██████╗ ██╗ ███████╗");
        System.out.println("  ██╔════╝██╔══██╗██║ ██╔════╝");
        System.out.println("  ██║     ██████╔╝██║ ███████╗");
        System.out.println("  ██║     ██╔═██║ ██║ ╚════██║");
        System.out.println("  ╚██████╗██║ ██║ ██║ ███████║");
        System.out.println("   ╚═════╝╚═╝ ╚═╝ ╚═╝ ╚══════╝");
        System.out.println("\n");
    }


    public static void print(String text)
    {
        System.out.println(text);
    }

    public static void printRow(String text)
    {
        System.out.printf("| %-30s | \n", text );
    }

    public static void printRow(double text)
    {
        System.out.printf("| %-30s | \n", text );
    }

    public static void printRow(int text)
    {
        System.out.printf("| %-30d | \n", text );
    }

    public static void printLine()
    {
        System.out.println("|--------------------------------|");
    }

    public static void printTable(String title, ArrayList<TableRow> rows)
    {

    }
    public static void printRows(String[] rows, int spaces, boolean showTop)
    {
        System.out.print("|");

        if (showTop)
        {

        }

        for (int i = 0; i < rows.length; i++)
        {
            System.out.printf(" %-"+spaces+"s |", rows[i]);

        }

        System.out.println();

    }
}
