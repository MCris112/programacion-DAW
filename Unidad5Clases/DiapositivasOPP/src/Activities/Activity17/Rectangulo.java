package Activities.Activity17;

public class Rectangulo extends Figura {

    private final double ancho, alto;

    Rectangulo(double ancho, double alto) {
        super("Rectangulo");
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho*alto;
    }

    @Override
    public double calcularPerimetro() {
        return  2*(ancho+alto);
    }
}
