import Utilities.MC;

import java.util.Scanner;

/**
 * 4. Escribir un programa que valide el décimo de la bonoloto. Tendrás un array con los valores
 * correctos y otro el que introduzca el usuario. El programa verificará cuántos aciertos ha tenido.
 */
public class Activity4 {

    static void main() {
        int[] bonoloto = generateBonoloto();

        MC.printBanner();
        MC.title.outline("\uD83C\uDF40 Bonoloto \uD83C\uDF40");

        Scanner sc = new Scanner(System.in);

        int[] digitos = new int[6];
        for (int i = 0; i < digitos.length; i++) {
            System.out.println("Inserte "+(i+1)+"° digito");
            digitos[i] = sc.nextInt();
        }

        int win = getSuccesses(bonoloto, digitos);

        if ( win == bonoloto.length )
        {
            MC.title.outlineY("FELICIDADES!! GANASTE!!");
        }else{
            MC.title.outlineY("SORRY \uD83D\uDE22, Acertaste: "+win+"/"+bonoloto.length);
        }
    }

    public static int[] generateBonoloto()
    {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static int getSuccesses(int[] bonoloto, int[] digitos)
    {
        int successes = 0;

        for (int i = 0; i < digitos.length; i++) {
            if ( bonoloto[i] == digitos[i])
                successes++;
        }

        return successes;
    }
}
