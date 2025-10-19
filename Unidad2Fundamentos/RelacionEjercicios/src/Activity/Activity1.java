package Activity;

import Utilities.MC;

import java.time.LocalDateTime;

/**
 * Escribe un programa que imprima buenos días, buenas tardes y buenas noches según la hora
 * actual. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. (usa LocalDateTime)
 */
public class Activity1 {

    public static void main() {

        MC.printBanner();

        MC.title.outline("Saludo \uD83D\uDC4B");

        System.out.println();

        LocalDateTime time = LocalDateTime.now();

        if (time.getHour() >= 6 && time.getHour() <= 12) {
            //Mañana
            MC.title.outlineY("Buenos dias");
        }

        if (time.getHour() >= 13 && time.getHour() <= 20) {
            //Tarde
            MC.title.outlineY("Buenas tardes");
        }

        if ( time.getHour() >= 21 || time.getHour() <= 5) {
            //Noche
            MC.title.outlineY("Buenas noches");
        }
    }
}
