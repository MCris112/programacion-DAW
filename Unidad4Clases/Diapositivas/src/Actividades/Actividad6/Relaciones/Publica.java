package Actividades.Actividad6.Relaciones;

import Actividades.Actividad6.Revista;
import Actividades.Actividad6.Sucursal;

public class Publica {

    private Sucursal sucursal;
    private Revista revista;

    public Publica(Sucursal sucursal, Revista revista) {
        this.sucursal = sucursal;
        this.revista = revista;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        if ( sucursal == null ||  revista == null ) {
            return "Publica (No tiene relaciones";
        }

        return "Publica{" +
                "sucursal=" + sucursal +
                ", revista=" + revista +
                '}';
    }
}
