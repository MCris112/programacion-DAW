package Activity6.Vertebrates;

import Activity6.Vertebrate;

public class Fish extends Vertebrate {

    public Fish() {
        super("Pez", "Ríos y océanos", false);
    }

    @Override
    public void move() {
        System.out.println(name + " nada con aletas y aleta caudal");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " hace chasquidos bajo el agua");
    }

    @Override
    public void eat() {
        System.out.println(name + " succiona plancton o caza peces pequeños");
    }

    public void reproduce() {
        System.out.println(name + " pone huevos en agua (miles de huevas)");
    }

    @Override
    public void breathe() {
        System.out.println("Respira óxigeno con las branquias");
    }
}
