package Actividades.Actividad9;

import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

public class Juego {

    static Scanner sc = new Scanner(System.in);

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

        this.mazo = new  Mazo();
        // Generamos un mazo para el juego
        this.mazo.generate();

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

        this.ronda();
    }

    public void ronda()
    {

        if ( this.mazo.estaVacio() )
        {
            System.out.println("Se acabo el juego, no hay mas cartas");
            this.mostrarTablaResultados();

        }else{
            this.ronda++;

            Carta carta = this.mazo.sacarCarta();

            int option = 0;

            do {
                System.out.println("¿La siguiente carta será mayor o menor? (mayor / menor)");

                String s = sc.nextLine().toLowerCase();

                if ( s.equals("mayor") )
                {
                    option = 1;
                }else if ( s.equals("menor") ){
                    option = -1;
                }else{
                    System.out.println("-- Ingrese una opcion válida valido --");
                }

            }while ( option == 0);

            // Sacar la siguiente carta
            Carta predice = this.mazo.sacarCarta();

            int resultado = Integer.compare(predice.getValor(), carta.getValor());

            if ((resultado > 0 && option == 1) || (resultado < 0 && option == -1)) {
                MC.title.outlineY( "¡Has acertado!", "\uD83C\uDF89 Ganas +1 punto");
                jugador.sumarPunto();
            } else if (resultado == 0) {
                MC.title.outlineY("Las cartas son iguales", "No ganas ni pierdes puntos");
            } else {
                MC.title.outlineY( "¡Fallaste!", "❌ Pierdes -1 punto");
                jugador.restarPunto(); // si tienes este método, o restar manualmente
            }

            if ( jugador.getPuntuacion() == 0 )
            {
                System.out.println("Lo sentimos se te acabaron los puntos...");
                this.mostrarTablaResultados();
            }else{
                System.out.println("¿Quieres salir? (s, Si / enter para continuar)");
                String s = sc.nextLine().toLowerCase();
                if ( s.equals("si") || s.equals("s") )
                {
                    System.out.println("Gracias por jugar");
                    this.mostrarTablaResultados();
                }else{
                    this.mostrarTablaResultados();

                    System.out.println();
                    System.out.println();
                    System.out.println();
                    this.ronda();
                }
            }

        }

    }


    public void mostrarTablaResultados() {
        Table table = Table.instance()
                .addRow("Resultados del Juego")
                .addRow("Jugador", jugador.getNombre())
                .addRow("Puntuación", String.valueOf(jugador.getPuntuacion()))
                .addRow("Rondas jugadas", String.valueOf(this.ronda));

        table.print();
    }

}
