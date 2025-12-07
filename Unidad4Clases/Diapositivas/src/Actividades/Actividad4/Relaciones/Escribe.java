package Actividades.Actividad4.Relaciones;

import Actividades.Actividad4.Periodista;
import Actividades.Actividad4.Revista;

public class Escribe {

    private Revista revista;
    private Periodista periodista;

    public Escribe(Revista revista, Periodista periodista) {
        this.revista = revista;
        this.periodista = periodista;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public Periodista getPeriodista() {
        return periodista;
    }

    public void setPeriodista(Periodista periodista) {
        this.periodista = periodista;
    }

    @Override
    public String toString() {
        return "Escribe{" +
                "revista=" + revista +
                ", periodista=" + periodista +
                '}';
    }
}
