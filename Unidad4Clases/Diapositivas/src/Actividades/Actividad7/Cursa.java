package Actividades.Actividad7;

public class Cursa {
    private Alumno alumno;
    private Modulo modulo;

    public Cursa() {
    }

    public Cursa(Alumno alumno, Modulo modulo) {
        this.alumno = alumno;
        this.modulo = modulo;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
