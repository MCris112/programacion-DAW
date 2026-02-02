package Activities.Activity16;

import Utilities.MC;

public abstract class Personaje {

    private String nombre;
    private int atk;
    private int def;

    private int maxHp;
    private int vida;

    public Personaje() {
    }

    public Personaje(String nombre, int atk, int def, int vida) {
        this.nombre = nombre;
        this.atk = atk;
        this.def = def;
        this.vida = vida;
        this.maxHp = vida;
    }

    public void atacar(Personaje personaje )
    {
        System.out.printf( "> %s >> ⚔ >> %s \n", this.nombre, personaje.getNombre() );
        System.out.printf( "├── ⚡ ATAQUE BASE: %d \n", this.atk );
        System.out.printf( "├── \uD83D\uDEE1️ [%s] se defiende: %d \n", personaje.getNombre(), this.atk );
        System.out.println();
        System.out.println(
                "\uD83D\uDD25 Daño recibido: "+
                personaje.recibirDano( this.atk )
        );

        System.out.println();
        System.out.println();

    }

    /**
     * Recibir Daño
     * @param dano cuanto daño ha recibido
     * @return int daño real recibido por el ataque
     */
    public int recibirDano(int dano )
    {
        dano -= this.def;

        if ( dano <= 0 )
        {
            return 0; //No recibio daño, todoOk
        }

        this.vida -= dano;

        return dano;
    }

    public boolean estaVivo()
    {
        return this.vida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getVida() {
        return vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setVida(int vida) {
        this.vida = vida;
        this.maxHp = vida;
    }

    public int getMaxHp() {
        return maxHp;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "nombre='" + nombre + '\'' +
                ", atk=" + atk +
                ", def=" + def +
                ", vida=" + vida +
                '}';
    }


}
