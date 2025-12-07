package Actividades.Actividad7;

/**
 * ● Actividad: Hemos recibido el encargo de un cliente para definir las clases necesarias
 * (atributos, constructores y get/set) para gestionar una empresa ferroviaria, en la que se
 * distinguen dos grandes grupos: el personal y la maquinaria.
 * En el primero se ubican todos los empleados de la empresa, que se clasifican en tres grupos:
 * ● Maquinistas: nombre, DNI, sueldo y rango
 * ● Mecánicos: nombre, DNI, teléfono, especialidad. La especialidad será un enum
 * (frenos, hidráulica, electricidad o motor)
 * En cuanto a maquinaria podemos encontrar:
 * ● Vagón: número, carga máxima, carga actual y tipo de mercancía
 * ● Locomotora: matrícula, potencia, año de fabricación, mecánico que la repara
 * ● Tren: formado por una locomotora, varios vagones y el maquinista responsable
 * Crea una aplicación que haga uso de estas clases para indicar la situación de hasta 3 trenes
 * que tengan (3, 4 y 2) vagones respectivamente. En main puedes asignar los valores que
 * quieras a cada objeto. En este caso usarás arrays
 */
public class Actividad7 {

    static void main() {
        // Mecanicos
        Mecanico mec1 = new Mecanico("Luis", "111A", "600111222", Especialidad.FRENOS);
        Mecanico mec2 = new Mecanico("María", "222B", "600333444", Especialidad.MOTOR);
        Mecanico mec3 = new Mecanico("Jorge", "333C", "600555666", Especialidad.ELECTRICIDAD);

        Locomotora loco1 = new Locomotora("LOC-001", 3000, 2010);
        loco1.setMecanico(mec1);

        Locomotora loco2 = new Locomotora("LOC-002", 3500, 2015);
        loco2.setMecanico(mec2);

        Locomotora loco3 = new Locomotora("LOC-003", 2800, 2008);
        loco3.setMecanico(mec3);

        // Maquinistas
        Maquinista maq1 = new Maquinista("Juan Pérez", "12345678A", "Senior", 2500);
        Maquinista maq2 = new Maquinista("Laura Gómez", "87654321B", "Junior", 1800);
        Maquinista maq3 = new Maquinista("Carlos Ruiz", "11223344C", "Medio", 2000);

        //Simular de crear un tren
        Vagon[] vagonesTren2 = {
                new Vagon(1, 15000, 12000, "Granos"),
                new Vagon(2, 10000, 9000, "Aceite"),
                new Vagon(3, 11000, 7000, "Cemento"),
                new Vagon(4, 9000, 8500, "Arena")
        };

        Vagon[] vagonesTren3 = {
                new Vagon(1, 7000, 5000, "Papel"),
                new Vagon(2, 6000, 4000, "Plásticos")
        };

        //El primer tren usaré la funcion dinamica de añadir vagones
        Tren tren1 = new Tren(loco1, new Vagon[0], maq1);
        tren1.addVagon( new Vagon(1, 10000, 8000, "Carbón") );
        tren1.addVagon( new Vagon(2, 12000, 10000, "Hierro") );
        tren1.addVagon( new Vagon(3, 8000, 6000, "Madera") );

        Tren tren2 = new Tren(loco2, vagonesTren2, maq2);
        Tren tren3 = new Tren(loco3, vagonesTren3, maq3);

        // Mostrar los trenes en consola
        tren1.print();
        System.out.println();
        tren2.print();
        System.out.println();
        tren3.print();
    }
}
