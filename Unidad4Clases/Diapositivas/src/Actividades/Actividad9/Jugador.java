package Actividades.Actividad9;

public class Jugador {

    private String nombre;

    private int puntuacion = 0;

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
}
