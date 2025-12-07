package Actividades.Actividad4;

import Actividades.Actividad4.Relaciones.Escribe;
import Actividades.Actividad4.Relaciones.Publica;

public class Actividad4 {

    static void main() {
        Periodista periodista1 = new Periodista(
                1, "Doming", "Lopez Oller", "666777999", " Investigacion"
        );

        Periodista periodista2  = new Periodista(
                2, "Nicolas", "Asencio Perez", "123456789", "Buscador"
        );



        Revista revista1 = new Revista(
                1, "OXFORD", "Deporte", "Diario"
        );
        Revista revista2  = new Revista(
                2, "ABC", "Periodico", "Diario"
        );

        Seccion seccion1 = new Seccion( "Deporte", "123");
        Ejemplar ejemplar1 = new Ejemplar( "12/11/25", 32, 3);

        seccion1.setRevista(revista1);
        ejemplar1.setRevista(revista1);


        Sucursal sucursal1 = new Sucursal(
                1, "Direccion", "999666333", "Huercal Overa", "Almeria"
        );


        Empleado emp1 = new Empleado(
                1, "1111111111", "Alvaro", "Asdfs", "123456789"
        );

        Empleado emp2 = new Empleado(
                2, "22222222", "Maria", "Garcia", "99999999x"
        );
        Empleado emp3 = new Empleado(
                3, "333333", "Aurora", "Lopez", "99x92223"
        );


        Publica[] publicaciones = new Publica[2];
        Publica p1 = new Publica(sucursal1, revista1);
        Publica p2 = new Publica(sucursal1, revista2);
        publicaciones[0] = p1;
        publicaciones[1] = p2;

        Escribe[] escribes = new  Escribe[2];
        Escribe e1 = new Escribe( revista1, periodista1);
        Escribe e2 = new Escribe( revista1, periodista2);
        escribes[0] = e1;
        escribes[1] = e2;


        System.out.println(periodista1);
        System.out.println(emp1);
    }
}
