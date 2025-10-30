import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 1. (2,5 puntos) Realiza un programa que calcule el precio de unas entradas de cine en función del
 * número de personas y del día de la semana. El precio base de una entrada son 8€. El miércoles (día
 * del espectador), el precio base es de 5€. Los jueves son el día de la pareja, por lo que la entrada para
 * dos cuesta 11 €. Con la tarjeta CineCampa se obtiene un 10% de descuento adicional.
 * El programa pedirá el día, la cantidad de personas y si tiene la tarjeta CineCampa.
 * Ejemplo 1:
 * Venta de entradas CineCampa
 * Número de entradas: 4
 * Día de la semana: martes
 * ¿Tiene tarjeta CineCampa? (s/n): n
 * Aquí tiene sus entradas. Gracias por su compra.
 * Entradas individuales 4
 * Precio por entrada individual 8.00 €
 * Total 32.00 €
 * Descuento 0.00 €
 * A pagar 32.00 €
 * Ejemplo 2
 * Venta de entradas CineCampa
 * Número de entradas: 4
 * Día de la semana: jueves
 * ¿Tiene tarjeta CineCampa? (s/n): s
 * Aquí tiene sus entradas. Gracias por su compra.
 * Entradas grupales 2
 * Precio por entrada individual 11.00 €
 * Total 22.00 €
 * Descuento 2.20 €
 * A pagar 19.80 €
 */
public class Activity1 {

    static Scanner sc = new Scanner(System.in);
    static int people;
    static int movie;
    static int hasCard = 2;


    static void main() {
        MC.title.outline("Bienvenido a CineCampa");

        // Preguntar cuantas personas van a ver la función
        askPeople();

        // Preguntar que dia de la semana es la funcion por ver
        askMovie();

        //Preguntar si tiene tarjeta cine o no
        askCard();

        double basePrice = 8;
        switch (movie) {
            case 3: basePrice = 5; break;
            case 4: basePrice = 5.5; break;
            default:
                break;
        }

        double subTotal = basePrice * people;

        double discount = 0;
        if (hasCard == 1) {
            discount = (subTotal * 10)/100;
        }

        // TODO si sobra tiempo:
        // Comprar que si son 5 en jueves, devolver realmente precio 4 pareja, y el 5to precio normal a 8

        // totals --- 100%
        // ------ --- 10%
        //Precio base 8€
        //Martes 5€
        //Jueves 2x 11€
        //Tarjerta? 10% desct adicional

        MC.title.outline("Gracias por su compra");
        Table.instance()
                .addRow("Precio por entrada", basePrice+" €")
                .addRow("Personas", String.valueOf(people))
                .addRow("SubTotal", subTotal+" €")
                .addRow("Descuento", discount+" €")
                .addRow("Total", (subTotal-discount)+" €")
                .print();
    }

    public static void askPeople()
    {
        do {
            System.out.println("¿Cúantas entradas desea comprar?");
            people = sc.nextInt();

            if ( people <= 0)
            {
                System.out.println("Número no válido");
            }
        }while (people <= 0);
    }

    public static void askMovie()
    {
        do {
            System.out.println("¿Qué función desea comprar?");
            Table.instance()
                    .addRow("1", "Lunes", "Como entrar a tu dragon")
                    .addRow("2", "Martes", "Polican")
                    .addRow("3", "Miercoles", "Mi villano favorito")
                    .addRow("4", "Jueves", "Cementerio de mascotas")
                    .addRow("5", "Viernes", "Sabado")
                    .addRow("6", "Sábado", "Hercules (Disney)")
                    .addRow("7", "Domingo", "La resurección de Cristo")
                    .print();

            System.out.println("Inserte su función");
            movie = sc.nextInt();
            sc.nextLine();

            if ( movie <= 0 || movie >= 8)
            {
                System.out.println("La opción elegida no es la correcta");
            }

        }while ( movie <= 0 || movie >= 8 );
    }

    public static void askCard()
    {
        do {
            System.out.println("¿Tienes tarjeta CineCampa? (s/n)");
            String response = sc.nextLine();

            if (response.equals("s"))
            {
                hasCard = 1;
            }else  if (response.equals("n")){
                hasCard = 0;
            }
        }while ( hasCard == 2);
    }
}
