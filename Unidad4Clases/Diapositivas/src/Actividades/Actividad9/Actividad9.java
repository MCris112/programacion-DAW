package Actividades.Actividad9;

import Utilities.MC;

/**
 * ● Actividad: El juego del adivino de cartas
 * ● El jugador saca una carta del mazo (Tiene del 1 al 12 con 4 palos).
 * ● Luego intenta predecir si la siguiente carta será mayor o menor en cada ronda.
 * ● Si acierta, gana un punto y si falla, pierde un punto.
 * ● El juego continúa hasta que el mazo se acabe o el jugador decida salir. Entonces
 * se mostrará el número de rondas y su puntuación
 */
public class Actividad9 {

    static void main() {

        MC.printBanner();

        MC.title.outline("BIENVENIDO AL JUEGO DE CARTAS");
        Juego juego = new Juego();

        juego.iniciar();
    }

}
