package Actividad4;

import Actividad4.Relaciones.ClienteCompraCocheNuevoConVendedor;
import Actividad4.Relaciones.ExtraTieneCocheNuevo;
import Actividad4.Relaciones.VersionTieneExtra;

public class Actividad4 {

    static void main() {

        // Creo la marca y el modelo
        Marca marca1 = new Marca(1, "Toyota");
        Modelo modelo1 = new Modelo(1, "Corolla");
        modelo1.setMarca(marca1);

        Version version1 = new Version(1, 120, "Corolla Hybrid", 22000.0, Combustible.ELECTRICO);
        version1.setModelo(modelo1);

        Extra extra1 = new Extra(1, "GPS", "Sistema de navegación integrado");
        Extra extra2 = new Extra(2, "Asientos de cuero", "Mayor confort y estilo");

        VersionTieneExtra vte1 = new VersionTieneExtra(version1, extra1, 800.0);
        vte1.show();
        System.out.println();
        VersionTieneExtra vte2 = new VersionTieneExtra(version1, extra2, 1200.0);
        vte2.show();
        System.out.println();

        CocheNuevo cocheNuevo1 = new CocheNuevo(1, "1234-ABC");
        cocheNuevo1.setVersion(version1);

        ExtraTieneCocheNuevo etcn1 = new ExtraTieneCocheNuevo(extra1, cocheNuevo1);
        ExtraTieneCocheNuevo etcn2 = new ExtraTieneCocheNuevo(extra2, cocheNuevo1);

        // Mostrar relación Extra–CocheNuevo
        System.out.println();
        etcn1.show();
        System.out.println();
        etcn2.show();
        System.out.println();

        Cliente cliente1 = new Cliente(1, "Aurora", "López", "Calle Granada 45", "600123456");
        cliente1.show();

        // Crear Vendedor
        Vendedor vendedor1 = new Vendedor(1, "Domingo", "Pérez", "950987654", "Av. Principal 12");

        // Relación: Cliente compra coche nuevo con vendedor
        ClienteCompraCocheNuevoConVendedor compra1 =
                new ClienteCompraCocheNuevoConVendedor(cliente1, cocheNuevo1, vendedor1, "07/12/2025");

        // Mostrar compra
        compra1.show();

    }
}
