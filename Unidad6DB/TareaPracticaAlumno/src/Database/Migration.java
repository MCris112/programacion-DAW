package Database;

import Models.*;
import com.darkredgm.querymc.Database.DB;
import com.darkredgm.utilitiesmc.MC;

import java.sql.SQLException;

public class Migration {

    /**
     * Carga la base de datos nueva, junto a las tablas de cada modelo
     * @throws SQLException
     */
    public static void load() throws SQLException {
        try{
            DB.deleteDatabase("cristopher_tarea_mvc");
        }catch (Exception e){

        }

        DB.createDatabase("cristopher_tarea_mvc");

        // Verifica que las tablas de los modelos estén creadas y cargadas
        DB.verify(
                Practica.class,
                Alumno.class,
                AlumnoRealizaPractica.class,

                Profesor.class,
                ProfesorDisenaPractica.class,
                
                ExamenTeorico.class,
                AlumnoHaceExamen.class
        );

        MC.title.outlineY("MIGRATION LOADED!");
        System.out.println("\n".repeat(20 ));
    }
}
