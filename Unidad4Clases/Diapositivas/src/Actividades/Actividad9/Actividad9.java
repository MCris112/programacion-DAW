package Actividades.Actividad9;

import Utilities.MC;

public class Actividad9 {

    static void main() {

        MC.printBanner();

        MC.title.outline("BIENVENIDO AL JUEGO DE CARTAS");
        Juego juego = new Juego();

        juego.iniciar();
    }

}
