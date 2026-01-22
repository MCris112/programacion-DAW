package Activities.Activity16;

public abstract class Character {

    protected String nombre;
    protected double vida, dano;

    public Character(String nombre, double vida, double dano) {
        this.nombre = nombre;
        this.vida = vida;
        this.dano = dano;
    }

    public boolean estaVida() {
        return vida > 0;
    }

    public void recibirDano( double dano )
    {
        this.vida -= dano;
    }

    public void atacar( Character enemigo )
    {
        enemigo.recibirDano( this.dano );
    }
}
