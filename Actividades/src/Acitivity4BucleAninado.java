import Utilities.MC;
import Utilities.Table;

public class Acitivity4BucleAninado {

    static void main() {

        MC.printTitle("Tabla de multiplicar");


        System.out.println();


        for (int i = 1; i <= 10; i++) {
            System.out.println();
            MC.printTitle("Tabla del "+i);

            Table table = new Table("Tabla "+i);
            table.addRow("Operacion", "Resultado");

            for (int j = 1; j <= 10; j++) {
                table.addRow(i+"x"+j, ""+(i*j) );
            }

            table.print();
        }
    }
}
