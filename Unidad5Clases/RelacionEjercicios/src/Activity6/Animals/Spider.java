package Activity6.Animals;

import Activity6.Invertebrates.Arthropod;

public class Spider extends Arthropod {

    public Spider() {
        super("Araña lobo", "Bosques y jardines", false);
    }

    @Override
    public void move() {
        System.out.println(name + " camina con 8 patas articuladas");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " frota patas (vibraciones)");
    }

    @Override
    public void eat() {
        System.out.println(name + " inyecta veneno y succiona líquidos");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " hembra pone sacos de huevos en telaraña");
    }

}
