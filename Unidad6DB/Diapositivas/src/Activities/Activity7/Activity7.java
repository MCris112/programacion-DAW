package Activities.Activity7;

import com.darkredgm.querymc.Conecction.MCConnection;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;
import com.darkredgm.querymc.Database.Schema.Schema;

import java.sql.SQLException;

/**
 * Realiza los siguientes diagramas E-R en JAVA y
 * haz pruebas que muestren su acceso y funcionamiento.
 */

public class Activity7 {

    static void main() {
        try{
            migrations();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Practica practica = new Practica( "Examen morgado", "alta" );

        try{
            practica.save();

            practica = QueryBuilder.use(Practica.class).last();

            System.out.println( practica );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    static void migrations() throws SQLException {

        Schema schema = new Schema(
                new MCConnection()
        );

        schema.createIfNotExists("practicas", table-> {
            table.id();
            table.varchar("titulo", 100).notNull();
            table.varchar("dificultad", 100).notNull();
        });

        schema.createIfNotExists("alumnos", table-> {
            table.id();
            table.varchar("nif", 100).notNull();
            table.varchar("grupo", 100).notNull();
            table.varchar("nombre", 100).notNull();
            table.varchar("apellidos", 100).notNull();
        });

        schema.createIfNotExists("examen_teoricos", table-> {
            table.id();
            table.varchar("titulo", 100).notNull();
            table.intCol("numero_preguntas").notNull();
            table.date("fecha").notNull();
        });

        schema.createIfNotExists("profesores", table-> {
            table.id();
            table.varchar("nif", 100).notNull();
            table.varchar("nombre", 100).notNull();
            table.varchar("apellido", 100).notNull();
        });

        schema.createIfNotExists("practica_disena_profesor", table-> {
            table.intCol("practica_id").notNull();
            table.intCol("profesor_id").notNull();

            table.date("fecha").notNull();

            table.foreignKey("practica_id").references("practicas").on("id");
            table.foreignKey("prefesor_id").references("profesores").on("id");
        });

        schema.createIfNotExists("practica_realiza_alumno", table-> {

        });
    }
}
