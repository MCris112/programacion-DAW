package Activity6.Animals;

import Activity6.Invertebrates.Annelid;

public class Earthworm extends Annelid {

    public Earthworm() {
        super("Lombriz de tierra", "Suelo fértil", false);
    }

    @Override
    public void move() {
        System.out.println(name + " se contrae por segmentos");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " no hace sonidos");
    }

    @Override
    public void eat() {
        System.out.println(name + " traga tierra y la digiere");
    }

}
