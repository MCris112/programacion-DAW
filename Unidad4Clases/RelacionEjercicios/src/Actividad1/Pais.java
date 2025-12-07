package Actividad1;

import Utilities.Table;

public class Pais {

    private String nombre;

    private int poblacion;
    /** Producto Interno Bruto <- lo que busque en google que es de un pais */
    private double PIB;

    public Pais(){}

    public Pais(String nombre, int poblacion, double PIB) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.PIB = PIB;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getPIB() {
        return PIB;
    }

    public void setPIB(double PIB) {
        this.PIB = PIB;
    }

    //Pensé que estaba mal escrito XD
    /**
     * Devuelve el PIB per cápita:
     * (PIB * 100000) / población
     */
    public double getPIBPerCapita()
    {
        return (this.PIB*100000)/this.poblacion;
    }

    public void show()
    {
        Table.instance()
                .addRow(this.nombre )
                .addRow("Poblacion", this.poblacion+"" )
                .addRow("PIB", this.PIB+"" )
                .print();
    }
}
