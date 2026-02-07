package Activities.Activity3;

import Activities.Activity1.Jugador;
import Utilities.MC;
import Utilities.Table;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;

import java.sql.SQLException;

/**
 * Inserta un registro en jugadores y bórralo
 */
public class Activity3 {

    static void main() {

        Jugador nicolas = new Jugador();
        
        try{
            // Rellenar la información del nuevo jugador
            nicolas.fillAttributes( builder ->
                    builder.set("codigo", 999)
                            .set("nombre", "Nicolas")
                            .set("procedencia", "Spain")
                            .set("nombreEquipo", "Lakers")
            );

            nicolas.save(); // Guardar en la base de datos
            MC.title.outlineY("Se ha agregado correctamente a "+nicolas.getNombre() );

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Mostrar en consola
        Table.instance().addRow("Codigo", "Nombre", "Procedencia", "Nombre_equipo")
                .addRow( nicolas.getCodigo()+"", nicolas.getNombre(), nicolas.getProcedencia(), nicolas.getNombreEquipo() )
                .print();

        try{
            // Eliminarlo de la base de datos
            QueryBuilder.use(Jugador.class
            ).where("codigo", nicolas.getCodigo()).delete();

            MC.title.outlineY("Se ha eliminado correctamente a "+nicolas.getNombre() );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
