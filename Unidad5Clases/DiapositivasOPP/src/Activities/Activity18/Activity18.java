package Activities.Activity18;

import Utilities.MC;

import java.util.ArrayList;

/**
 * 1. Crea las siguientes interfaces:
 *    -  Movible: con un método mover().
 *    -  Sonoro: con un método emitirSonido().
 *
 * 2. Crea las siguientes clases que implementen las interfaces:
 *    -  Coche (implementa Movible y Sonoro).
 *      -  mover() → imprime "El coche avanza por la carretera".
 *      -  emitirSonido() → imprime "El coche toca el claxon: ¡pi-pi!".
 *
 *    -  Barco (implementa Movible y Sonoro).
 *      -  mover() → imprime "El barco navega por el mar".
 *      -  emitirSonido() → imprime "El barco hace sonar la bocina: ¡Buuuu!".
 *
 *    -  Avion (implementa Movible y Sonoro).
 *      -  mover() → imprime "El avión vuela por el cielo".
 *      -  emitirSonido() → imprime "El avión hace ruido de motores: ¡Vroooom!".
 *
 * 3. En la clase principal (main):
 *    -  Crea un array o lista de Movible con distintos vehículos.
 *    -  Recorre el array y llama al método mover().
 *    -  Haz lo mismo con un array/lista de Sonoro, llamando al método emitirSonido().
 */
public class Activity18 {

    static void main() {

        MC.title.outlineY("Interfaces Movibles");
        ArrayList<Movible> veiculos = new ArrayList<>();
        veiculos.add( new Coche() );
        veiculos.add( new Barco() );
        veiculos.add( new Avion() );

        for ( Movible movible : veiculos ) {
            movible.mover();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        MC.title.outlineY("Interfaces Sonoras");
        ArrayList<Sonoro> sonoros = new ArrayList<>();
        sonoros.add( new Avion() );
        sonoros.add( new Coche() );
        sonoros.add( new Barco() );

        for ( Sonoro sonoro : sonoros ) {
            sonoro.emitirSonido();
        }
    }
}
