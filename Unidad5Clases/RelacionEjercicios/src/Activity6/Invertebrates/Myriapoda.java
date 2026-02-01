package Activity6.Invertebrates;

import Activity6.Invertebrate;

public abstract class Myriapoda extends Invertebrate {

    public Myriapoda(String name, String habitat, boolean isEndangered) {
        super(name, habitat, isEndangered);
    }

    @Override
    public void move() {
        System.out.println(name + " camina con muchas patas (30-750+)");
    }

    @Override
    public void eat() {
        System.out.println(name + " come materia orgánica en descomposición");
    }
}
