package Actividades.Actividad9;

import Utilities.Table;

public class Tren {
    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinista;

    public Tren() {
        this.vagones = new Vagon[0]
        ;
    }

    public Tren(Locomotora locomotora, Vagon[] vagones, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = vagones;
        this.maquinista = maquinista;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    /**
     * Añade un vagon a la clase de manera dinamica
     * @param vagon La clase vagon por agregar
     */
    public void addVagon( Vagon vagon) {
        Vagon[] data = new  Vagon[ this.vagones.length + 1 ];

        for (int i = 0; i < this.vagones.length; i++) {
            data[i] = this.vagones[i];
        }

        data[this.vagones.length] = vagon;
        this.vagones = data;
    }

    public void print()
    {
        Table.instance()
                .addRow()
                .print();
    }
}
