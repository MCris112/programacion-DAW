package Activities;

import java.util.Scanner;

/**
 * Realiza una función que busca un número
 * en un array e indica dónde está
 */
public class Activity1 {

    static void main() {
        int[] myArray = {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número a buscar");
        int num = sc.nextInt();
        if ( num < 1 || num > 9 )
        {
            System.out.println("Se puede buscar entre 1 - 9");
        }else{
            for (int i=0; i<myArray.length; i++){
                if (myArray[i] == num){
                    System.out.printf("Se encontro: %d | en la posición: %d",myArray[i], i);
                }
            }
        }
    }


}
