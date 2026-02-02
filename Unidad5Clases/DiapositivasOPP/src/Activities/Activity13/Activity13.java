package Activities.Activity13;

import Utilities.MC;

/**
 * Desarrolla el siguiente ejemplo de herencia y crea objetos
 * para probar su funcionamiento. Crea los constructores y métodos que
 * necesites.
 */
public class Activity13 {

    static void main() {


        MC.title.outline("EJEMPLO DE HERENCIA - ANIMALES");

        // =============================================
        // Creacion de las clases
        // =============================================
        Perro pastorAleman = new Perro("Rex", "Omnívoro", 3, 63, "Pastor Alemán");
        Gato garfield = new Gato("Garfield", "Carnívoro", 8, 65, "Persa");
        Caballo tornado = new Caballo("Tornado", "Herbívoro", 7, 340, "Alfalfa", 120);

        // =============================================
        // Mostrar información
        // =============================================

        MC.title.outlineY("INFORMACIÓN DE LOS ANIMALES");

        mostrarAnimal(pastorAleman);
        mostrarAnimal(garfield);
        mostrarAnimal(tornado);

        // =============================================
        // Probar setters
        // =============================================

        MC.title.outlineY("MODIFICANDO PROPIEDADES");

        pastorAleman.setRaza("Labrador");
        pastorAleman.setEdad(4);
        System.out.println("Nuevo pastor: " + pastorAleman.getRaza() +
                ", edad: " + pastorAleman.getEdad());

        garfield.setPedigri("Siames");
        System.out.println("Nuevo gato: " + garfield.getPedigri());
    }

    /**
     * Mostrar la información del animal
     * @param animal
     */
    public static void mostrarAnimal(Animal animal) {
        System.out.printf("%s | %s | %d años\n",
                animal.getNombre(),
                animal.getTipoAlimentacion(),
                animal.getEdad()
        );

        System.out.println(animal.getNombre() + " es:");
        if (animal instanceof Perro) {
            System.out.println("  • Perro: " + ((Perro) animal).getRaza());
        } else if (animal instanceof Caballo) {
            System.out.println("  • Caballo: " + ((Caballo) animal).getComida());
        } else if (animal instanceof Gato) {
            System.out.println("  • Gato: " + ((Gato) animal).getPedigri());
        }

        System.out.println(); // Nueva línea
    }
}
