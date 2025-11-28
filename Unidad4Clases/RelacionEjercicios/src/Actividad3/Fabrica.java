package Actividad3;

public class Fabrica {

    private String cuit, nombre, pais, gerente;
    private int cantEmp;

    public Fabrica() {
    }

    public Fabrica(String cuit, String nombre, String pais, String gerente, int cantEmp) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.pais = pais;
        this.gerente = gerente;
        this.cantEmp = cantEmp;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public int getCantEmp() {
        return cantEmp;
    }

    public void setCantEmp(int cantEmp) {
        this.cantEmp = cantEmp;
    }
}
