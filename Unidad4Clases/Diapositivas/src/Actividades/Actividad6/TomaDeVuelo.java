package Actividades.Actividad6;

import Utilities.Table;

public class TomaDeVuelo {

    private Turista turista;
    private Vuelo vuelo;
    private Sucursal sucursal;

    private String clase;

    public TomaDeVuelo() {}

    public TomaDeVuelo(Turista turista, Vuelo vuelo, Sucursal sucursal, String clase) {
        this.turista = turista;
        this.vuelo = vuelo;
        this.sucursal = sucursal;
        this.clase = clase;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void show() {
        Table.instance()
                .addRow("Toma de Vuelo")
                .addRow("Clase", this.clase)
                .addRow("Vuelo")
                .addRow("ID", this.vuelo.getId() + "")
                .addRow("Fecha", this.vuelo.getFecha())
                .addRow("Hora", this.vuelo.getHora() + "h")
                .addRow("Origen", this.vuelo.getOrigen())
                .addRow("Destino", this.vuelo.getDestino())
                .addRow("Sucursal")
                .addRow("Ciudad", this.sucursal.getCiudad())
                .addRow("Provincia", this.sucursal.getProvincia())
                .addRow("Turista")
                .addRow("ID", this.turista.getId() + "")
                .addRow("Nombre", this.turista.getNombre())
                .addRow("Apellido", this.turista.getApellidos())
                .addRow("Teléfono", this.turista.getTelefono())
                .addRow("Dirección", this.turista.getDireccion())
                .print();
    }
}
