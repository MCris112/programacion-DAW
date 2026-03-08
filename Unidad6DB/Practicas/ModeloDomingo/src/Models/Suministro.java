package Models;

import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

import java.sql.Date;

public class Suministro extends Model {

    @DBForeign(model = Proveedor.class)
    @DbColumn
    private int codProveedor;

    @DBForeign(model = Pieza.class)
    @DbColumn
    private int codPieza;

    @DbColumn
    private int cantidad;

    @DbColumn
    private Date fecha;

    public Suministro() {
    }

    public Suministro(int codProveedor, int codPieza, int cantidad, Date fecha) {
        this.codProveedor = codProveedor;
        this.codPieza = codPieza;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getCodProveedor() { return codProveedor; }
    public int getCodPieza() { return codPieza; }
    public int getCantidad() { return cantidad; }
    public Date getFecha() { return fecha; }
}