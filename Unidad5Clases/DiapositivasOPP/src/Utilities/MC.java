package Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class MC {


    private static int containerLenght = 30;

    public static MCTitle title = new MCTitle();

    public static void printBanner() {
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


    public static void print(String text) {
        System.out.println(text);
    }

    public static void printRow(String text) {
        System.out.printf("| %-30s | \n", text);
    }

    public static void printRow(double text) {
        System.out.printf("| %-30s | \n", text);
    }

    public static void printRow(int text) {
        System.out.printf("| %-30d | \n", text);
    }

    public static void printLine() {
        System.out.println("|--------------------------------|");
    }

    public static void printTable(String title, ArrayList<TableRow> rows) {

    }

    public static void printRows(String[] rows, int spaces, boolean showTop) {
        System.out.print("|");

        if (showTop) {

        }

        for (int i = 0; i < rows.length; i++) {
            System.out.printf(" %-" + spaces + "s |", rows[i]);

        }

        System.out.println();

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1)
                System.out.print(", ");
        }

        System.out.println();
    }

    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1)
                System.out.print(", ");
        }

        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
