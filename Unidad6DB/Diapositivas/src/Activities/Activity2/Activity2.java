package Activities.Activity2;

import Activities.Activity1.Jugador;
import Utilities.Table;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;

import java.sql.SQLException;

/**
 * Modifica el jugador 666 para que ponga bien su Procedencia
 */
public class Activity2 {

    static void main() {

        try{
            QueryBuilder.use(Jugador.class).where("codigo", 666).update(builder ->
                    builder.set("Procedencia", "Spain")
            );

            Jugador domingo = QueryBuilder.use(Jugador.class).where("codigo", 666).first();

            Table.instance()
                    .addRow("Codigo", "Nombre", "Procedencia", "Equipo")
                    .addRow( domingo.getCodigo()+"", domingo.getNombre(), domingo.getProcedencia(), domingo.getNombreEquipo() )
                    .print();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
