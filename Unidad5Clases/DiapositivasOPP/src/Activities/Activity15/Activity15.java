package Activities.Activity15;

import java.util.ArrayList;

/**
 * Clase abstracta Vehiculo:
 *
 * - String matricula
 * - Método abstracto int velocidadMaxima()
 * - Método concreto mostrarInfo()
 *
 * Clases:
 *
 * - Coche
 * - Moto
 * - Camion
 *
 * Guárdalos en un ArrayList<Vehiculo> y recorre la lista.
 */
public class Activity15 {

    static void main() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche("1234-ABC"));
        vehiculos.add(new Moto("5678-DEF"));
        vehiculos.add(new Camion("9012-GHI"));
        vehiculos.add(new Coche("3456-JKL"));

        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            System.out.println();
        }
    }
}
