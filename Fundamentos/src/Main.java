import java.util.Scanner;

public class Main{

    public static boolean logico = true;

    public static double PI = 3.141592;

    public static void main(String[] args){


        int var = (1+2+3)/3;
        double second = (1+2+3)/3.0;

        System.out.println("primero: "+var+ " | segundo: "+second);
        System.out.printf( "Primero %s - Segundo %s", var, second);

        String name = "Awawa";
        int edad = 22;

        double salario = 5000;

        double awa = (int) 2.6;

        System.out.println( awa );
        System.out.println("Hola!" +name);

        System.out.println("Logico: " + logico);

        System.out.println("Valor de PI: " + PI);

        // Un entero pude guardar un caracter ya que pertenece al codigo ASCI
        int a = 'a';
        // Lo mismo pasa al revez, el char belongs to int ASCI
        char c = 97;

        System.out.println(a);
        System.out.println(c);

        // Imprimir con salto de linea
        System.out.println("Un texto cualquiera");
        System.err.println("Un lindo error");
    }

    /**
     * Imprimir texto
     * @param text Texto a insertar
     * @author Cristopher
     * @version 1.0.3
     */
    public static void imprimirText(String text)
    {

    }
}