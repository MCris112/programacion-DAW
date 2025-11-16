package Practica;

import Utilities.Table;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Practica2 {

    static void main() {
        Persona2 p=new Persona2("12345678A","15/08/1985");
        p.setEstatura(1.70);
        p.obtenerEdad();
        System.out.println("Tienes "+p.hijos+" hijos");
        Persona2 p2=new Persona2("12345678B","01/07/1987");
        p2.setEstatura(1.80);
        p.hijos=3;
        System.out.println("Tienes "+p2.hijos+" hijos");

        p.asignaPareja(p2);

        p.mostrarDatos();
    }
}

class Persona2 {
    String nombre;
    LocalDate fechaNacimiento;
    double estatura;
    final String DNI;
    int hijos;
    Persona2 pareja;

    public Persona2(String DNI, String fecha) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fecha, fmt);
        this.DNI = DNI;
        this.hijos = 2;
        this.pareja = null;
        this.estatura = estatura;
    }

    public Persona2(String nombre, LocalDate fechaNacimiento, double estatura, String DNI, int hijos, Persona2 pareja) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estatura = estatura;
        this.DNI = DNI;
        this.hijos = hijos;
        this.pareja = pareja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void obtenerEdad() {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        System.out.println("Tienes " + periodo.getYears() + " años");
    }

    public void asignaPareja(Persona2 p){
        this.pareja=p; //Hará referencia a la ya existente
    }

    public void mostrarDatos()
    {
        Table.instance()
                .addRow(this.nombre)
                .addRow("Nacimiento", this.fechaNacimiento.toString())
                .addRow( "estatura", this.estatura+"")
                .addRow("DNI", this.DNI)
                .addRow( "Hijos", this.hijos+"")
                .addRow("Pareja:")
                .print();
        this.pareja.mostrarDatos();
    }

}