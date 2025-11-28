package Actividades.Actividad7;

public class Actividad7 {

    static void main() {
        Profesor domingo = new Profesor("3434343", "34343535", "Domingo", "Calle granada");
        Profesor laura = new Profesor("343657343", "999943535", "Laura", "Murcia v234");

        Modulo modProg = new Modulo(1, "Programacion");
        Modulo modEntDesa = new Modulo(2, "Entorno desarrollo");

        modProg.setProfesor(domingo);
        modEntDesa.setProfesor(laura);
    }
}
