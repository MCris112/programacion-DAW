package Actividades.Actividad2;

import Utilities.Table;

public class Ciudad {

    private int codigo;
    private String nombre;
    private int indicativo;

    public Ciudad(int codigo, String nombre, int indicativo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.indicativo = indicativo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    public void show()
    {
        Table.instance()
                .addRow("Codigo", this.codigo+"")
                .addRow("Nombre", this.nombre)
                .addRow("Indicativo", this.indicativo+"")
                .print();
    }
}
