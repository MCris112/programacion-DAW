package Actividades.Actividad9;

import Utilities.MC;

public class Actividad9 {

    static void main() {

        MC.printBanner();

        MC.title.outline("BIENVENIDO AL JUEGO DE CARTAS");
        Juego juego = new Juego();

        juego.iniciar();

//        //Recien generar el mazo una vez se halla seteado el jugador para mayor eficiencia
//        Mazo mazo = new Mazo();
//        juego.setMazo(mazo);
//
//        Carta carta = mazo.sacarCarta();
//
//        if (carta == null)
//        {
//
//
//            System.out.println("No existe el carta");
//        }else{
//            System.out.println(carta);
//        }
    }

}
