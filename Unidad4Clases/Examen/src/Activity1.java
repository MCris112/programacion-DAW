import Utilities.MC;
import Utilities.Table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 1. (3 puntos) Para las oposiciones de informática se van a sacar 5 bolas de entre 65 temas a estudiar.
 * El opositor se ha estudiado los temas: 4, 11, 23, 34, 35, 36, 39, 50, 60 y 65. En un menú tendrás las
 * siguientes acciones:
 * 1. Generar un vector aleatorio donde asegures que no se repita ningún número. Ejemplo:
 * {1,60,44,12,23} (1,5 puntos)
 * 2. Realiza un función que valide el vector generado con el vector del opositor y devuelva los
 * temas que coinciden ordenados. Si hay coincidencias dile enhorabuena y si no, que lo
 * sientes. En el ejemplo, dirá: “Temas coincidentes: 23, 60. Enhorabuena” (1,5 puntos)
 * Elabora este programa utilizando la clase ArrayList<Integer>.
 */
public class Activity1 {

    static ArrayList<Integer> valores = new ArrayList<>();
    static ArrayList<Integer> temas = new ArrayList<>();

    static void main() {
        Scanner sc = new Scanner(System.in);

        // { 4, 11, 23, 34, 35, 36, 39, 50, 60, 65 }
        temas.add(4);
        temas.add(11);
        temas.add(23);
        temas.add(34);
        temas.add(35);
        temas.add(36);
        temas.add(39);
        temas.add(50);
        temas.add(60);
        temas.add(65);

        boolean takeData = true;

        do {
            Table.instance()
                    .addRow("Opciones")
                    .addRow("1", "Aleatorio")
                    .addRow("2", "Validar")
                    .addRow("0", "Salir")
                    .print();

            System.out.println("Seleccione una opción:");

            switch( Integer.parseInt(sc.nextLine()) ) {
                case 0: takeData = false; break;
                case 1: aleatorio(); break;
                case 2: validarDatos(); break;
                default: MC.title.outlineY("Inserte una opción valida"); break;
            }
        }while ( takeData );

        MC.title.outline("MUCHAS GRACIAS");
    }

    public static void aleatorio()
    {
        valores.clear();

        valores.add( random(1, 65) );
        valores.add( random(1, 65) );
        valores.add( random(1, 65) );
        valores.add( random(1, 65) );
        valores.add( random(1, 65) );

        Table table = Table.instance();
        for (int i = 0; i < valores.size(); i++) {
            table.addRow( valores.get(i) + "" );
        }

        MC.title.outlineY("VALORES GENERADOS CORRECTAMENTE");
        table.print();
    }

    public static void validarDatos()
    {
        ArrayList<Integer> obtained = new  ArrayList<>();

        for (int i = 0; i < valores.size(); i++) {
            if ( temas.contains(valores.get(i)) ) {
                obtained.add(valores.get(i));
            }
        }

        if ( obtained.isEmpty() ) {
            MC.title.outlineY("Lo siento... 😢");
        }else{

            Collections.sort(obtained);

            System.out.println();
            System.out.print("Temas coincidientes:");
            for (Integer integer : obtained) {
                System.out.print(integer+", ");
            }
            System.out.println("En Hora buena");
            System.out.println();
            System.out.println();

        }
    }


    public static int random(int min, int max)
    {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
