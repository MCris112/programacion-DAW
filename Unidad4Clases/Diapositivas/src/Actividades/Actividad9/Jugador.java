package Actividades.Actividad9;

public class Jugador {

    private String nombre;

    // Que comienze con 3 oportunidades
    private int puntuacion = 3;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void sumarPunto() {
        puntuacion++;
    }

    public void restarPunto()
    {
        puntuacion--;
    }
}
