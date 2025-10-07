import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

public class Activity5Functions {

    static Scanner sc = new Scanner(System.in);

    public static void main(){

        /*
        Calcular el máximo de 3 números si existe la función maximo(a,b).
        Después aplica ambas para el caso de máximo de 5 números. Ten en cuenta que
        una función se puede utilizar en una expresión Ej: int a= 5+maximo(3,7); o int
        b=maximo(maximo(2,3),4);
         */
        int a = 5 + maximo(3, 7);

        int b = maximo( maximo(2,3), 4);


        /*
            Crea un procedimiento para calcular el área y volumen
            de un cilindro (2*PI*(altura+radio), PI*radio2*altura
         */
        //ActivityTwo.run();

        /*
        Crear las funciones esPar, esDivisible3 y un
        procedimiento para imprimir los números pares divisibles por 3 que
        hay entre 1 y 20
         */

        ActivityThree.run();
    }



    static int maximo(int num1, int num2)
    {
        if (num1>num2)
        {
            return(num1);
        }

        return num2;
    }

    /**
     * Crea un procedimiento para calcular el área y volumen
     * de un cilindro (2*PI*(altura+radio), PI*radio2*altura
     */
    static class ActivityTwo
    {
        static void run()
        {
            MC.printTitle("Calcular el area y vol");

            System.out.print("Inserte el radio: ");
            int a = sc.nextInt();

            System.out.print("Inserte la altura: ");
            int b = sc.nextInt();

            sc.nextLine();

            double area = calcArea(a,b);
            double volumen = calcVolumen(a,b);

            Table table = new Table("Tabla "+a);
            table.addRow("Área", ""+area);
            table.addRow("Volumen", ""+volumen);
            table.print();
        }

        static double calcArea(int radio, int altura)
        {
            return 2*Math.PI*(altura+radio);
        }

        static double calcVolumen(int radio, int altura)
        {
            return Math.PI*(radio*radio)*altura;
        }
    }




    static class ActivityThree
    {
        static void run()
        {
            MC.printTitle("Divisible 2 y 3");

            for (int i = 1; i <= 20; i++ ) {

                if ( esPar(i) && esDivisible3(i))
                MC.printRow(i);
            }

            MC.printLine();
        }

        static boolean esPar(int num)
        {
            return num%2==0;
        }

        static boolean esDivisible3(int num)
        {
            return num%3==0;
        }
    }

}
