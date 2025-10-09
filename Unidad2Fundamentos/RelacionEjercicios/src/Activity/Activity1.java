package Activity;

import Utilities.MC;

import java.time.LocalDateTime;

/**
 * Escribe un programa que imprima buenos días, buenas tardes y buenas noches según la hora
 * actual. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. (usa LocalDateTime)
 */
public class Activity1 {

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();

        MC.printTitle("Saludo \uD83D\uDC4B");
//        time.withHour(4);

        if (time.getHour() >= 6 && time.getHour() <= 12) {
            //Mañana
            MC.printRow("Buenos dias");
        }

        if (time.getHour() >= 13 && time.getHour() <= 20) {
            //Tarde
            MC.printRow("Buenas tardes");
        }

        if ( time.getHour() >= 21 || time.getHour() <= 5) {
            //Noche
            MC.printRow("Buenas noches");
        }

        MC.printLine();
    }
}
