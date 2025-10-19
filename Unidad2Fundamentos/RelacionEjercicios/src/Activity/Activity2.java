package Activity;

import Utilities.MC;

import java.util.Scanner;

/**
 * 2. Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
 * horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se
 * pagan a 16 euros la hora.
 * Ejemplos de salida:
 * Por favor, introduzca el número de horas trabajadas durante la semana: 36
 * El sueldo semanal que le corresponde es de 432 euros
 * Por favor, introduzca el número de horas trabajadas durante la semana: 55
 * El sueldo semanal que le corresponde es de 720 euros
 */
public class Activity2 {

    public static void main() {
        MC.title.outline("Calcular Salario semanal");

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int hours = sc.nextInt();
        int pago = 0;

        if ( hours > 40 )
        {
            pago = 40*12;

            hours -=40;
            pago += hours*16;
        }else{
            pago = hours*12;
        }

        System.out.println();
        MC.title.outlineY("El sueldo semanal que le corresponde: "+pago+" euros");
    }
}
