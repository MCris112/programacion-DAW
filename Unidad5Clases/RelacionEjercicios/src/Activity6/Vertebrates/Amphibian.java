package Activity6.Vertebrates;

import Activity6.Vertebrate;

public abstract class Amphibian extends Vertebrate {


    public Amphibian(String name, String habitat, boolean isEndangered) {
        super(name, habitat, isEndangered);
    }

    @Override
    public void reproduce() {
        System.out.println(name + " pone huevos en agua (metamorfosis)");
    }

    public void changeEnvironment() {
        System.out.println(name + " vive en agua (juvenil) y tierra (adulto)");
    }
}
