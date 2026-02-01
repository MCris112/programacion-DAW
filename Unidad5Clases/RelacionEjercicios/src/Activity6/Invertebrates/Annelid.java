package Activity6.Invertebrates;

import Activity6.Invertebrate;

public abstract class Annelid extends Invertebrate {

    public Annelid(String name, String habitat, boolean endangered) {
        super(name, habitat, endangered);
    }

    @Override
    public void move() {
        System.out.println(name + " se mueve por contracción segmentada");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " es hermafrodita: pone huevos en capullo de mucus");
    }
}
