package DB;


import Activities.Activity1.Jugador;
import Utilities.Table;

import java.util.ArrayList;
import java.util.List;

public class MCList<T> extends ArrayList<T> {

    public void toTable()
    {
        Table table = Table.instance().addRow("Codigo", "Nombre");

//        for ( T jugador : this )
//        {
//            table.addRow(jugador.getCodigo() + "", jugador.getNombre() );
//        }

        table.print();
    }
}
