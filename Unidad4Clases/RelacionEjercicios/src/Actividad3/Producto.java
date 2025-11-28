package Actividad3;

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
}
