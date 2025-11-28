import Utilities.MC;

import java.util.ArrayList;

public class Personaje {

    private String nombre;
    private int atk;
    private int def;
    private Tipo tipo;

    private int maxHp;
    private int vida;

    public Personaje() {
    }

    public Personaje(String nombre, int atk, int def, int vida, Tipo tipo) {
        this.nombre = nombre;
        this.atk = atk;
        this.def = def;
        this.vida = vida;
        this.maxHp = vida;
        this.tipo = tipo;
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

    public Tipo getTipo() {
        return tipo;
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

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", atk=" + atk +
                ", def=" + def +
                ", tipo=" + tipo +
                ", vida=" + vida +
                '}';
    }

    public static String RandName( Tipo tipo )
    {
        if ( tipo == Tipo.CABALLERO )
        {
            String[] nombres = {
                    "Lancelot",
                    "Gawain",
                    "Perceval",
                    "Galahad",
                    "Tristán",
                    "Astolfo",
                    "Fierabras",
                    "Huon",
                    "Rodrigo Díaz de Vivar",
                    "Maria Garcia",
                    "Nicolas",
                    "Siegfried"
            };

            return nombres[MC.random(0, nombres.length-1) ];
        }

        if ( tipo == Tipo.MAGO )
        {
            String[] magos = {
                    "Harry Houdini",
                    "David Copperfield",
                    "David Blaine",
                    "Merlín",
                    "Gandalf",
                    "Albus Dumbledore",
                    "Hermione Granger",
                    "Lord Voldemort",
                    "Morgana Le Fay"
            };

            return  magos[MC.random(0, magos.length-1)];
        }

        return tipo.toString();
    }
}
