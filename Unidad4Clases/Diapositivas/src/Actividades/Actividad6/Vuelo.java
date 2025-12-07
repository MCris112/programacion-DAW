package Actividades.Actividad6;

public class Vuelo {

    private int id;
    private String fecha, origen, destino;
    /** Formato 24 horas */
    private int hora;

    private int plazasTotales;

    public Vuelo() {
    }

    public Vuelo(int id, String fecha, String origen, String destino, int hora, int plazasTotales) {
        this.id = id;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        this.plazasTotales = plazasTotales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getPlazasTotales() {
        return plazasTotales;
    }

    public void setPlazasTotales(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }
}
