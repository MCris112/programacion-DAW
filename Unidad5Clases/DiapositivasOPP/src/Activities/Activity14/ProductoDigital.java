package Activities.Activity14;

public class ProductoDigital extends  Producto{

    protected String urlDescarga;
    protected double tamanoMB;

    public ProductoDigital(String id, String nombre, double precio,
                           String urlDescarga, double tamanoMB) {
        super(id, nombre, precio);
        this.urlDescarga = urlDescarga;
        this.tamanoMB = tamanoMB;
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }

    public void setUrlDescarga(String urlDescarga) {
        this.urlDescarga = urlDescarga;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    public void setTamanoMB(double tamanoMB) {
        this.tamanoMB = tamanoMB;
    }

    @Override
    public String toString() {
        return String.format("[DIGITAL] %s | Tamaño: %.1fMB | URL: %s",
                super.toString(), tamanoMB, urlDescarga);
    }
}
