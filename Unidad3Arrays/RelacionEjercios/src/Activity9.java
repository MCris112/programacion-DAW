import Utilities.MC;
import Utilities.Table;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 9. Utilizando ArrayList<Integer> crea un programa con un menú que permita al usuario:
 * 1. Agregar un número (si es negativo se le pedirá que meta otro)
 * 2. Eliminar un número (tantos como haya)
 * 3. Mostrar todos los números
 * 4. Comprobar si un número está en la lista
 * 5. Eliminar todos los números
 * 6. Consultar el tamaño de la lista
 * 7. Salir
 * Para borrar todas las ocurrencias utiliza la función removeIf(n -> n == numeroEliminar);
 */
public class Activity9 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> list = new ArrayList<>();

    static void main() {


        boolean programOn = true;

        do {
            Table.instance()
                    .addRow("Opción", "Nombre")
                    .addRow("1", "Añadir")
                    .addRow("2", "Eliminar")
                    .addRow("3", "Mostrar array")
                    .addRow("4", "¿Existe en lista?")
                    .addRow("5", "Eliminar array")
                    .addRow("6", "¿Cúal es el tamaño?")
                    .addRow("7", "Salir")
                    .print();

            switch (sc.nextInt()) {
                case 1:
                    push();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    exists();
                case 5:
                    clear();
                case 6:
                    size();
                default:
                    System.out.println("Opción no válida, intente nuevamente");
                    break;
            }
        }while ( programOn );
    }

    public static void push()
    {

    }

    public static void delete()
    {
    }

    public static void show()
    {
        MC.title.outlineY("Tu array creado:");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

    public  static void exists()
    {
        System.out.println("Inserte un número a buscar:");
        int search =  sc.nextInt();

        if(list.contains(search))
        {
            MC.title.outlineY("Se encontro el numeró en el array", "en la posición:" + list.indexOf(search));
        }else{
            MC.title.outlineY("No se encontró el elemento buscado");
        }

    }

    public   static void clear()
    {
        list.clear();

        MC.title.outlineY("Tu lista ya está vacia");
    }

    public   static void size()
    {
        MC.title.outlineY("El tamaño es de", String.valueOf(list.size()));
    }
}
