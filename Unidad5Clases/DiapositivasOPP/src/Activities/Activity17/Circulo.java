package Activities.Activity17;

public class Circulo extends Figura{

    private final double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*2*radio;
    }
}
