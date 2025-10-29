import Utilities.MC;
import Utilities.Table;

import java.util.Arrays;
import java.util.Scanner;

public class Activity3Bucles {

    static Scanner sc = new Scanner(System.in);

    public static void main() {

        //isMultiplo();

        // calFactorial();

//        maxMinYearsOld();

         calcSumStudents();

        //aleatorioGame();

        //calculadora();

        //algoritmosMDCMCM();
    }


    /**
     * Actividad 1
     * Desarrolla un programa que muestre los números
     * entre 50 y 200 que son múltiplos de 2 y 3
     */
    static void isMultiplo()
    {
        MC.printTitle("Verificar si es multiplo");

        MC.printRow("Multiplos entre 50-200");
        MC.printLine();

        for (int i = 50; i <= 200; i++)
        {
            if ( i%2 == 0 && i%3 == 0 )
            {
                MC.printRow( i );
            }
        }

        MC.printLine();
    }


    /**
     * Actividad 2
     * Desarrolla un programa que calcule el factorial del
     * número introducido. Ej: 4!= 4*3*2*1
     */
    static void calFactorial()
    {
        MC.printTitle("Calcular factorial");

        System.out.print("Introduce un número: ");
        int number = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++)
        {
            factorial *= i;
        }

        MC.printLine();
        MC.printRow("El factorial de "+number+" es:");
        MC.printRow(factorial);
        MC.printLine();
    }


    /**
     * Actividad 3
     * Desarrolla un programa que muestre la edad
     * máxima y mínima de un grupo de alumnos que se
     * introduzca hasta escribir -1
     */
    static void maxMinYearsOld()
    {
        MC.printTitle("Calcular la edad máx y min");
        MC.printRow("Escribe -1 para terminar el programa ");
        MC.printLine();

        int min = 0, max = 0, current = 1;

        // Form 1 - detectando haste que current sea -1
//        while ( current > -1)
//        {
//            System.out.println();
//
//            System.out.print("Introduce una edad: " );
//            current = sc.nextInt();
//
//
//            if ( current <= min || min == 0 )
//            {
//                min = current;
//            }
//
//            if ( current >= max  || max == 0)
//            {
//                max = current;
//            }
//
//            MC.printTitle("Edades");
//            MC.printRow("Minima: "+min);
//            MC.printRow("Máxima: "+max);
//            MC.printLine();
//        }

        //Forma 2 - Aplicando if else

        while (min != -1){
            System.out.println();

            System.out.print("Introduce una edad: " );
            current = sc.nextInt();

            if ( current != -1 )
            {
                if ( current <= min || min == 0 )
                {
                    min = current;
                }

                if ( current >= max  || max == 0)
                {
                    max = current;
                }

                MC.printTitle("Edades");
                MC.printRow("Minima: "+min);
                MC.printRow("Máxima: "+max);
                MC.printLine();
            }else{
                MC.printTitle("Muchas gracias");
            }
        }

        //Forma 3 - mediante una funcion

        //maxMinYearsAsk(min, max);
    }

    /**
     * Esta funcion es para hacer un rellamado de la 3ra forma
     * imprime los datos en pantalla y se detiene al detectar
     * que es -1
     * @param min edad menor actual
     * @param max edad mayor actual
     */
    static void maxMinYearsAsk(int min, int max)
    {
        System.out.println(); //Estetico diseño, para que haya espacio

        System.out.print("Introduce una edad: " );
        int current = sc.nextInt();

        if (current != -1)
        {
            if ( current <= min || min == 0 )
            {
                min = current;
            }

            if ( current >= max  || max == 0)
            {
                max = current;
            }

            MC.printTitle("Edades");
            MC.printRow("Minima: "+min);
            MC.printRow("Máxima: "+max);
            MC.printLine();

            maxMinYearsAsk(min, max);
        }else{
            MC.printTitle("Muchas gracias");
        }
    }

    /**
     * Actividad 4
     * Desarrolla un programa que calcule la suma,
     * media, número de alumnos y cuántos son mayores
     * de edad
     */
    static void calcSumStudents()
    {
        // Este código me baso en que aun no sabemos a usar arrays

        int alumnTotales = 0; //variable para saber la media
        int mayoresEdad = 0;
        int sumEdades = 0;
        int mediaEdad = 0; // Lo dejo en int porque quiero un numero entero
        int currentEdad = 0;

        MC.printTitle("Calcular suma, media y mayores");
        MC.printRow( "Cancelar: cualquier numero negativo");
        MC.printLine();

        boolean tomarDatos = true;


        while ( tomarDatos )
        {
            System.out.println(); //Estetico diseño, para que haya espacio
            System.out.print("Introduce una edad: " );
            currentEdad = sc.nextInt();

            if ( currentEdad < 0)
            {
                tomarDatos = false;
            }else{
                //sumar el alumno registrado
                alumnTotales++;

                //calcular suma de edades:
                sumEdades += currentEdad;

                //calcular media de las edades
                mediaEdad = sumEdades/alumnTotales;

                //verificar si es mayor de edad
                if ( currentEdad > 18 )
                {
                    mayoresEdad++;
                }

                MC.printTitle("DATOS");
                MC.printRow("Suma total: "+sumEdades);
                MC.printRow("Media: "+mediaEdad);
                MC.printRow("Mayores de edad: "+mayoresEdad);
                MC.printRow("Totales registrados: "+alumnTotales);
                MC.printLine();
            }
        }

        MC.printTitle("Muchas gracias");
    }

    /**
     * Actividad 5
     * Desarrolla un programa que trate de adivinar un
     * número entre 1 y 100 generado aleatorio, que vaya
     * indicando si has introducido un número mayor o
     * menor al correcto y el número de intentos.
     */
    static void aleatorioGame()
    {
        MC.printTitle("Juego aleatorio entre: 1 -100");
        MC.printRow( "END: cualquier numero negativo");
        MC.printLine();

        int current = 0;
        int intentos = 0;
        boolean tomarDatos = true;

        while ( tomarDatos )
        {
            intentos++;

            System.out.println(); //Estetico diseño, para que haya espacio
            System.out.print("Introduce un número: " );
            current = sc.nextInt();

            if (current < 0)
            {
                tomarDatos = false;
            }else{
                int aleatorio = (int) (Math.random()*(100-1+1))+1;

                if ( current == aleatorio)
                {
                    MC.printTitle("GANASTE!");
                    tomarDatos = false;
                }else{
                    MC.printTitle("CASI!");

                    if (  current > aleatorio )
                    {
                        MC.printRow("El numero es menor");
                    }else{
                        MC.printRow("El numero es mayor");
                    }
                }

                MC.printRow("Número: "+aleatorio);
                MC.printRow("Intentos: "+intentos);
                MC.printLine();
            }
        }

        MC.printTitle("Muchas gracias");
    }


    /**
     * Actividad 6
     * Desarrolla un programa que simule una calculadora
     * según la opción introducida y que pida los
     * operandos hasta que introduces -1
     */
    static void calculadora()
    {
        Table tableCalculadora = new Table("Calculadora");

        tableCalculadora.addRow("Opción", "Operación");
        tableCalculadora.addRow("1", "Sumar");
        tableCalculadora.addRow("2", "Restar");
        tableCalculadora.addRow("3", "Multiplicar");
        tableCalculadora.addRow("4", "Dividir");
        tableCalculadora.addRow("5", "Potencia");
        tableCalculadora.addRow("6", "Porcentanje");

        tableCalculadora.print();

        boolean tomarDatos = true;

        while ( tomarDatos )
        {
            tableCalculadora.print();

            System.out.println();
            System.out.print("Inserte número: ");
            int operacion = sc.nextInt();

             if (operacion < 0) {
                tomarDatos = false;
            }else{
                int num1 = 0, num2 = 0;

                switch ( operacion )
                {
                    case 1:
                        //Suma
                        System.out.print("Sumando 1: ");
                        int sum1 = sc.nextInt();

                        System.out.print("Sumando 2: ");
                        int sum2 = sc.nextInt();

                        System.out.println("La suma es: "+(sum1+sum2));
                        break;
                    case 2:
                        // Resta
                        System.out.print("Minuendo: ");
                        num1 = sc.nextInt();

                        System.out.print("Sustraendo: ");
                        num2 = sc.nextInt();

                        System.out.println("La diferencia es: "+(num1-num2));
                        break;
                    case 3:
                        // Multiplicacion
                        System.out.print("Multiplicando: ");
                         num1 = sc.nextInt();

                        System.out.print("Multiplicador: ");
                         num2 = sc.nextInt();

                        System.out.println("El producto es: "+(num1*num2));
                        break;
                    case 4:
                        //Dividir
                        System.out.print("Dividendo: ");
                        num1 = sc.nextInt();

                        System.out.print("Divisor: ");
                        num2 = sc.nextInt();

                        System.out.println("El cociente es: "+(num1/num2));
                        break;
                    case 5:
                        //Potencia
                        System.out.print("Base: ");
                        num1 = sc.nextInt();

                        System.out.print("Exponente: ");
                        num2 = sc.nextInt();

                        System.out.println("La potencia es: "+(Math.pow(num1,num2)));
                        break;
                    case 6:
                        //Porcentaje
                        System.out.print("Porcentaje: ");
                        num1 = sc.nextInt();

                        System.out.print("del número ");
                        num2 = sc.nextInt();

                        System.out.println("La potencia es: "+(num1*100)/num2 );
                        break;
                    default:
                        System.out.println(operacion + " no valido");
                        break;
                }

            }
        }

        MC.printTitle("Muchas Gracias");
    }

    /**
     * Actividad 7
     * Convertir seudocodigo a código
     */
    static void algoritmosMDCMCM()
    {
        Table tableCalculadora = new Table("Calculadora");

        tableCalculadora.addRow("Opción", "Operación");
        tableCalculadora.addRow("1", "MCD");
        tableCalculadora.addRow("2", "MCM");

        tableCalculadora.print();

        int operacion = 0;
        int a, b, inputA, inputB;

        boolean tomarDatos = true;

        while ( tomarDatos )
        {
            System.out.println();
            System.out.print("Inserte número: ");
            operacion = sc.nextInt();

            if ( operacion < 0)
            {
                tomarDatos = false;
            }

            switch ( operacion)
            {
                case 1:
                    /*
                     * Algoritmo MCD
                     *  Leer a, b
                     *  a valor absoluto de a ←
                     *  b valor absoluto de b ←
                     *  Mientras b ≠ 0 hacer
                     *  resto a mod b ←
                     *  a b ←
                     *  b resto ←
                     *  FinMientras
                     *  Escribir "El MCD es: ", a
                     * FinAlgoritmo
                     */

                    System.out.print("Inserte a: ");
                    inputA = Math.abs(sc.nextInt());

                    //Solo para guardar y mostrarlo en pantalla
                    a = inputA;

                    System.out.print("Inserte b: ");
                    inputB = Math.abs(sc.nextInt());
                    sc.nextLine();
                    b = inputB;

                    int resto = 0;

                    while ( b != 0){
                        resto = a%b;
                        a = b;
                        b = resto;
                    }

                    System.out.printf("El MCD(%d,%d) es: : %d",(int) inputA, (int) inputB, (int) a);
                    break;
                case 2:
                    /*
                     * Algoritmo MCM
                     *  Leer a, b
                     *  a valor absoluto de a ←
                     *  b valor absoluto de b ←
                     *  mayor máximo(a, b) ←
                     *  mcm mayor ←
                     *  Mientras (mcm mod a ≠ 0) o (mcm mod b ≠ 0) hacer
                     *  mcm mcm + mayor ←
                     *  FinMientras
                     *  Escribir "El mcm es: ", mcm
                     * FinAlgoritmo
                     */
                    System.out.print("Inserte a: ");
                    inputA = Math.abs(sc.nextInt());

                    //Solo para guardar y mostrarlo en pantalla
                    a = inputA;

                    System.out.print("Inserte b: ");
                    inputB = Math.abs(sc.nextInt());
                    sc.nextLine();
                    b = inputB;

                    double mayor = Math.max(a,b);
                    double mcm = mayor;

                    while ( mcm % a !=0  || mcm % b != 0){
                        mcm = mcm + mayor;
                    }

                    System.out.printf("El MCM(%d,%d) es: : %d",inputA, inputB, (int) mcm);
                    break;
                default:
                    System.out.println(operacion + " no valido");
                    break;
            }
        }
    }
}
