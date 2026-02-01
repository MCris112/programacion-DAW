package Activity6.Invertebrates;

import Activity6.Invertebrate;

public abstract class Echinodermata extends Invertebrate {

    public Echinodermata(String name, String habitat, boolean isEndangered) {
        super(name, habitat, isEndangered);
    }

    @Override
    public void move() {
        System.out.println(name + " usa pies tubulares (simetría radial)");
    }

    public void regenerate() {
        System.out.println(name + " regenera brazos o partes perdidas");
    }
}
