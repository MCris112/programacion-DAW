
package Activities.Activity12;

import java.util.HashMap;
import java.util.Map;

/**
 * Actividad: Dada una lista de marcas de coches, crea un programa que
 * usa hashMap<String,Integer>, donde Integer tenga las veces que
 * aparece cada marca en la lista. Hazlo usando Map usando sus métodos
 * containsKey, get y put.
 */
public class Activity12 {

    static Map<String, Integer> coches = new HashMap<>();

    static void main() {

        addCoche("ferrari");
        addCoche("ferrari");
        addCoche("ferrari");
        addCoche("hundai");
        addCoche("hundai");

        System.out.println("\n--- Lista completa de Coches ---");
        for (Map.Entry<String, Integer> entrada : coches.entrySet()) {
            System.out.println("Marca: " + entrada.getKey() + " | Cantidad: " + entrada.getValue());
        }

    }

    public static void addCoche(String name )
    {
        if ( !coches.containsKey(name))
        {
            coches.put( name, 1 );
            return;
        }

        coches.put(name, coches.get(name) + 1 );
    }
}
