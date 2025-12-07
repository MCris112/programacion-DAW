package Actividades.Actividad9;

public class Carta {

    private Palo palo;

    private int valor;

    public Carta(Palo palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }
}
