package Activity4;

public class Coche extends Vehiculo{

    private double precio_hora = 1.0;

    public Coche(String matricula) {
        super(matricula);
    }

    @Override
    public double calcularPrecio(int horas) {
        return horas * precio_hora;
    }
}
