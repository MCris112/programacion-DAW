package Actividades.Actividad6;

import Utilities.Table;

public class Reservaciones {

    private Turista turista;
    private Hotel hotel;
    private Sucursal sucursal;

    private String fechaEntrada;
    private String fechaSalida;
    private Regimen regimen;

    public Reservaciones() {
    }

    public Reservaciones(Turista turista, Hotel hotel, Sucursal sucursal, String fechaEntrada, String fechaSalida, Regimen regimen) {
        this.turista = turista;
        this.hotel = hotel;
        this.sucursal = sucursal;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.regimen = regimen;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Regimen getRegimen() {
        return regimen;
    }

    public void setRegimen(Regimen regimen) {
        this.regimen = regimen;
    }

    public void show()
    {
        Table.instance()
                .addRow("Reservacion")
                .addRow("Fecha Entrada", this.fechaEntrada)
                .addRow("Fecha Salida", this.fechaSalida)
                .addRow("Hotel", this.hotel.getNombre() )
                .addRow( "Sucursal")
                .addRow("Telefono", this.sucursal.getTelefono() )
                .addRow( "Direccion", this.sucursal.getDireccion() )
                .addRow( "Ciudad", this.sucursal.getDireccion() )
                .addRow( "Provincia", this.sucursal.getProvincia())
                .addRow("Turista")
                .addRow( "ID", this.turista.getId()+"" )
                .addRow( "Nombre", this.turista.getNombre() )
                .addRow( "Apellido", this.turista.getApellidos() )
                .addRow( "Telefono", this.turista.getTelefono() )
                .addRow( "Direccion", this.turista.getDireccion() )
                .print();
    }
}
