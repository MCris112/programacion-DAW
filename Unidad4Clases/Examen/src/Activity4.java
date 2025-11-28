import Utilities.MC;

import java.util.Scanner;

/**
 * 4. (2 puntos) Utilizando las funciones de String, crea la función verificaAnagrama que determina
 * si dos palabras introducidas por teclado, una es un anagrama de la otra, es decir, contiene las
 * mismas letras pero cambiadas de orden. Tendrás que pasarlas a char[], ordenarlas y ver si son
 * iguales. Además, deberás pasar todas las letras a minúscula y antes de comprobar si es anagrama ver
 * los tamaños de ambas palabras. Ejemplos: Amor-roma o nido-oDin son anagrama pero alumnoclase no, por tener tamaño diferentes, ni nido-Oden porque la i no está en Oden.
 */
public class Activity4 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        MC.title.outline("Vericar si es Anagrama");

        System.out.println("Inserte palabra 1:");
        String word1 = sc.nextLine();
        System.out.println("Inserte palabra 2:");
        String word2 = sc.nextLine();

        verificaAnagrama(word1, word2);
    }

    public static void verificaAnagrama(String wordA, String wordB)
    {
        //Verificar si es mismo tamaño
        if ( wordA.length() != wordB.length() ) {
            MC.title.outlineY(
                    "No son el mismo tamaño",
                    wordA+ " ("+wordA.length()+")",
                    wordB+ " ("+wordB.length()+")"
            );
        }else{
            boolean isAnagram = true;

            //Tendrás que pasarlas a char[]
            //deberás pasar todas las letras a minúscula y antes de comprobar
            char[] word1 = wordA.toLowerCase().toCharArray();
            char[] word2 = wordB.toLowerCase().toCharArray();

            for (int i = 0; i < word1.length; i++) {
                if ( word1[i] != word2[word2.length-i-1] ) {
                    isAnagram = false;
                }
            }

            if ( isAnagram )
            {
                MC.title.outline("LA PALABRA ES UNA ANAGRAMA");
            }else{
                MC.title.outlineY("LA PALABRA NO ES UNA ANAGRAMA", "😢");
            }
        }
    }

}
