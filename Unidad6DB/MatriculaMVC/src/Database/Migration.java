package Database;

import Models.*;
import com.darkredgm.querymc.Database.DB;

import java.sql.SQLException;

public class Migration {

    static void main() throws SQLException {
        DB.createDatabaseIfNotExists("cristopher_matriculas");

        DB.verify( Alumno.class );
        DB.verify( Asignatura.class );
        DB.verify( CursoEscolar.class );
        DB.verify( Profesor.class );
        DB.verify( Matricula.class );
    }
}
