import java.util.Scanner;

/**
 *  Realiza una función que busca un número en un array e indica dónde está
 */
public class Activity1BuscaArray {

    static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Inserte un numero a buscar entre 1-10");
        Scanner sc = new Scanner(System.in);
        int search =  sc.nextInt();

        if (search <=0 || search > 10)
        {
            System.out.println("No existe el numero");
        }else{
            for (int i = 0; i != search ; i++) {
                if (numbers[i] == search) {
                    System.out.println("El numero es: "+numbers[i] + " - Posición: "+i);
                }
            }

        }
    }
}
