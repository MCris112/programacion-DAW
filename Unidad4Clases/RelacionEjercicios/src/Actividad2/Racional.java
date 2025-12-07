package Actividad2;

import Utilities.MC;
import Utilities.Table;

public class Racional {

    private int numerador;

    // Distinto a 0
    private int denominador;

    public Racional(){}

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;

        if ( denominador == 0 ){
            this.denominador = 1;
        }else
            this.denominador = denominador;
    }

    public void asignaNumerador(int x)
    {
        this.numerador = x;
    }

    public void asignaDenominador(int y)
    {
        this.denominador = y;
    }

    public Racional suma(Racional otro) {
        MC.title.outlineY(
                "SUMANDO",
                this.numerador + "/" + this.denominador + " + " + otro.numerador + "/" + otro.denominador
        );
        System.out.println();

        return new Racional(
                this.numerador * otro.denominador + otro.numerador * this.denominador,
                this.denominador * otro.denominador
        );
    }

    public Racional resta(Racional otro) {

        MC.title.outlineY(
                "RESTANDO",
                this.numerador + "/" + this.denominador + " - " + otro.numerador + "/" + otro.denominador
        );
        System.out.println();
        return new Racional(
                this.numerador * otro.denominador - otro.numerador * this.denominador,
                this.denominador * otro.denominador
        );
    }

    public Racional producto(Racional otro) {
        MC.title.outlineY(
                "MULTIPLICANDO",
                this.numerador + "/" + this.denominador + " * " + otro.numerador + "/" + otro.denominador
        );
        System.out.println();

        return new Racional(this.numerador * otro.numerador, this.denominador * otro.denominador);
    }

    public Racional division(Racional otro) {

        MC.title.outlineY(
                "DIVIDIENDO",
                this.numerador + "/" + this.denominador + " / " + otro.numerador + "/" + otro.denominador
        );
        System.out.println();

        return new Racional(this.numerador * otro.denominador, this.denominador * otro.numerador);
    }

    public boolean esIgual(Racional otro) {
        return this.numerador * otro.denominador == otro.numerador * this.denominador;
    }

    public void imprimirRacional()
    {
        Table.instance()
                .addRow("RACIONAL")
                .addRow("Numerador", String.valueOf(numerador))
                .addRow("Denominador", String.valueOf(denominador))
                .print();
    }
}
