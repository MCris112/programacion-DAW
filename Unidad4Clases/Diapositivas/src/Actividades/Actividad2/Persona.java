package Actividades.Actividad2;


import Utilities.MC;
import Utilities.Table;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private char genero;

    private Fecha fecha;
    private Ciudad nacimiento;
    private Ciudad residencia;

    public Persona(String cedula, String nombre, String apellido, char genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Ciudad getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Ciudad nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Ciudad getResidencia() {
        return residencia;
    }

    public void setResidencia(Ciudad residencia) {
        this.residencia = residencia;
    }

    public void show()
    {
        Table.instance()
                .addRow("Nombre", this.nombre)
                .addRow("Apellido", this.apellido)
                .addRow("Genero", this.genero+"")
                .addRow("Nacimiento", this.fecha.toString())
                .print();

        if( this.nacimiento != null )
        {
            MC.title.outlineY("Ciudad de nacimiento");
            this.nacimiento.show();
        }

        if( this.residencia != null )
        {
            MC.title.outlineY("Ciudad de recidencia");

            this.residencia.show();
        }
    }
}
