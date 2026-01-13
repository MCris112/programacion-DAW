package Activities.Activity11;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {

    ArrayList<T> valores = new ArrayList<>();

    public T buscar(T item)
    {
        int index = this.valores.indexOf(item);

        if ( index == -1)
            return null;

        return this.valores.get( index );
    }

    public void insertar( T val )
    {
        this.valores.add( val );
    }

    public T devolver()
    {
        return this.valores.getLast();
    }

    public boolean borrar( T item )
    {
        T found = this.buscar(item);

        if ( found == null )
            return false;

        this.valores.remove(found);

        return true;
    }

    @Override
    public String toString() {
        String endText = "";

        int intent = 1;

        List<T> reversed = valores.reversed();

        for ( T el: reversed )
        {
            endText+="|";

            for (int i = 0; i < intent; i++) {
                endText+=" ";
            }
            endText += el;

            for (int i = 0; i < intent; i++) {
                endText+=" ";
            }

            endText += "|\n";
            intent++;
        }

        return endText;
    }
}
