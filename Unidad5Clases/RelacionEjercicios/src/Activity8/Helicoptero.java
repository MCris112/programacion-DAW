package Activity8;

import Activity7.Vehiculo;

public class Helicoptero extends Vehiculo implements Volador {

    public Helicoptero(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("Helicoptero preparando motores");
    }

    @Override
    public void volar() {
        System.out.println("Helicoptero vuela por el area 51");
    }
}
