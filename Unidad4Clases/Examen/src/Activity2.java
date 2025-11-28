import Utilities.MC;

import java.util.Scanner;

/**
 * 2. (2 puntos) Implementa la función obtenerVector(array, num), donde obtengas como salida un
 * array que en cada posición tiene la suma de los num elementos consecutivos. Tienes que verificar
 * que num es un número menor que el tamaño del vector. Ejemplo para un array que tiene
 * {10,1,5,8,9,2} y num=3, el resultado saldría {16, 14, 22, 19}, donde 16= (10+1+5), 14=(1+5+8),
 * 22=(5+8+9) y 19=(8+9+2). El array de salida se genera como array dinámico.
 */
public class Activity2 {

    static void main() {
        int[] data = {10,1,5,8,9,2};

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor a generar:");
        int num = Integer.parseInt(sc.nextLine());

        if ( num >= data.length )
        {
            MC.title.outlineY("Inserta un numero menor a: "+data.length);
        }else{
            int[] valor = obtenerVector(data, num);

            MC.printArray(valor);
        }
    }


    public static int[] obtenerVector(int[] data, int num)
    {
        int[] vector = {};

        for (int i = 0; i < data.length; i++) {
            if ( i+num-1 >= data.length)
            {
                //no hay datos suficientes
            }else{
                int sum = 0;
                for (int j = 0; j < num; j++) {
                    sum += data[i+j];
                }
                vector = addVector(vector, sum);
            }
        }

        return vector;
    }

    public static int[] addVector(int[] data, int num)
    {
        int[] vector = new int[data.length+1];
        for (int i = 0; i < data.length; i++) {
            vector[i] = data[i];
        }

        vector[data.length] = num;

        return  vector;
    }
}
