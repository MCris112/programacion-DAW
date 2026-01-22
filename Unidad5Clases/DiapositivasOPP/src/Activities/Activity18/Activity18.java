package Activities.Activity18;

import Utilities.MC;

import java.util.ArrayList;

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
