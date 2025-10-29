import Utilities.MC;

import java.util.Scanner;

/**
 * 8. Utilizando las funciones de String. Diseña una función que indique si una frase es palíndroma. Es
 * decir, sin poner las tildes, se quitarán los espacios y se puede leer igual de izquierda a derecha que
 * de derecha a izquierda. Ejemplo: “Dábale arroz a la zorra el abad” es igual en ambos sentidos. Otro
 * sería: “Acaso hubo búhos acá”. Utiliza funciones para quitar los espacios y comparar.
 */
public class Activity8 {

    static void main() {
        MC.printBanner();
        MC.title.outline("¿Es palindroma la frase?");

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte su frase:");

        String frase = sc.nextLine();

        String tense = frase.replace(" ", "").toUpperCase();

        boolean isEqual = true;

        for (int i = 0; i < tense.length(); i++) {
            if(tense.charAt(i) != tense.charAt( tense.length()-1-i )) {
                System.out.println( frase.charAt(i) +" != " + tense.charAt( tense.length()-1-i ));
                isEqual = false;
            }
        }

        if(isEqual) {
            System.out.println("Son Iguales");
        }else{
            System.out.println("No son Iguales");
        }
    }
}
