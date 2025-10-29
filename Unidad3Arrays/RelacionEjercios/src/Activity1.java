import Utilities.MC;

/**
 * 1. Escribe un programa que simule el comportamiento de una pila creando una función push y otra
 * pop. La función push inserta un número al final del vector y devuelve el nuevo array. La función
 * pop elimina el último número del array y lo devuelve
 */
public class Activity1 {

    static int[] num = new int[0];

    static void main() {
        MC.printBanner();
        MC.title.outline("Simulación ArrayList");

        MC.title.outlineY("Añadiendo 1, 3, 4");
        push(1);
        push(3);
        push(4);

        System.out.println();
        System.out.println("Array Final: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println();
        MC.title.outlineY("Eliminar ultimo valor (pop)");
        pop();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void push(int val)
    {
        int[] result = new int[num.length+1];

        for(int i = 0; i < num.length; i++)
            result[i] = num[i];

        result[result.length-1] = val;

        num = result;
    }

    public static void pop()
    {
        int[] result = new int[num.length-1];

        for(int i = 0; i < result.length; i++)
            result[i] = num[i];

        num = result;
    }
}
