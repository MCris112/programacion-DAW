package Activities.Activity17;

import Utilities.MC;

import java.util.ArrayList;

public class CajaFigura<F extends Figura> {

    ArrayList<F> figuras = new ArrayList<>();

    public void guardar(F figura){
        figuras.add(figura);
    }

    public void mostrarContenido()
    {
        MC.title.outlineY("Contenido de caja");
        for (F figura : figuras)
            System.out.println(figura);
        MC.printLine();
    }

    public void calcularAreaTotal()
    {
        double total = 0;

        for (F figura : figuras)
            total += figura.calcularArea();

        MC.title.outlineY("Area total de caja: " + total);
    }
}
