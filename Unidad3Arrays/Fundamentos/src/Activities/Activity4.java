package Activities;

/**
 * Crea una función que borra un valor en el array. Ej: Quitar 2 → {3,5,7,8}
 */
public class Activity4 {
    static void main() {
        int[] arrayOld = { 3, 2, 5, 7, 8 };

//        int[] arrayNew = insertIn(arrayOld, 4, 5);
        int[] arrayNew = deleteNum(arrayOld, 2);

        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i] + " ");
        }
    }

    static int[] deleteNum(int[] array, int num )
    {
        int removeInts = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) { removeInts++; }
        }

        int[] newArray = new int[array.length - removeInts];
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != num) {
                newArray[pos] = array[i];
                pos++;
            }
        }

        return newArray;
    }

    static int[] addNum(int num, int[] array )
    {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = num;

        return newArray;
    }

    static int[] insertIn(int[] vector, int pos, int val)
    {
        if (pos > vector.length) {
            int[] newArray = new int[pos+1];

            for (int i = vector.length; i < pos; i++) {
                newArray[i] = 0;
            }

            newArray[pos] = val;

            return newArray;
        }else{

            int[] newArray = new int[vector.length+1];
            for (int i = 0; i < pos; i++) {
                newArray[i] = vector[i];
            }

            newArray[pos] = val;

            for (int i = pos +1; i < newArray.length; i++) {
                newArray[i] = vector[i-1];
            }

            return newArray;
        }
    }
}
