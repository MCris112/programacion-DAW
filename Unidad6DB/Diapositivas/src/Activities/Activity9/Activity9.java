package Activities.Activity9;

import Utilities.ModelHelper;
import com.darkredgm.querymc.Database.DB;
import com.darkredgm.querymc.Database.Model;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * Diapositiva 27
 */
public class Activity9 {

    public static void main(String[] args) {
        try {
            migrations();

            ArrayList<Model> models = new ArrayList<>();

            // 1. Cursos base
            Curso java = new Curso("Java Avanzado", "Programación OO", 40, 300.0);
            java.save();
            models.add(java);

            Curso sql = new Curso("SQL Avanzado", "Bases de Datos", 30, 250.0);
            sql.save();
            models.add(sql);

            Curso web = new Curso("Desarrollo Web", "Fullstack JS", 60, 450.0);
            web.save();
            models.add(web);

            // 2. Prerrequisitos (SQL req. para Web, Java no)
            EsPrerequisito reqSqlWeb = new EsPrerequisito(web.getId(), sql.getId(), true);
            reqSqlWeb.save();
            models.add(reqSqlWeb);

            // 3. Empleados
            EmpleadoCapacitado capacitado = new EmpleadoCapacitado("Ana", "Martín", "600111222", "Calle Mayor 1");
            capacitado.save();
            models.add(capacitado);

            System.out.println(capacitado);
            EmpleadoNoCapacitado noCapacitado = new EmpleadoNoCapacitado("Pedro", "García", "600333444", "Calle Menor 2");
            noCapacitado.save();
            models.add(noCapacitado);

            // 4. Edición de curso (solo con empleado CAPACITADO)
//            Edicion edicionJava = new Edicion("2026-03-01", "2026-03-30", "18:00-20:00", "Sala A", java.getId(), capacitado);
//            edicionJava.save();
//            models.add(edicionJava);

            ModelHelper.show(models);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void migrations() throws SQLException {
        try {
            DB.deleteDatabase("mcris_er_curso_empleado");
        } catch (SQLException e) {
            // Ignorar
        }

        DB.createDatabase("mcris_er_curso_empleado");

        // Base → Relaciones → Herencia
        DB.verify(
                Curso.class,
                Empleado.class,
                Edicion.class,
                EsPrerequisito.class
        );
    }
}
