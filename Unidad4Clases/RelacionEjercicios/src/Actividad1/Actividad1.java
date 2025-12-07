package Actividad1;

import Utilities.Table;

/**
 * 1. Crea una clase llamada País que tenga los parámetros (nombre, población, PIB), el constructor
 * con parámetros, los correspondientes getter y setters y un método que devuelva el PIB per cápita,
 * calculado como el PIB*100000 dividido por la población. En main haz uso de estas funciones.
 */
public class Actividad1 {

    static void main() {
        Pais espana = new Pais("España", 47000000, 1600.5);
        espana.show();

        System.out.println( espana.getNombre()+" - PIB per capita: "+espana.getPIBPerCapita());
        System.out.println();

        Pais peru = new Pais("Perú", 33000000, 250.7);
        peru.show();
        System.out.println(peru.getNombre() + " - PIB per cápita: " + peru.getPIBPerCapita());
        System.out.println();

        Pais francia = new Pais("Francia", 67000000, 2800.3);
        francia.show();
        System.out.println(francia.getNombre() + " - PIB per cápita: " + francia.getPIBPerCapita());
    }
}
