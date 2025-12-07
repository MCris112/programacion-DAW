package Actividades.Actividad6;

import Utilities.Table;

import java.util.ArrayList;

public class Actividad6 {

    public static void main(String[] args) {
        // sucursales
        Sucursal sucMadrid = new Sucursal(1, "911223344", "Calle Mayor 123", "Madrid", "Madrid");
        Sucursal sucBarcelona = new Sucursal(2, "933445566", "Av. Diagonal 456", "Barcelona", "Barcelona");

        // hoteles
        Hotel hotelSol = new Hotel(1, "Hotel Sol", "910000111", "Madrid", "Gran Vía 45", 200);
        Hotel hotelMar = new Hotel(2, "Hotel Mar", "930000222", "Barcelona", "Passeig de Gràcia 78", 150);

        // turistas
        Turista ana = new Turista(1, "Calle Luna 12", "Ana", "Martínez", "600123456");
        Turista pedro = new Turista(2, "Av. Sol 34", "Pedro", "García", "600654321");

        // vuelos
        Vuelo vueloMadridParis = new Vuelo(1, "15/12/2025", "Madrid", "París", 10, 180);
        Vuelo vueloBarcelonaRoma = new Vuelo(2, "20/12/2025", "Barcelona", "Roma", 14, 150);

        // Simular la tabla de relacion de reservaciones
        ArrayList<Reservaciones> reservas = new ArrayList<>();
        reservas.add(
                new Reservaciones(ana, hotelSol, sucMadrid, "14/12/2025", "18/12/2025", Regimen.MEDIA_PENSION)
        );
        reservas.add(
                new Reservaciones(pedro, hotelMar, sucBarcelona, "19/12/2025", "23/12/2025", Regimen.PENSION_COMPLETA)
        );

        // Simular la tabla de relacion de vuelos
        ArrayList<TomaDeVuelo> vuelosTomados = new ArrayList<>();

        TomaDeVuelo toma1 = new TomaDeVuelo();
        toma1.setTurista(ana);
        toma1.setVuelo( vueloMadridParis);
        toma1.setSucursal( sucMadrid );
        toma1.setClase( "Turista" );
        vuelosTomados.add(toma1);


        TomaDeVuelo toma2 = new TomaDeVuelo();
        toma2.setTurista( pedro );
        toma2.setVuelo( vueloBarcelonaRoma );
        toma2.setSucursal( sucBarcelona );
        toma2.setClase( "Business" );

        vuelosTomados.add(toma2);

        // Mostrar hoteles
        System.out.println("=== Hoteles ===");
        System.out.println(hotelSol);
        System.out.println(hotelMar);

        System.out.println("\n=== Reservaciones ===");
        for (Reservaciones r : reservas) {
            r.show();
            System.out.println();
        }

        System.out.println("\n=== Vuelos Tomados ===");
        for (TomaDeVuelo t : vuelosTomados) {
            t.show();
            System.out.println();
        }
    }

}
