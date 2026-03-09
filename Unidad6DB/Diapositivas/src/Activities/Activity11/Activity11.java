package Activities.Activity11;

import Utilities.ModelHelper;
import com.darkredgm.querymc.Database.DB;
import com.darkredgm.querymc.Database.Model;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Realiza los siguientes diagramas E-R en JAVA y
 * haz pruebas que muestren su acceso y funcionamiento
 *
 * Diapositiva 29
 */
public class Activity11 {

    public static void main(String[] args) {
        try {
            migration();

            ArrayList<Model> models = new ArrayList<>();

            // 1. Empleados
            Empleado emp1 = new Empleado("12345678A", "Juan", "Pérez", "600123456");
            emp1.save();
            models.add(emp1);

            // 2. Sucursales
            Sucursal suc1 = new Sucursal("Madrid", "Madrid", "Calle Alcalá 123", "910000000");
            suc1.save();
            models.add(suc1);

            // 3. Revistas
            Revista rev1 = new Revista("Tech Today", "Tecnología", "Mensual");
            rev1.save();
            models.add(rev1);

            // 4. Periodistas
            Periodista per1 = new Periodista("Ana", "Gómez", "600987654", "Ciencia");
            per1.save();
            models.add(per1);

            // 5. Secciones
            Seccion sec1 = new Seccion(rev1, "Novedades AI", "10 páginas");
            sec1.save();
            models.add(sec1);

            // 6. Ejemplares
            Ejemplar ejem1 = new Ejemplar(rev1, "2026-04-01", 50, 10000);
            ejem1.save();
            models.add(ejem1);

            // 7. Relaciones N:M
            PeriodistaEscribeRevista per_rev = new PeriodistaEscribeRevista(rev1, per1);
            per_rev.save();

            SucursalPublicaRevista suc_rev = new SucursalPublicaRevista(suc1, rev1);
            suc_rev.save();

            // Mostrar modelos guardados
            ModelHelper.show(models);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void migration() throws SQLException {
        try {

            DB.deleteDatabase("cristopher_activity_11");
        } catch (SQLException e) {
        }

        DB.createDatabase("cristopher_activity_11");

        DB.verify(
                Empleado.class,
                Sucursal.class,
                Revista.class,
                Periodista.class,
                Seccion.class,
                Ejemplar.class,
                PeriodistaEscribeRevista.class,
                SucursalPublicaRevista.class);
    }
}
