package Activity7;

public class Coche extends Vehiculo{

    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("Coche arranca");
    }
}
