package Activities;

import Utilities.MC;
import Utilities.Table;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Usa un ArrayList<String> para almacenar nombres
 * introducidos por el usuario hasta que escriba “fin”. Interesa que no se
 * repitan nombres y al terminar muestra todos los nombres ordenados.
 * ● Para ordenar hay funciones básicas, para cosas complejas habrá que
 * usar un objeto Comparator o hacerlo implícito como en los ejemplos:
 * sort(String.CASE_INSENSITIVE_ORDER);
 * sort((a, b) -> { return -1 * a.compareTo(b); });
 */
public class Activity6 {

    static void main() {
        ArrayList<String> names = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        MC.title.outline("Listado de nombres:");
        System.out.println("Escriba 'FIN' para terminar");
        MC.printLine();

        boolean takeData = true;

        do {
            System.out.print("Ingrese un nombre:");
            String name = sc.nextLine();

            if (name.equals("FIN")) {
                takeData = false;
            }else if (!names.contains(name)) {
                names.add(name);
            }
        }while (takeData);


        names.sort( String.CASE_INSENSITIVE_ORDER );
        names.sort((a, b) -> { return a.compareTo(b); });

        Table table = Table.instance().addRow("Nombres");

        names.forEach( name -> table.addRow(name) );

        table.print();
    }
}
