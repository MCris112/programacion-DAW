import java.util.Scanner;

public class NumberOfMonth {

    static void main() {
        System.out.println("|--------------------------------|");
        System.out.printf("| %-30s | \n", "Escribe el numero del mes...." );
        System.out.println("|--------------------------------|");

        System.out.println();
        Scanner input = new Scanner(System.in);
        int number =  input.nextInt();

        System.out.println("|--------------------------------|");

        if ( number == 1 )
            print("Enero");

        if ( number == 2 )
            print("Febrero");

        if( number == 3 )
            print("Marzo");

        if( number == 4 )
            print("Abril");

        if( number == 5 )
            print("Mayo");

        if( number == 6 )
            print("Junio");

        if( number == 7 )
            print("Julio");

        if( number == 8 )
            print("Agosto");

        if( number == 9 )
            print("Septiembre");

        if( number == 10 )
            print("Octubre");

        if( number == 11 )
            print("Noviembre");

        if( number == 12 )
            print("Diciembre");

        if( number <= 0 || number > 12 )
            print("El numero seleccionado no pertenece a las fechas");


        switch (number) {
            case 1:
                print("Enero");
                break;
            case 2:
                print("Febrero");
                break;
            case 3:
                print("Marzo");
                break;
            case 4:
                print("Abril");
                break;
            case 5:
                print("Mayo");
                break;
            case 6:
                print("Junio");
                break;
            case 7:
                print("Julio");
                break;
            case 8:
                print("Agosto");
                break;
            case 9:
                print("Septiembre");
                break;
            case 10:
                print("Octubre");
            case 11:
                print("Noviembre");
                break;
            case 12:
                print("Diciembre");
                break;
            default:
                print("El numero seleccionado no pertenece a las fechas");
                break;
        }

        System.out.println("|--------------------------------|");
    }

    static void print(String text)
    {
        System.out.printf("| %-30s | \n",  text );
    }
}
