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

        Caja<String> nombres = new Caja<String>();

        MC.title.outlineY("Caja de nombres");
        nombres.add( "Aurora" );
        nombres.add( "Nicolas" );
        nombres.add( "Margio" );
        nombres.add( "Adrian" );

        showCaja(nombres);

        nombres.removeAt(2);

        showCaja(nombres);

        // TODO: Añadir mas ejemplos

    }

    public static <T> void showCaja( Caja<T> caja)
    {
        Table tableNombres = Table.instance().addRow("Lista");

        for ( T nombre: caja.getLista() )
        {
            tableNombres.addRow( nombre.toString() );
        }

        tableNombres.print();
    }
}
