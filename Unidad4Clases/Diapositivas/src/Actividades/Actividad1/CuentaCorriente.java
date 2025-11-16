package Actividades.Actividad1;


import Utilities.Table;

public class CuentaCorriente {
    Persona persona;
    int numeroCuenta;
    double saldo;

    public CuentaCorriente(){}

    public CuentaCorriente(Persona persona, int numeroCuenta, double saldo){
        this.persona = persona;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimir()
    {
        Table.instance()
                .addRow("CUENTA")
                .addRow("Nombre", this.persona.getNombre() )
                .addRow("DNI", this.persona.getDni() )
                .addRow("Saldo", this.saldo+"")
                .print();
    }
}
