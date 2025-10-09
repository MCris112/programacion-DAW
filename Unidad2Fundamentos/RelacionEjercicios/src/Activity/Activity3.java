package Activity;

import Utilities.MC;

import java.util.Scanner;

/**
 * 3. Escribe un programa que nos diga el signo del zodiaco a partir del día y el mes de nacimiento.
 * Ejemplo: día:15 mes: 8 → LEO
 *
 * Aries: 21 de marzo al 19 de abril
 * Tauro: 20 de abril y al 20 de mayo
 * Géminis: 21 de mayo al 20 de junio
 * Cáncer: 21 de junio al 22 de julio
 * Leo: 23 de julio al 22 de agosto
 * Virgo: 23 de agosto al 22 de septiembre
 * Libra: 23 de septiembre al 22 de octubre
 * Escorpio: 23 de octubre al 21 de noviembre
 * Sagitario: 22 de noviembre al 21 de diciembre
 * Capricornio: 22 de diciembre al 19 de enero
 * Acuario: 20 de enero al 18 de febrero
 * Piscis: 19 de febrero al 20 de marzo
 */
public class Activity3 {

    static void main() {
        MC.printTitle("Te digo tu signo \uD83D\uDD2E");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su dia: ");
        int day = sc.nextInt();

        System.out.print("Ingrese su mes: ");
        int month = sc.nextInt();

        System.out.println();


        // Aries: 21 de marzo al 19 de abril
        if( isDate(day, 21, 19, month, 3, 4) )
        {
            MC.printRow("Tu signo es Aries ♈");
        }

        // Tauro: 20 de abril y al 20 de mayo
        if ( isDate(day, 20, 20, month, 4, 5) )
        {
            MC.printRow("Tu signo es Tauro ♉");
        }

        // Géminis: 21 de mayo al 20 de junio
        if( isDate(day, 21, 20, month, 5, 6) )
        {
            MC.printRow("Tu signo es Géminis ♊");
        }

        // Cáncer: 21 de junio al 22 de julio
//        if( (month == 6 && day >= 1 && day <= 21) || (month == 7 && day >= 1 && day <= 22))
        if( isDate(day, 21, 22, month, 6, 7) )
        {
            MC.printRow("Tu signo es Cáncer ♋");
        }

        if ( (day == 23 || day == 22) && (month == 7 || month == 8) )
        {
            MC.printRow("Tu signo es Leo ♌");
        }

        if ( (day == 23 || day == 22) && (month == 8 || month == 9) )
        {
            MC.printRow("Tu signo es Virgo ♍");
        }

        if ( (day == 23 || day == 22) && (month == 9 || month == 8) )
        {
            MC.printRow("Tu signo es Libra ♎");
        }
    }

    static boolean isMonthUntil(int day, int exDay, int month, int exMonth)
    {
        return month == exMonth && day >= 1 && day <= exDay;
    }

    static boolean isMonthSince(int day, int exDay, int month, int exMonth)
    {
        return month == exMonth && day > exDay;
    }


    static boolean isDate(int day, int sinceDay, int untilDay, int month, int sinceMonth, int untilMonth)
    {
        /**
         * INICIO
         *  LEER dia, mes
         *
         *  Si dia está dentro del mes ENTONCES
         *      MOSTRAR ES TAL
         *  FinSi
         *
         * FIN
         */
        boolean result = false;

        if ( month == sinceMonth && day >= sinceDay)
        {
            return true;
        } else if (month == untilMonth && day <= untilDay) {
            return true;
        }else{
            return false;
        }

//        if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
//            if ( day >= 1 && day<=30 )
//            {
//                MC.printRow( "Fecha correcta");
//            }else{
//                MC.printRow("Fecha Incorrecta");
//            }
//        }else if( month == 4 || month == 6 || month == 9 || month ==11) {
//            if ( day >= 1 && day<=30 )
//            {
//                MC.printRow( "Fecha correcta");
//            }else{
//                MC.printRow("Fecha Incorrecta");
//            }
//        } else if( month == 2){
//            if ( day >= 1 && day<=29 )
//            {
//                //Omitiendo comprobar si es bisiesto
//                MC.printRow( "Fecha correcta");
//            }else{
//                MC.printRow("Fecha Incorrecta");
//            }
//        }
//
//        return result;
    }
}
