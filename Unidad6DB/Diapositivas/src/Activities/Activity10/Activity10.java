package Activities.Activity10;

import Utilities.ModelHelper;
import com.darkredgm.querymc.Database.DB;
import com.darkredgm.querymc.Database.Model;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Realiza los siguientes diagramas E-R en JAVA y
 * haz pruebas que muestren su acceso y funcionamiento
 *
 * Diapositiva 28
 */
public class Activity10 {

    public static void main(String[] args) {
        try {
            migration();

            ArrayList<Model> models = new ArrayList<>();

            // 1. Provincias y Localidades
            Provincia prov1 = new Provincia("Madrid");
            prov1.save();
            models.add(prov1);

            Localidad loc1 = new Localidad("Madrid Capital", prov1);
            loc1.save();
            models.add(loc1);

            // 2. Cliente y Cesta
            Cliente cli1 = new Cliente("Juan", "Pérez", "López", "Calle Falsa 123", "juan@test.com", "600111222", loc1);
            cli1.save();
            models.add(cli1);

            Cesta cesta1 = new Cesta("2026-03-09", cli1);
            cesta1.save();
            models.add(cesta1);

            // 3. Autor
            Autor autor1 = new Autor("Gabriel", "García", "Márquez", "www.gabo.com", "600333444", "Aracataca", loc1);
            autor1.save();
            models.add(autor1);

            // 4. Editorial
            Editorial edit1 = new Editorial("Penguin Random House", "Avenida Siempre Viva", "910000000",
                    "www.penguin.es", loc1);
            edit1.save();
            models.add(edit1);

            // 5. Almacén
            Almacen almacen1 = new Almacen("914445555", "Polígono Industrial", loc1);
            almacen1.save();
            models.add(almacen1);

            // 6. Libros (Papel y Ebook)
            // Primero creamos el libro base para papel
            Libro libroBasePapel = new Libro("978-3-16-148410-0", "Cien años de soledad", "Obra maestra", 1967,
                    "Papel");
            libroBasePapel.save();
            models.add(libroBasePapel);

            // Y luego su especificacion en LibroPapel
            LibroPapel libroPapel1 = new LibroPapel(libroBasePapel, "Madrid", "2026-01-01", 19.99);
            libroPapel1.save();
            models.add(libroPapel1);

            // Libro base para Ebook
            Libro libroBaseEbook = new Libro("978-0-12-345678-9", "Crónica de una muerte anunciada", "Novela", 1981,
                    "Ebook");
            libroBaseEbook.save();
            models.add(libroBaseEbook);

            // Especificacion en LibroEbook
            LibroEbook libroEbook1 = new LibroEbook(libroBaseEbook, 2.5, 9.99);
            libroEbook1.save();
            models.add(libroEbook1);

            // 7. Relaciones N:M
            // Usamos el libro base (libroBasePapel) para estas relaciones porque reciben un
            // tipo 'Libro'
            AutorEscribeLibro aut_lib = new AutorEscribeLibro(autor1, libroBasePapel);
            aut_lib.save();
            models.add(aut_lib);

            EditorialPublicaLibro edit_lib = new EditorialPublicaLibro(edit1, libroBasePapel);
            edit_lib.save();
            models.add(edit_lib);

            CestaContieneLibro cesta_lib = new CestaContieneLibro(cesta1, libroBasePapel, 2);
            cesta_lib.save();
            models.add(cesta_lib);

            // Sin embargo el almacén almacena especificamente LibroPapel
            AlmacenAlmacenaPapel alm_papel = new AlmacenAlmacenaPapel(almacen1, libroPapel1, 50);
            alm_papel.save();
            models.add(alm_papel);

            // Mostrar resultados
            ModelHelper.show(models);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void migration() throws SQLException {
        try {
            DB.deleteDatabase("cristopher_activity_10");
        } catch (SQLException e) {
            // Ignorar el error si no existe la BD
        }

        DB.createDatabase("cristopher_activity_10");

        // Orden de creación asegura que las tablas dependientes
        // se crean después de sus dependencias base
        DB.verify(
                Provincia.class,
                Localidad.class,
                Cliente.class,
                Cesta.class,
                Autor.class,
                Editorial.class,
                Almacen.class,
                Libro.class,
                LibroPapel.class,
                LibroEbook.class,
                AutorEscribeLibro.class,
                CestaContieneLibro.class,
                EditorialPublicaLibro.class,
                AlmacenAlmacenaPapel.class);
    }
}
