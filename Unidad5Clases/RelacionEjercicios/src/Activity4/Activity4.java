package Activity4;

import Utilities.MC;
import Utilities.Table;

/**
 * 4. Crea una clase genérica Caja completa que almacene un valor de cualquier tipo y lo muestre. Por
 * completa se refiere a que tiene su constructor, métodos get-set y de salida. Haz varias pruebas de su
 * uso
 */
public class Activity4 {

    static void main() {

        // Caja de nombres
        MC.title.outlineY("Caja de nombres");
        Caja<String> nombres = new Caja<String>();
        nombres.add("Aurora");
        nombres.add("Nicolas");
        nombres.add("Margio");
        nombres.add("Adrian");
        nombres.print();

        nombres.removeAt(2);
        nombres.print();

        // EJEMPLO 2: Caja de enteros (notas)
        MC.title.outlineY("Caja de notas");
        Caja<Integer> notas = new Caja<Integer>();
        notas.add(7);
        notas.add(8);
        notas.add(5);
        notas.add(9);
        nombres.print();

        notas.remove(5);  // Elimina el primer 5
        notas.print();

        // EJEMPLO 3: Caja de dobles (precios)
        MC.title.outlineY("Caja de precios");
        Caja<Double> precios = new Caja<Double>();
        precios.add(19.99);
        precios.add(45.50);
        precios.add(12.75);
        precios.print();

        // Usar get() y positionOf()
        System.out.println("Precio en posición 1: " + precios.get(1));
        System.out.println("Posición de 12.75: " + precios.positionOf(12.75));

        // EJEMPLO 4: Caja de booleanos
        MC.title.outlineY("Caja de booleanos");
        Caja<Boolean> estados = new Caja<Boolean>();
        estados.add(true);
        estados.add(false);
        estados.add(true);
        estados.add(false);
        estados.print();
    }

}
