package Practica;

import Utilities.Table;

/**
 * Prácticas:
 * 1) Ejecuta el código a ver que obtienes
 * 2) Agrega una constante como DNI a ver si
 * compila
 * 3) Agrega otros dos métodos. Uno para asignar
 * la nueva edad y otro para obtenerla.
 * 4) Crear el constructor apropiado para crear los
 * siguientes objetos
 * 5) Crear la función imprimir para sacar la
 * información de cada objeto
 */
public class Practica1 {
    static void main() {
        Persona persona = new Persona();

        persona.setNombre("Juanito");
        persona.saludar();

        persona.setEdad((byte) 20);
        persona.setEstatura(1.3);

        // 5) Crear la función imprimir para sacar la información de cada objeto
        persona.imprirDatos();

        // 4) Crear el constructor apropiado para crear los siguientes objetos
        Persona aurora =  new Persona("Aurora", (byte) 22, 1.68);
        aurora.imprirDatos();
    }
}

class Persona {

    String nombre; //Atributos por defecto public
    byte edad;

    double estatura;

    public Persona(){ //Constructor
    }

    public Persona(String nombre, byte edad, double estatura){
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
    }

    public void saludar(){ //Método
        System.out.println("Hola a todos, soy "+nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public byte getEdad() {
        return edad;
    }

    /**
     * 5) Crear la función imprimir para sacar la información de cada objeto
     */
    public void imprirDatos()
    {
        System.out.println();

        Table.instance()
                .addRow(this.nombre)
                .addRow("Edad", this.edad+"" )
                .addRow("Estatura", this.estatura+"" )
                .print();
    }
}