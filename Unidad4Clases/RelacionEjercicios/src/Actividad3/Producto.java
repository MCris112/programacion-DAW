package Actividad3;

import Utilities.Table;

public class Producto {

    private int id;
    private String descripcion;

    private double costo;

    private Color color;

    private Fabrica fabrica;

    public Producto() {
    }

    public Producto(int id, String descripcion, double costo, Color color) {
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public void show() {
        Table table = Table.instance()
                .addRow("PRODUCTO")
                .addRow("ID", String.valueOf(this.id))
                .addRow("Descripción", this.descripcion)
                .addRow("Color", this.color != null ? this.color.name() : "Sin color")
                .addRow("Costo", String.valueOf(this.costo));

        if (this.fabrica != null) {
            table.addRow("FABRICA")
                    .addRow("CUIT", this.fabrica.getCuit())
                    .addRow("Nombre", this.fabrica.getNombre())
                    .addRow("País", this.fabrica.getPais())
                    .addRow("Gerente", this.fabrica.getGerente())
                    .addRow("Cantidad Empleados", String.valueOf(this.fabrica.getCantEmp()));
        }

        table.print();
    }
}
