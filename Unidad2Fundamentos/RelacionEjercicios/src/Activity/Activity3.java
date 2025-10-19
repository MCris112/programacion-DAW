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
        MC.title.outline("Te digo tu signo \uD83D\uDD2E");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su dia: ");
        int day = sc.nextInt();

        System.out.print("Ingrese su mes: ");
        int month = sc.nextInt();

        System.out.println();


        // Aries: 21 de marzo al 19 de abril
        if( isDate(day, 21, 19, month, 3, 4) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", "Aries ♈");
        }

        // Tauro: 20 de abril y al 20 de mayo
        else if ( isDate(day, 20, 20, month, 4, 5) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", "Tauro ♉");
        }

        // Géminis: 21 de mayo al 20 de junio
        else if( isDate(day, 21, 20, month, 5, 6) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", " Géminis ♊");
        }

        // Cáncer: 21 de junio al 22 de julio
//        if( (month == 6 && day >= 1 && day <= 21) || (month == 7 && day >= 1 && day <= 22))
        else if( isDate(day, 21, 22, month, 6, 7) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", " Cáncer ♋");
        }

        // Leo: 23 de julio al 22 de agosto
        else if ( isDate(day, 23, 22, month, 7, 8) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", " Leo ♌");
        }

        // Virgo: 23 de agosto al 22 de septiembre
        else if ( isDate(day, 23, 22, month, 8, 9) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", " Virgo ♍");
        }

        // Libra: 23 de septiembre al 22 de octubre
        else if (  isDate(day, 23, 22, month, 9, 10) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", "Libra ♎");
        }

        // Escorpio: 23 de octubre al 21 de noviembre
        else if (  isDate(day, 23, 21, month, 10, 11) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", "Escorpio ♏");
        }

        // Sagitario: 22 de noviembre al 21 de diciembre
        else if (  isDate(day, 22, 21, month, 11, 12) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", " Sagitario ♐");
        }

        // Capricornio: 22 de diciembre al 19 de enero
        else if (  isDate(day, 22, 19, month, 12, 19) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", " Capricornio ♑");
        }

        // Acuario: 20 de enero al 18 de febrero
        else if (  isDate(day, 20, 18, month, 12, 19) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", "Acuario ♒");
        }

        // Piscis: 19 de febrero al 20 de marzo
        else if (  isDate(day, 19, 20, month, 12, 19) )
        {
            MC.title.outlineY("✨ Tu signo es ✨ ", "Piscis ♓");
        }else{
            MC.printRow( "Fecha erronea, intente de nuevo");
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


        if ( month == sinceMonth && day >= sinceDay)
        {
            int maxDay = getMaxDayInMonth(month);
            if ( maxDay == 0 || day > maxDay)
            {
                //  is outdate or month doesnt exists
                return false;
            }

            return true;
        } else if (month == untilMonth && day <= untilDay) {
            int maxDay = getMaxDayInMonth(month);
            if ( maxDay == 0 || day > maxDay)
            {
                //  is outdate or month doesnt exists
                return false;
            }

            return true;
        }else{
            return false;
        }
    }

    static int getMaxDayInMonth(int month)
    {
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 29;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }
}
