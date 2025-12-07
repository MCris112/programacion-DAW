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

    @Override
    public String toString() {
        String simbolo = switch (palo) {
            case PICAS -> "♠";
            case CORAZONES -> "♥";
            case DIAMANTES -> "♦";
            case TREBOLES -> "♣";
        };

        return """
           ┌─────────┐
           │ %-2d      │
           │         │
           │    %s    │
           │         │
           │      %-2d │
           └─────────┘
           """.formatted(valor, simbolo, valor);
    }

}
