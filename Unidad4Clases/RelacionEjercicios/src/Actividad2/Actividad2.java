package Actividad2;

import Utilities.MC;

/**
 * 2. Construir una clase Racional que permita representar y manipular números racionales. Un
 * número racional permite representar la relación a/b entre dos números enteros siendo a el
 * numerador y b el denominador (distinto de cero). Se deben implementar los siguientes métodos para
 * la clase Racional:  asignaNumerador(int x), asignaDenominador(int y), imprimirRacional(),
 * las operaciones de suma, resta, producto y división y esIgual(Racional b). En main haz uso de ellas
 */
public class Actividad2 {

    static void main() {
        Racional r1 = new Racional();
        r1.asignaNumerador(5);
        r1.asignaDenominador(10);

        Racional r2 = new Racional(1, 2); // 3/4

        r1.imprimirRacional(); // 1/2
        r2.imprimirRacional(); // 3/4

        Racional suma = r1.suma(r2);
        suma.imprimirRacional(); // 10/8

        Racional producto = r1.producto(r2);
        producto.imprimirRacional(); // 3/8

        Racional division = r1.division(r2);
        division.imprimirRacional();

        if ( r1.esIgual(r2) )
        {
            MC.title.outline(
                    "LAS FRACCIONES SON IGUALES"
            );
        }else{
            MC.title.outline(
                    "LAS FRACCIONES NO SON IGUALES"
            );
        }
    }
}
