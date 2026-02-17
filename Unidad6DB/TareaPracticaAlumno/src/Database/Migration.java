package Database;

import Models.*;
import com.darkredgm.querymc.Database.DB;

import java.sql.SQLException;

public class Migration {

    public static void load() throws SQLException {
        try{
            DB.deleteDatabase("cristopher_tarea_mvc");
        }catch (Exception e){

        }

        DB.createDatabase("cristopher_tarea_mvc");

        DB.verify(
                Practica.class,
                Alumno.class,
                AlumnoRealizaPractica.class,

                Profesor.class,
                ProfesorDisenaPractica.class,
                
                ExamenTeorico.class,
                AlumnoHaceExamen.class
        );
    }
}
