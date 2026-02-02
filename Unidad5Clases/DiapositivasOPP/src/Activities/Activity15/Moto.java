package Activities.Activity15;

public class Moto extends Vehiculo{

    public Moto(String matricula) {
        super(matricula);
    }

    @Override
    public int velocidadMaxima() {
        return 220;
    }
}
