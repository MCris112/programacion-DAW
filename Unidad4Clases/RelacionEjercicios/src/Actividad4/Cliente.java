package Actividad4;

import Utilities.Table;

public class Cliente {

    private int id;
    private String nombre, apellido, direccion, telefono;

    public Cliente(){}

    public Cliente(int id, String nombre, String apellido, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void show() {
        Table.instance()
                .addRow("CLIENTE")
                .addRow("ID", String.valueOf(this.id))
                .addRow("Nombre", this.nombre + " " + this.apellido)
                .addRow("Dirección", this.direccion != null ? this.direccion : "Sin dirección")
                .addRow("Teléfono", this.telefono != null ? this.telefono : "Sin teléfono")
                .print();
    }
}
