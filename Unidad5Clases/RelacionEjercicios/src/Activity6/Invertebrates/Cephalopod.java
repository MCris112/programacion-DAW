package Activity6.Invertebrates;

import Activity6.Invertebrate;

public abstract class Cephalopod extends Invertebrate {
    public Cephalopod(String name, String habitat, boolean isEndangered) {
        super(name, habitat, isEndangered);
    }

    @Override
    public void reproduce() {
        System.out.println(name + " huevos en agua + hembra suele morir después");
    }

    public void inkDefense() {
        System.out.println(name + " expulsa tinta negra para escapar");
    }
}
