package Activity6.Vertebrates;

import Activity6.Vertebrate;

public abstract class Mammal extends Vertebrate {

    public Mammal(String name, String habitat, boolean isEndangered) {
        super(name, habitat, isEndangered);
    }

    @Override
    public void reproduce() {
        System.out.println(name + " da a luz crías vivas y las amamanta con leche");
    }

    public void regulateTemperature() {
        System.out.println(name + " mantiene temperatura corporal constante (endotermo)");
    }
}
