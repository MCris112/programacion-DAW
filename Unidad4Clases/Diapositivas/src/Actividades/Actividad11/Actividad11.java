package Actividades.Actividad11;

import Utilities.MC;

import java.util.Scanner;

public class Actividad11 {

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
