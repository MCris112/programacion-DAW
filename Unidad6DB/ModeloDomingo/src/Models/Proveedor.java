package Models;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Proveedor extends Model {

    @DBColPrimary
    @DbColumn
    private int codigo;

    @Override
    public String getKeyName() {
        return "codigo";
    }

    @DbColumn
    private String direccion;

    @DbColumn
    private String ciudad;

    @DbColumn
    private String provincia;

    public Proveedor() {}

    public Proveedor(int codigo, String direccion, String ciudad, String provincia) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public int getCodigo() { return codigo; }
    public String getDireccion() { return direccion; }
    public String getCiudad() { return ciudad; }
    public String getProvincia() { return provincia; }
}