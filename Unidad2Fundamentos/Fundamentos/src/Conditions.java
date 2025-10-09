import java.util.Scanner;

public class Conditions {

    public static void main(String[] args)
    {
        int user = 45;

        System.out.println("|--------------------------------|");
        if( user <= 18 )
        {
            System.out.printf("| %-30s | \n", "User is 18 or yunger");
        }else if( user > 18 && user < 40)
        {
            System.out.printf("| %-30s | \n", "User is between 19 and 39");
        }else if( user == 45 || user == 50){
            System.out.printf("| %-30s | \n", "User is 45 or 50");
        }else{
            System.out.printf("| %-30s |\n", "User is older than 40");
        }
        System.out.println("|--------------------------------|");


        System.out.println();
        System.out.println("Inserte su numero: ");
        // Exejercicio si sabebos que un numeor es divisible por 2 o por 3


        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        System.out.println("|--------------------------------|");
        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.printf("| %-30s | \n", "El numero es divisible por 2 y por 3" );
        }else if ( numero % 2 ==0)
        {
            System.out.printf("| %-30s | \n", "El numero es divisible en 2");
        }else if( numero % 3 == 0)
        {
            System.out.printf("| %-30s | \n", "El numero es divisible en 3" );
        } else{
            System.out.printf("| %-30s | \n", "El numero no es divisible entre 2 o 3");
        }
        System.out.println("|--------------------------------|");
    }
}
