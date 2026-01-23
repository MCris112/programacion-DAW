package Activity8;

import Activity7.Coche;
import Activity7.Moto;
import Activity7.Vehiculo;
import Utilities.MC;

import java.util.ArrayList;

/**
 * 8. Partiendo de la clase abstracta Vehiculo, crea una interfaz Volador con el método volar().
 * Crea las clases:
 *  • Avion que herede de Vehiculo e implemente Volador.
 *  • Helicoptero que también herede de Vehiculo e implemente Volador.
 * En main, crea un ArrayList<Vehiculo> con varios objetos Avion, Helicoptero y Coche.
 * Recorre el array y:
 *  • Llama a arrancar() para todos.
 *  • Solo llama a volar() si el vehículo implementa Volador. Utiliza instanceof para comprobar si
 * implementa Volador
 */
public class Activity8 {

    static void main() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche("Mercedes"));
        vehiculos.add(new Moto("Fiat"));
        vehiculos.add(new Avion("Boeing 747"));
        vehiculos.add(new Helicoptero("Bell 407"));
        vehiculos.add(new Coche("Toyota"));

        // Recorrer y arrancar TODOS
        System.out.println("=== Arrancar ===");
        for (Vehiculo v : vehiculos) {
            v.arrancar();
        }

        System.out.println("\n=== Vuelen ===");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Volador) {  // Verificar si instancia de Volador
                Volador volador = (Volador) v;
                volador.volar();
            } else {
                MC.title.outlineY(v.getMarca() + ": No puede volar.");
            }
        }

    }
}
