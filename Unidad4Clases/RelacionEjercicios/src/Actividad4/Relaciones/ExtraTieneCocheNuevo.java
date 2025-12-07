package Actividad4.Relaciones;

import Actividad4.CocheNuevo;
import Actividad4.Extra;
import Utilities.Table;

public class ExtraTieneCocheNuevo {

    private Extra extra;
    private CocheNuevo cocheNuevo;

    public ExtraTieneCocheNuevo(Extra extra, CocheNuevo cocheNuevo) {
        this.extra = extra;
        this.cocheNuevo = cocheNuevo;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public CocheNuevo getCocheNuevo() {
        return cocheNuevo;
    }

    public void setCocheNuevo(CocheNuevo cocheNuevo) {
        this.cocheNuevo = cocheNuevo;
    }

    public void show() {
        Table.instance()
                .addRow("EXTRA TIENE COCHE NUEVO")
                .addRow("Coche", cocheNuevo != null ? cocheNuevo.getMatricula() : "Sin coche")
                .addRow("Extra", extra != null ? extra.getNombre() : "Sin extra")
                .addRow("Descripción", extra != null ? extra.getDescripcion() : "N/A")
                .print();
    }
}
