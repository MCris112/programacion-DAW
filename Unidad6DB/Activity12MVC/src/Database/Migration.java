package Database;

import Models.*;
import com.darkredgm.querymc.Database.DB;

import java.sql.SQLException;

public class Migration {

    static void main() throws SQLException {
        DB.createDatabaseIfNotExists("cristopher_activity_12");

        DB.verify(Alumno.class, Asignatura.class, CursoEscolar.class, Profesor.class, Matricula.class);
    }
}
