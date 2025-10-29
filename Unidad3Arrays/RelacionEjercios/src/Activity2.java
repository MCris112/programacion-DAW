import Utilities.MC;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. Escribir un programa que solicite al usuario cuántos números desea introducir y que muestre el
 * vector original y el resultado en orden de mayor a menor. Puedes elegir el método de ordenación.
 */
public class Activity2 {

    static void main() {
        MC.printBanner();

        MC.title.outline("Dime los números");

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cúantos digitos vas a insertar?");
        int[] digitos = new int[ sc.nextInt() ];

        for (int i = 0; i < digitos.length; i++) {
            System.out.println("Inserte "+(i+1)+"° digito");
            digitos[i] = sc.nextInt();
        }

        MC.title.outlineY("Insertado correctamente");

        System.out.println("Tus datos insertados:");
        MC.printArray(digitos);

        System.out.println("Ordenado:");
        digitos = ordenacionBurbuja( digitos );
        MC.printArray(digitos);
    }

    public static int[] ordenacionBurbuja(int[] vec){
        final int N=vec.length;
        for(int i=N-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(vec[j]>vec[j+1]){
                    int temp=vec[j];
                    vec[j]=vec[j+1];
                    vec[j+1]=temp;
                }
            }
        }
        return vec;
    }
}
