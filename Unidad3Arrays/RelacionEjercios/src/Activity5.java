import Utilities.MC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 5. Escribir el programa anterior pero empleando funciones de ArrayList<Integer>
 */
public class Activity5 {

    static void main() {
        ArrayList<Integer> bonoloto = generateBonoloto();

        MC.printBanner();
        MC.title.outline("\uD83C\uDF40 Bonoloto \uD83C\uDF40");

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> digitos = new ArrayList<>();

        for (int i = 0; i < bonoloto.size(); i++) {
            System.out.println("Inserte "+(i+1)+"° digito");
            digitos.add( sc.nextInt() );
        }

        int win = getSuccesses(bonoloto, digitos);

        if ( win == bonoloto.size() )
        {
            MC.title.outlineY("FELICIDADES!! GANASTE!!");
        }else{
            MC.title.outlineY("SORRY \uD83D\uDE22, Acertaste: "+win+"/"+bonoloto.size());
        }
    }

    public static ArrayList<Integer> generateBonoloto() {
        return new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
    }

    public static int getSuccesses(ArrayList<Integer> bonoloto, ArrayList<Integer> digitos)
    {
        int successes = 0;

        for (int i = 0; i < bonoloto.size(); i++) {
            if ( bonoloto.get(i).equals( digitos.get(i) ) )
                successes++;
        }


        return successes;
    }
}
