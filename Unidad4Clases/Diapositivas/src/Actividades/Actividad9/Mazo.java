package Actividades.Actividad9;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {

    private ArrayList<Carta> cartas = new ArrayList<>();

    public void barajar()
    {
        Collections.shuffle(cartas);
    }

    public Carta sacarCarta()
    {
        if ( this.estaVacio() )
            return null;

        this.barajar();

        Carta carta = this.cartas.getFirst();

        System.out.println("Sacaste la carta:");
        System.out.println(carta);
        return carta;
    }

    public boolean estaVacio()
    {
        return this.cartas.isEmpty();
    }


    public void generate()
    {
        //Al generar tenemos que limpiar las cartas que ya existen para generar desde 0
        this.cartas.clear();

        generarPorSimbolo( this.cartas, Palo.CORAZONES );
        generarPorSimbolo( this.cartas, Palo.PICAS );
        generarPorSimbolo( this.cartas, Palo.TREBOLES );
        generarPorSimbolo( this.cartas, Palo.DIAMANTES );
    }

    public static void generarPorSimbolo(ArrayList<Carta> cartas, Palo symbol )
    {
        for (int i = 1; i < 14; i++) {
            cartas.add( new Carta(symbol, i) );
        }
    }
}
