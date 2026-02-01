package Activity6.Invertebrates;

import Activity6.Invertebrate;

public abstract class Mollusk extends Invertebrate {

    public Mollusk(String name, String habitat, boolean isEndangered) {
        super(name, habitat, isEndangered);
    }

    public void camouflage() {
        System.out.println(name + " cambia color o usa tinta para defensa");
    }
}
