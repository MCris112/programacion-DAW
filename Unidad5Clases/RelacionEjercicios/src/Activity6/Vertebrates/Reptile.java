package Activity6.Vertebrates;

import Activity6.Vertebrate;

public abstract class Reptile extends Vertebrate {

    public Reptile(String name, String habitat, boolean isEndangered) {
        super(name, habitat, isEndangered);
    }

    @Override
    public void reproduce() {
        System.out.println(name + " pone huevos con cáscara en tierra (ovíparo)");
    }

    public void shedSkin() {
        System.out.println(name + " muda piel periódicamente");
    }
}
