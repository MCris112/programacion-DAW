package Activity4;

import Utilities.MC;
import Utilities.Table;

import java.util.ArrayList;

/**
 * 4. Se desea desarrollar una aplicación en Java para la gestión de un parking.
 * En el parking pueden estacionar distintos tipos de vehículos y todos ellos comparten una serie de
 * comportamientos comunes. (3 puntos)
 * • Habrá una interfaz Parkeable, que tendrá el atributo de plazas=50 y las funciones entrar,
 * salir y calcularPrecio(horas)
 * • Habrá una clase abstracta Vehiculo que implementa esta interfaz con el atributo matrícula y
 * un atributo static de plazas ocupadas. En las funciones de la interfaz se mostrará “El
 * vehículo con matrícula xxxxx ha entrado/salido del parking” e irá incrementando o
 * decrementando las plazas ocupadas. El método de calcularPrecio(horas) quedará como
 * abstracto y habrá un método que devuelva el número de plazas libres.
 * • Habrá una clase Coche y Moto que tendrán por atributo una constante precio_hora con 2€
 * para el coche y 1€ para la moto. Estas clases heredarán de Vehiculo y al implementar
 * calcularPrecio dirán el número de horas y calcularán el precio como horas*precio_hora.
 * • Haz una clase que haga de main donde los coches y motos van entrando y saliendo del
 * parking y vaya mostrando el estado del parking y lo que pagan al salir. Genera las horas que
 * han estado de manera aleatoria.
 */
public class Activity4 {

    static void main() {

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        // Generar cuantos Vehiculos entran
        for (int i = 0; i < MC.random(3, 10); i++) {
            int tipo = MC.random(1, 2);

            Vehiculo vehiculo = null;

            if (tipo == 1) {
                vehiculo = new Coche("ASJDF-"+MC.random(100, 200) );
            }else{
                vehiculo = new Moto("MOTO-"+MC.random(100, 200) );
            }

            vehiculos.add(vehiculo);
        }

        for ( Vehiculo vehiculo : vehiculos ) {
            vehiculo.entrar();

            if ( Vehiculo.plazasOcupadas > vehiculo.getPlazasLibres() )
            {
                MC.title.outlineY("NO HAY MAS PLAZAS!! Sorry");
            }else{
                Table table = Table.instance()
                        .addRow("Parking")
                        .addRow("Plazas Disponibles", vehiculo.getPlazasLibres() +"")
                        .addRow("Plazas Ocupadas", Vehiculo.plazasOcupadas+"");

                int horas = MC.random(1,6);

                table.addRow(vehiculo.getMatricula() )
                        .addRow("Horas ocupadas", horas+"h")
                        .addRow("Precio", vehiculo.calcularPrecio(horas)+"€" );

                table.print();

                vehiculo.salir();

                System.out.println();
                System.out.println();
            }

        }
    }



}
