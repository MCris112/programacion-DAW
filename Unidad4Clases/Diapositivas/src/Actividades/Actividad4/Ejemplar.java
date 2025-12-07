package Actividades.Actividad4;

public class Ejemplar {

    private String fecha;
    private int numPagina, numEjemplares;
    private Revista revista = null;

    public Ejemplar() {
    }

    public Ejemplar(String fecha, int numPagina, int numEjemplares) {
        this.fecha = fecha;
        this.numPagina = numPagina;
        this.numEjemplares = numEjemplares;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        String add = "";

        if ( this.revista != null )
            add = this.revista.toString();

        return "Ejemplar{" +
                "fecha='" + fecha + '\'' +
                ", numPagina=" + numPagina +
                ", numEjemplares=" + numEjemplares +
                "} " + add;
    }
}
