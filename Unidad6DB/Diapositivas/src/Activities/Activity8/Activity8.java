package Activities.Activity8;

import Utilities.ModelHelper;
import com.darkredgm.querymc.Database.DB;
import com.darkredgm.querymc.Database.Model;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Realiza los siguientes diagramas E-R en JAVA y
 * haz pruebas que muestren su acceso y funcionamiento.
 */
public class Activity8 {

    static void main() {

        try {
            migrations();

            ArrayList<Model> models = new ArrayList<>();

            // Crear CursoEscolar (2026-2027)
            CursoEscolar curso = new CursoEscolar(2026, 2027);
            curso.save();
            models.add(curso);

            // Crear Profesor
            Profesor profesor = new Profesor("87654321B", "Domingo", "López García");
            profesor.save();
            models.add(profesor);

            // Crear Asignatura (asignada a profesor)
            Asignatura asignatura = new Asignatura("Programación DAW", 120, profesor.getId());
            asignatura.save();
            models.add(asignatura);

            // Crear Alumno
            Alumno alumno = new Alumno("Nicolás", "Asensio López", "2000-05-15", "600123456");
            alumno.save();
            models.add(alumno);

            // Matrícula N:N:N (alumno + curso + asignatura)
            Matriculas matricula = new Matriculas(alumno.getNumeroMatricula(), curso.getId(), asignatura.getCodigo());
            matricula.save();
            models.add(matricula);

            // Visualizar todos los modelos
            ModelHelper.show(models);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Carga las migraciones de la base de datos en caso sea necesario
     * @throws SQLException
     */
    static void migrations() throws SQLException {
        try {
            DB.deleteDatabase("mcris_er_alumno_matricula");
        } catch (SQLException e) {

        }

        DB.createDatabase("mcris_er_alumno_matricula");

        DB.verify(
                Alumno.class,
                Profesor.class,
                Asignatura.class,
                CursoEscolar.class,
                Matriculas.class
        );
    }
}
