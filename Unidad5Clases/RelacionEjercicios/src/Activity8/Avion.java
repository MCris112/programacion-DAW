package Activity8;

import Activity7.Vehiculo;

public class Avion extends Vehiculo implements Volador {

    public Avion(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("Avion preparando motores");
    }

    @Override
    public void volar() {
        System.out.println("El avion vuela por los aires");
    }
}
