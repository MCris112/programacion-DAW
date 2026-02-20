package Activities.Activity7;

import Utilities.ModelHelper;
import com.darkredgm.querymc.Database.DB;
import com.darkredgm.querymc.Database.Model;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Realiza los siguientes diagramas E-R en JAVA y
 * haz pruebas que muestren su acceso y funcionamiento.
 */
public class Activity7 {

    static void main() {
        try {
            // Correr por primera vez para que los modelos cargen
            migrations();

            ArrayList<Model> models = new ArrayList<>();

            // Crear y guardar Alumno
            Alumno alumno = new Alumno("12345678A", "A1", "Nicolas", "Asesensio Lopez");
            alumno.save();
            models.add(alumno);


            // Crear y guardar Profesor
            Profesor profesor = new Profesor("87654321B", "Domingo", "Lopez López");
            profesor.save();
            models.add(profesor);

            // Crear y guardar Practica
            Practica practica = new Practica("Examen Morgado", "alta");
            practica.save();
            models.add(practica);

            // Crear y guardar ExamenTeorico (necesita profesorId manual por FK)
            ExamenTeorico examen = new ExamenTeorico("Examen Java", 20, "2026-02-20");
            examen.setProfesorId(profesor.getId());  // Asignar FK manualmente
            examen.save();
            models.add(examen);

            // Relaciones N:N - AlumnoRealizaPractica
            AlumnoRealizaPractica realizaPractica = new AlumnoRealizaPractica();
            realizaPractica.setAlumnoId(alumno.getId());
            realizaPractica.setPracticaId(practica.getId());
            realizaPractica.setFecha("2026-02-20");
            realizaPractica.setNota(8.5);
            realizaPractica.save();
            models.add(realizaPractica);

            // Relaciones N:N - ProfesorDisenaPractica
            ProfesorDisenaPractica disenaPractica = new ProfesorDisenaPractica();
            disenaPractica.setProfesorId(profesor.getId());
            disenaPractica.setPracticaId(practica.getId());
            disenaPractica.setFecha("2026-02-15");
            disenaPractica.save();
            models.add(disenaPractica);

            // Relación AlumnoHaceExamenTeorico
            AlumnoHaceExamenTeorico haceExamen = new AlumnoHaceExamenTeorico();
            haceExamen.setAlumnoId(alumno.getId());
            haceExamen.setExamenTeorico(examen.getId());
            haceExamen.setNota(9);
            haceExamen.save();
            models.add(haceExamen);

            ModelHelper.show(models);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Carga las migraciones de la base de datos en caso sea necesario
     * @throws SQLException
     */
    static void migrations() throws SQLException {
        try{
            DB.deleteDatabase("mcris_er_alumno_examen");
        }catch(SQLException e){

        }

        DB.createDatabase("mcris_er_alumno_examen");

        DB.verify(
                Alumno.class,
                Profesor.class,
                Practica.class,
                ExamenTeorico.class,
                ProfesorDisenaPractica.class,
                AlumnoRealizaPractica.class,
                AlumnoHaceExamenTeorico.class
        );

        // --------------------
        // Antigua version
        // --------------------
//        Schema schema = new Schema(
//                new MCConnection()
//        );
//
//        schema.createIfNotExists("practicas", table-> {
//            table.id();
//            table.varchar("titulo", 100).notNull();
//            table.varchar("dificultad", 100).notNull();
//        });
//
//        schema.createIfNotExists("alumnos", table-> {
//            table.id();
//            table.varchar("nif", 100).notNull();
//            table.varchar("grupo", 100).notNull();
//            table.varchar("nombre", 100).notNull();
//            table.varchar("apellidos", 100).notNull();
//        });
//
//        schema.createIfNotExists("examen_teoricos", table-> {
//            table.id();
//            table.varchar("titulo", 100).notNull();
//            table.intCol("numero_preguntas").notNull();
//            table.date("fecha").notNull();
//        });
//
//        schema.createIfNotExists("profesores", table-> {
//            table.id();
//            table.varchar("nif", 100).notNull();
//            table.varchar("nombre", 100).notNull();
//            table.varchar("apellido", 100).notNull();
//        });
//
//        schema.createIfNotExists("practica_disena_profesor", table-> {
//            table.intCol("practica_id").notNull();
//            table.intCol("profesor_id").notNull();
//
//            table.date("fecha").notNull();
//
//            table.foreignKey("practica_id").references("practicas").on("id");
//            table.foreignKey("prefesor_id").references("profesores").on("id");
//        });
//
//        schema.createIfNotExists("practica_realiza_alumno", table-> {
//
//        });
    }
}
