package Activity7;

public class Moto extends Vehiculo{

    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("Moto arrancando");
    }
}
