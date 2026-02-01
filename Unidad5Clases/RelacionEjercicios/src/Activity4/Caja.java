package Activity4;

import Utilities.Table;

import java.util.ArrayList;

public class Caja <T> {

    ArrayList<T> lista = new ArrayList<>();

    public Caja() {
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void add(T obj) {
        lista.add(obj);
    }

    public void remove(T obj) {
        lista.remove(obj);
    }

    public void removeAt( int pos )
    {
        lista.remove(pos);
    }

    public T get(int pos) {
        return lista.get(pos);
    }

    public int size() {
        return lista.size();
    }

    public void clear() {
        lista.clear();
    }

    public int positionOf( T obj )
    {
        return lista.indexOf(obj);
    }


    public void print()
    {
        Table table = Table.instance().addRow("Lista");

        for ( T nombre: this.lista )
        {
            table.addRow( nombre.toString() );
        }

        table.print();
    }
}
