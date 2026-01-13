package Activities.Activity10;

import java.util.Comparator;

/**
 * Actividad 3: Realiza un método genérico que devuelve el máximo de dos
 * valores
 */
public class Activity10 {

    static void main() {
        String[] strings = {"Aurora", "Nicolas", "Marggio"};
        Integer[] numbers = {5, 2, 8, 1};

        // Lexicographic for strings
        System.out.println(getMax(strings));  // cherry

        // Numeric for integers
        System.out.println(getMax(numbers));  // 8
    }

    public static <T extends Comparable<? super T>> T getMax(T[] array) {
        T max = array[0];
        for (T e : array) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }

}
