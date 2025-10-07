import Utilities.MC;

import java.util.Scanner;

public class Activity6FuncionRecursiva {

    static Scanner sc = new Scanner(System.in);

    static void main() {

        One.run();

        //Two.run();

        //Three.run();

        // Four.run();
    }

    /**
     * Función que devuelve la cantidad de dígitos de un número
     * positivo
     */
    static class One {

        static void run()
        {
            MC.printTitle("Contar digitos");

            System.out.print("Inserte un número: ");
            int numero = sc.nextInt();

            sc.nextLine();

            if ( numero == 0)
            {
                MC.printTitle("Digitos: 1");
            }else {
                MC.printTitle("Digitos: " + contarDigitos(numero, 0));
            }
        }

        static int contarDigitos(int numero, int digitos)
        {
            if ( numero <= 0 )
            {
                return digitos;
            }

            return contarDigitos( numero / 10, digitos + 1 );
        }

    }

    /**
     * Función que devuelve la suma de los números naturales desde 1
     * hasta N. Compara el código con el que se obtendría iterativo.
     */
    static class Two {

        static void run()
        {
            MC.printTitle("Devolucion de suma");

            System.out.println();
            System.out.print("Inserte n: ");
            int a = Math.abs(sc.nextInt());


            int sum = suma(0, a);

            MC.printTitle("Suma total: "+sum);
        }

        public static int suma(int num, int pos)
        {
            if (pos == 0)
                return num;

            return suma( num + pos, pos - 1 );
        }
    }

    /**
     * Función que calcula ab
     *  usando recursividad. Recordad que
     * a
     * b=a*ab-1
     */
    static class Three
    {
        static void run()
        {
            MC.printTitle("Funcion calcula");

            System.out.println();
            System.out.print("Inserte a: ");
            int a = Math.abs(sc.nextInt());

            System.out.print("Inserte b: ");
            int b = Math.abs(sc.nextInt());

            sc.nextLine();

            MC.printTitle("Resultado: "+ (a * multriplicar(a, b-1)) );
        }

        static int multriplicar(int a, int b)
        {
            return a * b;
        }
    }

    /**
     * Metodo recursivo para pasar un número decimal, que
     * compruebe que es positivo, y pasarlo a binario mediante
     * sucesivas divisiones por 2
     */
    static class Four
    {
        static void run()
        {
            MC.printTitle("Convertidor a binario");

            System.out.print("Inserte un número: ");
            int num = Math.abs(sc.nextInt());

            if ( num < 0)
            {
                MC.printTitle("El número no es positivo");
            }else{
                System.out.println();

                MC.printTitle("Resultado: "+convierte(num, ""));
            }
        }

        static String convierte(int num, String binario)
        {
            //paso 4
            if ( num == 0 )
                return binario;

            return convierte( num/2 , num%2+ binario);
        }
    }

    //Metodo Torres de Hanoi Recursivo
    public static void Hanoi(int n, int origen, int auxiliar, int destino){
        if(n==1){
            System.out.println("mover disco de " + origen + " a " + destino);
        }else{
            //Se llevan los n-1 de origen al auxiliar
            Hanoi(n-1, origen, destino, auxiliar);
            //Se llevan el que queda a destino
            System.out.println("mover disco de "+ origen + " a " + destino);
            //Se llevan los n-1 de auxiliar a destino
            Hanoi(n-1, auxiliar, origen, destino);
        }
    }

}
