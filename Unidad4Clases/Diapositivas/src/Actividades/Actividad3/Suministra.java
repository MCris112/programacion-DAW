package Actividades.Actividad3;

public class Suministra {

    private int cantidad;
    private String fecha;
    private Proveedor proveedor;
    private Pieza pieza;

    public Suministra()
    {}

    public Suministra(int cantidad, String fecha, Proveedor proveedor, Pieza pieza) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.pieza = pieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Suministra{" +
                "cantidad=" + cantidad +
                ", fecha='" + fecha + '\'' +
                ", proveedor=" + proveedor +
                ", pieza=" + pieza +
                '}';
    }
}
