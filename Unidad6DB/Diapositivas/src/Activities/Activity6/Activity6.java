package Activities.Activity6;


import Activities.Activity1.Jugador;
import Utilities.Table;
import com.darkredgm.querymc.Collections.MCList;
import com.darkredgm.querymc.Database.ORM.DB;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * select jugadores.Nombre, estadisticas.temporada,
 * estadisticas.Puntos_por_partido from jugadores,estadisticas where
 * estadisticas.jugador=jugadores.codigo and
 * (temporada,Puntos_por_partido) in (select
 * temporada,max(Puntos_por_partido) from estadisticas group by
 * temporada) order by estadisticas.temporada;
 * Diapositiva 18
 */
public class Activity6 {

    static void main() {

        try {
            NbaDB db = new NbaDB("jugadores,estadisticas");

            ResultSet result = db.executeSelect("select jugadores.Nombre, estadisticas.temporada,estadisticas.Puntos_por_partido from jugadores,estadisticas where" +
                    " estadisticas.jugador=jugadores.codigo and" +
                    " (temporada,Puntos_por_partido) in (select" +
                    " temporada,max(Puntos_por_partido) from estadisticas group by" +
                    " temporada) order by estadisticas.temporada;");

            if (result.next()) {
                Table.instance()
                        .addRow("Nombre", result.getObject(1).toString())
                        .addRow("temporada", result.getObject(2).toString())
                        .addRow("Puntos por partido", result.getObject(3).toString())
                        .print();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
