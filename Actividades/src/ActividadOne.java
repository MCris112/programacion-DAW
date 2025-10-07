public class ActividadOne {

    public void main(String[] args) {
        /*
            Realiza un programa que genera 2 números y nos diga el cociente, la
            media, la potencia y la raíz cuadrada. Usa tipos adecuados
         */
        int aleatorio1 = this.randomize(1,15);
        int aleatorio2 = this.randomize(1, 15);

        int cociente = aleatorio1 / aleatorio2;

        double media = (aleatorio1 + aleatorio2) / 2.0;
        double potencia = Math.pow(aleatorio1, aleatorio2);

        double raiz1 = Math.sqrt( aleatorio1 );
        double raiz2 = Math.sqrt( aleatorio2 );

        System.out.println("|--------------------------------|");
        System.out.printf("| Aleatorio 1: | %-15s | \n",aleatorio1);
        System.out.printf("| Aleatorio 2: | %-15s | \n",aleatorio2);
        System.out.println("|--------------------------------|");
        System.out.printf("| Cociente:    | %-15s | \n",cociente);
        System.out.printf("| Media:       | %-15s | \n", media);
        System.out.printf("| Potencia:    | %-15s | \n", potencia);
        System.out.println("| -------------------------------|");
        System.out.printf("| Raiz 1: | %-20s | \n", raiz1);
        System.out.printf("| Raiz 2: | %-20s | \n", raiz2);
        System.out.println("|--------------------------------|");
    }

    public int randomize( int min, int max)
    {
        return (int) (Math.random()*(max-min+1))+min;
    }
}
