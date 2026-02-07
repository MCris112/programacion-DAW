package Activities.Activity1;


import Utilities.Table;
import com.darkredgm.querymc.Collections.MCList;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;

import java.sql.SQLException;

/**
 * Muestra los jugadores españoles que son de los Lakers
 */
public class Activity1 {

    static void main() {

        try{
            MCList<Jugador> jugadores = QueryBuilder.use(Jugador.class)
                    .where("Nombre_equipo", "Lakers")
                    .where("Procedencia", "Spain")
                    .get();

            Table table = Table.instance().addRow("Codigo", "Nombre", "Equipo");

            for ( Jugador jugador : jugadores )
            {
                table.addRow(jugador.getCodigo() + "", jugador.getNombre(), jugador.getNombreEquipo() );
            }

            table.print();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        try
//        {
////            List<Jugador> jugadores = QueryBuilder.db("jugadores", new NbaName() )
////                .where("Nombre_equipo", "Lakers")
////                .where("Procedencia", "Spain")
////                .limit(3).get(Jugador.class);
////
////            Table table = Table.instance().addRow("Codigo", "Nombre");
////
////            for ( Jugador jugador : jugadores )
////            {
////                table.addRow(jugador.getCodigo() + "", jugador.getNombre() );
////            }
////
////            table.print();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    }

}
