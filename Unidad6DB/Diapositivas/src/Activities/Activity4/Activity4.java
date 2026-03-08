package Activities.Activity4;


import Utilities.MC;
import Utilities.ModelHelper;
import Utilities.Table;
import com.darkredgm.querymc.Collections.MCList;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;

import java.sql.SQLException;

/**
 * select distinct equipo_local from partidos where puntos_local > 100
 * and puntos_local > puntos_visitante and temporada='02/03'
 *
 * Diapositiva 18
 */
public class Activity4 {

    static void main() {

        try{
            MCList<Partido> partidos = QueryBuilder.use(Partido.class).select("equipo_local")
                    .where("puntos_local", ">", 100)
                    .where("puntos_local", ">", "puntos_visitante")
                    .where("temporada", "02/03")
                    .distinct()
                    .get();

            Table table = Table.instance().addRow("Equipos Locales");

            for ( Partido partido : partidos ) {
                table.addRow( partido.getEquipoLocal() );
            }

            table.print();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
