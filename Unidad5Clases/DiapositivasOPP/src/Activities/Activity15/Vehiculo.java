package Activities.Activity15;

import Utilities.Table;

public abstract class Vehiculo {

    protected String matricula;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract int velocidadMaxima();

    public void mostrarInfo() {

        Table.instance().addRow( getClass().getSimpleName() )
                .addRow("Matricula", matricula)
                .addRow("Velocidad máxima", velocidadMaxima()+" km/h")
                .print();

    }
}
