import Utilities.MC;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Activiy02 {

    // Declaro variable global para eviar crearlo seguido
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Descomentar y comentar la funcion de la actividad que se requiera

//        diagramFlow();

//        calificarNota();

        //isDateRight();


    }

    static void diagramFlow()
    {
        MC.printTitle("Leer A y B");


        int a, b, c;

        System.out.print("Ingrese el valor de a: ");
        a =  sc.nextInt();

        System.out.print("Ingrese el valor de b: ");
        b = sc.nextInt();

        System.out.print("Ingrese el valor de c: ");
        c = sc.nextInt();

        sc.nextLine();

        MC.printLine();

        double result = (b*b) - 4*(a*c);

        if ( result < 0 )
        {
            MC.printRow("No hay soluciones");
        }else if ( result == 0 ) {
            MC.printRow("La unica solución es: ");
            MC.printRow("X1 = -b/2a");
            MC.printRow((double) -b /(a*a) );
        }else{
            double equationOne = (-b + Math.sqrt(result) ) /2*a;
            double equationTwo = (-b - Math.sqrt(result) ) /2*a;

            MC.printRow("La primera solución es: ");
            MC.printRow(equationOne);
            MC.printRow("La segunda solución es: ");
            MC.printRow(equationTwo);
        }

        MC.printLine();
    }


    /**
     * Programa que califica la nota
     * Segun el numero está entre suspendido - sobresaliente
     */
    static void calificarNota(){
        MC.printTitle("Ingrese nota a calificar");

        System.out.println("Nota: ");
        int nota = sc.nextInt();

        MC.printLine();
        if ( nota < 5 ){
            MC.printRow("Suspendido");
        } else if(  nota < 7) {
            MC.printRow("Aprovado");
        }else if ( nota == 7 ) {
            MC.printRow("Bien");
        }else if ( nota == 8 ) {
            MC.printRow("Notable");
        } else if ( nota == 9 ) {
            MC.printRow("Sobresaliente");
        }else{
            MC.printRow("Nota incorrecta");
        }

        MC.printLine();
    }

    static void isDateRight()
    {
        MC.printTitle("Verificar si es año bisiesto");


        System.out.print("Inserte un dia");
        int day =  sc.nextInt();
        System.out.print("Inserte un número de mes");
        int month =  sc.nextInt();
        System.out.print("Inserte un año");
        int year = sc.nextInt();
        sc.nextLine();

        MC.printLine();

        if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
            if ( day >= 1 && day<=30 )
            {
                MC.printRow( "Fecha correcta");
            }else{
                MC.printRow("Fecha Incorrecta");
            }
        }else if( month == 4 || month == 6 || month == 9 || month ==11) {
            if ( day >= 1 && day<=30 )
            {
                MC.printRow( "Fecha correcta");
            }else{
                MC.printRow("Fecha Incorrecta");
            }
        } else if( month == 2){
            if ( day >= 1 && day<=28 )
            {
                MC.printRow( "Fecha correcta");
            } else if ( day == 29){
                if((year % 4 == 0 && year%100 != 0) || year %400 == 0 )
                {
                    MC.printRow( "Fecha correcta");
                }else{
                    MC.printRow("Fecha Incorrecta");
                }
            }else{
                MC.printRow("Fecha Incorrecta");
            }
        }

        MC.printLine();

//        System.out.println("Ingrese el año");
//        int year = sc.nextInt();
//
//        MC.printLine();
//
//        if ( (year % 4 == 0 && year%100 != 0) || year %400 == 0 )
//        {
//            MC.printRow(" El año es bisiesto");
//        }else{
//            MC.printRow( "El año no es bisiesto");
//        }
//
//        MC.printLine();
    }
}
