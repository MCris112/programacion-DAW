public class Test
{

    public static void main(String[] args) {

        int[] numeros = {23, 233, 98};

        numeros = push(numeros, 1);

        System.out.println("Numeros:");
        show(numeros);
        numeros = push(numeros, 49);

        show( numeros);

        numeros = pop(numeros);

        show(numeros);
        
    }

    public static int[] push(int[] numeros, int num)
    {
        int[] data = new int[ numeros.length + 1];

        for (int i = 0; i < numeros.length; i++) {
            data[i] = numeros[i];
        }

        data[numeros.length] = num;

        return data;
    }

    public static int[] pop( int[] numeros )
    {
        int[] nuevoArreglo = new int[numeros.length - 1];

        for (int i = 0; i < nuevoArreglo.length; i++) {
            nuevoArreglo[i] = numeros[i];
        }

        return nuevoArreglo;
    }

    public static void show(int[] numeros)
    {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print( numeros[i] + ", ");
        }

        System.out.println();
    }
}