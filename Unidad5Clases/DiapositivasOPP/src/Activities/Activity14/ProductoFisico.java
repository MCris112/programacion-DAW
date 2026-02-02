package Activities.Activity14;

public class ProductoFisico extends Producto{
    protected double peso; // en Kg
    protected double costeEnvio;

    public ProductoFisico(String id, String nombre, double precio,
                          double peso, double costeEnvio) {
        super(id, nombre, precio);
        this.peso = peso;
        this.costeEnvio = costeEnvio;
    }

    @Override
    public double precioFinal() {
        double precioBase = super.precioFinal();
        double envio = costeEnvio;

        // +10% si pesa más de 2Kg
        if (peso > 2.0) {
            envio += precioBase * 0.10;
        }

        return precioBase + envio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosteEnvio() {
        return costeEnvio;
    }

    public void setCosteEnvio(double costeEnvio) {
        this.costeEnvio = costeEnvio;
    }

    @Override
    public String toString() {
        return String.format("[FISICO] %s | Peso: %.1fkg | Envío: €%.2f | Final: €%.2f",
                super.toString(), peso, costeEnvio, precioFinal());
    }
}
