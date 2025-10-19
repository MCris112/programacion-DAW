package Activity;

import Utilities.MC;

import java.util.Scanner;

/**
 * 12. Escribe una función que calcula el mínimo común múltiplo de dos números a partir de conocer
 * la función del máximo común divisor.
 *
 * FORMULA: 𝑚𝑐𝑚(𝑎,𝑏)=∣𝑎⋅𝑏∣/𝑚𝑐𝑑(𝑎,𝑏)
 */
public class Activity12 {
    static void main() {
        MC.printBanner();
        MC.title.outline("Màximo comun divisor");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite um numero: ");
        int num2 = sc.nextInt();

        MC.title.outlineY("El MCM de : (" + num1 + ", " + num2+")", "es: "+ maxComDiv(num1, num2)) ;
    }

    static int minComDiv(int a, int b)
    {
        if (b == 0) {
            return a;
        }
        return minComDiv(b, a % b);
    }

    static int maxComDiv(int a, int b)
    {
        return Math.abs(a * b) / minComDiv(a, b);
    }
}
