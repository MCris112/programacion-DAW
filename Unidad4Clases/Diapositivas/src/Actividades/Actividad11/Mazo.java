package Actividades.Actividad11;

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


        return this.cartas.getFirst();
    }

    public boolean estaVacio()
    {
        return this.cartas.isEmpty();|
    }
}
