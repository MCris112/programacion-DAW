package Activity4;

public interface Parkeable {

    int plazas = 50;
    
    void entrar();

    void salir();

    double calcularPrecio( int horas );
}
