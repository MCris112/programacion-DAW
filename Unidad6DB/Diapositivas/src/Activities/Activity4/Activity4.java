package Activities.Activity4;

import Activities.Activity1.Jugador;
import DB.MCList;
import DB.QueryBuilder;
import Databases.NbaName;
import Utilities.Table;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * select distinct equipo_local from partidos where puntos_local > 100
 * and puntos_local > puntos_visitante and temporada='02/03'
 */
public class Activity4 {

    static void main() {

        MCList<Partido> partidos = null;

//        QueryBuilder query = QueryBuilder.db("partidos", new NbaName())
//                .where("puntos_local", ">", "100")
//                .where("temporada", "02/03")
//                .distinct();
//
//        System.out.println( query.toSql() );
//
//         try{
//             partidos = query.get(Partido.class);
//
//         } catch (Exception e) {
//             throw new RuntimeException(e);
//         }
//
//         if (partidos.isEmpty()) {
//             return;
//         }
//
//        Table table = Table.instance().addRow( "Equipo Local");
//
//        for ( Partido jugador : partidos )
//        {
//            table.addRow( jugador.getEquipoLocal() );
//        }
//
//        table.print();
    }
}
