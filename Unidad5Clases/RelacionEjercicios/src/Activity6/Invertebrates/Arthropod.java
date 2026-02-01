package Activity6.Invertebrates;

import Activity6.Invertebrate;

public abstract class Arthropod extends Invertebrate {

    public Arthropod(String name, String habitat, boolean isEndangered) {
        super(name, habitat, isEndangered);
    }

    public void exoskeleton() {
        System.out.println(name + " tiene exoesqueleto de quitina");
    }
}
