package Activity6.Animals;

import Activity6.Invertebrates.Myriapoda;

public class Centipede extends Myriapoda {

    public Centipede() {
        super("Ciempiés", "Suelo húmedo", false);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " no hace sonidos");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " pone huevos en tierra húmeda");
    }

}
