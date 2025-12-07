package Actividad4.Relaciones;

import Actividad4.Extra;
import Actividad4.Version;
import Utilities.Table;

public class VersionTieneExtra {

    private Version version;
    private Extra extra;

    private double precio;

    public VersionTieneExtra(Version version, Extra extra, double precio) {
        this.version = version;
        this.extra = extra;
        this.precio = precio;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void show() {
        Table.instance()
                .addRow("VERSIÓN TIENE EXTRA")
                .addRow("Versión", version.getNombre())
                .addRow("Potencia", String.valueOf(version.getPotencia()))
                .addRow("Extra", extra.getNombre())
                .addRow("Descripción", extra.getDescripcion())
                .addRow("Precio Extra", String.valueOf(precio))
                .print();
    }
}
