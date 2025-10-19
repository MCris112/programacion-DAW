package Activity;

import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 6. Escribe un programa que genere la nómina (bien desglosada) de un empleado según las
 * siguientes condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 – Jefe de proyecto),
 * los días que ha estado de viaje visitando clientes durante el mes y su estado civil (1 -
 * Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950€, 1200€ y 1600€ euros según si se trata de un prog.
 * junior, un prog. senior o un jefe de proyecto respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al
 * sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20%
 * en caso de estar casado.
 * Ejemplo:
 * Introduzca el cargo del empleado (1 - 3): 2
 * ¿Cuántos días ha estado de viaje visitando clientes? 5
 * Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
 * ----------------------------------------------
 * | Sueldo base 1200,00 |
 * | Dietas ( 5 viajes) 150,00 |
 * |---------------------------------------------|
 * | Sueldo bruto 1350,00 |
 * | Retención IRPF (20%) 270,00 |
 * |---------------------------------------------|
 * | Sueldo neto 1080,00 |
 * ----------------------------------------------
 * Nota: El formato de la salida es una propuesta
 */
public class Activity6 {
    static Scanner sc = new Scanner(System.in);

    static void main() {
        MC.printBanner();
        MC.title.outline("Calculador de sueldo");

        int cargo = preguntarCargo();

        while ( cargo == 0 || cargo > 3 )
        {
            MC.title.outlineY("", "OPCION NO VALIDA", "");
            cargo = preguntarCargo();
        }

        // El sueldo base según el cargo es de 950€, 1200€ y 1600€ euros
        int sueldo = switch (cargo) {
            case 2 -> 1200;
            case 3 -> 1600;
            default -> 950;
        };

        System.out.println("¿Cuantos dias ha estado de viaje visitando clientes?");
        int days =  sc.nextInt();

        int estado = preguntarEstadoCivil();

        while ( estado == 0 || estado > 2 )
        {
            MC.title.outlineY("", "OPCION NO VALIDA", "");
            estado = preguntarEstadoCivil();
        }

        int retencion = 25;

        if ( estado == 2)
        {
            retencion = 20;
        }

        int sueldoBruto = sueldo + (days*30) ;
        int irpf = (20 * sueldoBruto) / 100;

        Table.instance()
                .addRow("Sueldo Base", String.valueOf(sueldo) )
                // Por cada día de viaje visitando clientes se pagan 30 euros extra
                .addRow("Dietas ( "+days+" viajes)", String.valueOf(days*30) )
                .addRow(  "Sueldo bruto",  String.valueOf( sueldoBruto ) )
                .addRow( "Retención IRPF("+retencion+"%)", String.valueOf(irpf) )
                .addRow("Sueldo neto", (sueldoBruto-irpf)+"€")
                .print();
    }

    static int preguntarCargo()
    {
        Table.instance()
                .addRow("Opción", "Cargo")
                .addRow("1", "Prog. Junior")
                .addRow("2", "Prog. Senior")
                .addRow("3", "Jefe de Prooyecto")
                .print();

        System.out.println("¿Cual es el cargo?");
        return sc.nextInt();
    }

    static int preguntarEstadoCivil()
    {
        Table.instance()
                .addRow("Opción", "Estado")
                .addRow("1", "Soltero")
                .addRow("2", "Casado")
                .print();
        System.out.println("¿Cúal es su estado civil?");
        return sc.nextInt();
    }
}
