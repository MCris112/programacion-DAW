package Actividad3;

import Utilities.Table;

public class Trabajos {

    private Sucursal sucursal;
    private Empleado empleado;

    private int dia;
    private String horario;

    public Trabajos() {
    }

    public Trabajos(Sucursal sucursal, Empleado empleado, int dia, String horario) {
        this.sucursal = sucursal;
        this.empleado = empleado;
        this.dia = dia;
        this.horario = horario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void show()
    {
        Table.instance()
                .addRow("Trabajo")
                .addRow("Empleado", empleado != null ? empleado.getNombre() : "Sin asignar")
                .addRow("Legajo", empleado != null ? empleado.getLegajo() : "N/A")
                .addRow("Sucursal", sucursal != null ? sucursal.getCiudad() : "Sin sucursal")
                .addRow("Día", String.valueOf(dia))
                .addRow("Horario", horario != null ? horario : "No definido")
                .print();
    }
}
