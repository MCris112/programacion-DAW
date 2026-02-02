package Activities.Activity15;

public class Coche extends Vehiculo{

    public Coche(String matricula) {
        super(matricula);
    }

    @Override
    public int velocidadMaxima() {
        return 180;
    }
}
