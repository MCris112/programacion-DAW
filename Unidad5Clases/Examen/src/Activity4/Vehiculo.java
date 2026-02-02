package Activity4;

public abstract class Vehiculo implements Parkeable{

    protected String matricula;

    static int plazasOcupadas = 0;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void entrar() {
        plazasOcupadas++;
        System.out.println("El vehículo con matrícula "+matricula+" ha entrado al parking");
    }

    @Override
    public void salir() {
        plazasOcupadas--;
        System.out.println("El vehículo con matrícula "+matricula+" ha salido del parking");
    }

    public int getPlazasLibres()
    {
        return plazas-plazasOcupadas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
