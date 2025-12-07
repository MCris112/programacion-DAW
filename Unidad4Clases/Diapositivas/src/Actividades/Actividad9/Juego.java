package Actividades.Actividad9;

import java.util.Scanner;

public class Juego {

    private Jugador jugador;

    private Mazo mazo;

    private int ronda = 0;

    public Juego() {
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Mazo getMazo() {
        return mazo;
    }

    public void setMazo(Mazo mazo) {
        this.mazo = mazo;
    }

    public void iniciar()
    {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese su nombre:");
            String nombre = sc.nextLine();

            if ( !nombre.isEmpty() )
            {
                Jugador jugador = new Jugador(nombre);
                this.setJugador(jugador);
            }else{
                System.out.println("-- Ingrese un nombre valido --");
            }

        }while ( this.jugador == null );
    }

    public void ronda()
    {

    }
}
