package Actividad3;

import Utilities.Table;

public class Cliente {
    private int id;
    private String nombre, ciudad, dni, fechaNacimiento;

    private Sucursal sucursal;
    private double descuento;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String ciudad, String dni, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void show()
    {
            Table table = Table.instance()
                .addRow("Cliente")
                .addRow("Codigo/ID", this.id+"")
                .addRow("Nombre", this.nombre)
                .addRow("DNI", this.dni)
                .addRow("Fecha nacimiento", this.fechaNacimiento)
                .addRow( "Ciudad", this.ciudad);

            if ( this.sucursal != null)
            {
                table.addRow("Compra en sucursal")
                        .addRow("Número", this.sucursal.getId()+"" )
                        .addRow("Domicio", this.sucursal.getDomicilio() )
                        .addRow( "Ciudad", this.sucursal.getCiudad() )
                        .addRow("Descuento: ", this.descuento+"");
            }

            table.print();
    }
}
