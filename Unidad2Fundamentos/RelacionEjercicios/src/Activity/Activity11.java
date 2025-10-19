package Activity;

import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 11. Desarrolla un programa que use funciones creadas para simular una calculadora según la opción
 * introducida y que pida los operandos hasta que introduces -1. El menú será un procedimiento.
 */
public class Activity11 {

    static Scanner sc = new Scanner(System.in);

    static void main() {

        boolean tomarDatos = true;

        while ( tomarDatos )
        {
            printMenu();

            System.out.println();
            System.out.print("Inserte número: ");
            int operacion = sc.nextInt();

            if (operacion < 0) {
                tomarDatos = false;
            }else{
                switch ( operacion )
                {
                    case 1:
                       sumar();
                        break;
                    case 2:
                        resta();
                        break;
                    case 3:
                        multiplicar();
                        break;
                    case 4:
                        dividir();
                        break;
                    default:
                        System.out.println(operacion + " no valido");
                        break;
                }

            }
        }

        MC.title.outline("Muchas Gracias");
    }

    public static void printMenu()
    {
        Table.instance()
                .addRow("Opción", "Operación")
                .addRow("1", "Sumar")
                .addRow("2", "Restar")
                .addRow("3", "Multiplicar")
                .addRow("4", "Dividir")
                .print();
    }

    public static void sumar()
    {
        int resultado = 0;

        System.out.println("Introduce números a sumar (-1 para terminar):");
        int num = sc.nextInt();

        while (num != -1) {
            resultado += num;
            num = sc.nextInt();
        }

        MC.title.outlineY("El resultado es: "+resultado);
    }

    public static void resta()
    {
        int resultado = 0;

        System.out.println("Introduce números a restar (-1 para terminar):");
        int num = sc.nextInt();

        while (num != -1) {
            resultado -= num;
            num = sc.nextInt();
        }

        MC.title.outlineY("El resultado es: "+resultado);
    }

    public static void multiplicar() {
        int resultado = 1;
        System.out.println("Introduce números a multiplicar (-1 para terminar):");
        int num = sc.nextInt();

        while (num != -1) {
            resultado *= num;
            num = sc.nextInt();
        }

        MC.title.outlineY("El resultado es: "+resultado);
    }

    public static void dividir() {
        System.out.println("Introduce el primer número:");
        int resultado = sc.nextInt();

        System.out.println("Introduce más números para dividir (-1 para terminar):");
        int num = sc.nextInt();

        while (num != -1) {
            resultado /= num;

            num = sc.nextInt();
        }

        MC.title.outlineY("El resultado es: "+resultado);
    }
}
