package Activity6;

import Activity6.Animals.*;
import Activity6.Invertebrates.Mollusk;
import Activity6.Vertebrates.Bird;
import Activity6.Vertebrates.Fish;
import Activity6.Vertebrates.Reptile;
import Utilities.MC;
import Utilities.Table;

/**
 * 6. Emplea la herencia para implementar la clasificación de animales según la siguiente web:
 * https://www.mundoestudiante.com/clasificacion-animales-vertebrados-invertebrados/ Realiza tanto
 * las clases como métodos necesarios y ejemplos de ejecución
 */
public class Activity6 {

    static void main() {
        Animal[] zoo = {
                new Frog(),         // Amphibian
                new Dog(),        // Mammal
                new Fish(),         // Fish
                new Eagle(),        // Bird
                new Snake(),        // Reptile
                new Octopus(),      // Cephalopod
                new Starfish(),     // Echinoderm
                new Centipede(),    // Myriapod
                new Spider(),       // Arthropod
                new Earthworm()     // Annelid
        };

        MC.title.outlineY("Zoologico de animales");

        for (Animal animal : zoo) {
            MC.title.outline( animal.name );

            animal.print();

            System.out.print("Sonido:  "); animal.makeSound();
            System.out.print("Movimiento:  "); animal.move();
            System.out.print("Come:  "); animal.eat();
            System.out.print("Reproducción:  "); animal.reproduce();

            // Métodos concretos comunes
            animal.breathe();
            animal.sleep();

            // Métodos específicos de grupos (si existen)
            if (animal instanceof Bird) {
                MC.printLine();
                ((Bird) animal).fly();
                MC.printLine();
            }

            if ( animal instanceof Reptile)
            {
                MC.printLine();
                ((Reptile) animal).shedSkin();
                MC.printLine();
            }

            if ( animal instanceof Mollusk)
            {
                MC.printLine();
                ((Mollusk) animal).camouflage();
                MC.printLine();
            }

            System.out.println("\n\n\n");
        }
    }
}
