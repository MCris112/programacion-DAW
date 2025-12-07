package Actividades.Actividad5;

public class Alumno {
    private int expediente;

    private String nombre, apellido, fechaNacimiento;

    private Alumno delegado = null;

    public Alumno() {
    }

    public Alumno(int expediente, String nombre, String apellido, String fechaNacimiento) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Alumno getDelegado() {
        return delegado;
    }

    public void setDelegado(Alumno delegado) {
        this.delegado = delegado;
    }

    @Override
    public String toString() {
        String texto = "Alumno{" +
                "expediente=" + expediente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';

        if ( this.delegado == null )
            return texto;

        return texto+" Delegado: "+delegado.getNombre()+" "+delegado.getApellido();
    }
}
