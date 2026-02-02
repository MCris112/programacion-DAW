package Activity4;

public class Moto extends Vehiculo{

    private double precio_hora = 1.0;

    public Moto(String matricula) {
        super(matricula);
    }

    @Override
    public double calcularPrecio(int horas) {
        return horas * precio_hora;
    }
}
