package Activity6.Vertebrates;

import Activity6.Vertebrate;

public abstract class Bird extends Vertebrate {

    public Bird(String name, String habitat, boolean isEndangered) {
        super(name, habitat, isEndangered);
    }

    @Override
    public void reproduce() {
        System.out.println(name + " pone huevos con cáscara dura en nidos");
    }

    public void fly() {  // Algo comun en las aves es que pueden volar
        System.out.println(name + " usa alas emplumadas para volar");
    }
}
