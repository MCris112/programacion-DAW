package Activities.Activity16;

import Activities.Activity16.Personajes.Caballero;
import Activities.Activity16.Personajes.Mago;
import Activities.Activity16.Personajes.Ogro;
import Utilities.MC;
import Utilities.Table;

import java.util.ArrayList;
import java.util.Scanner;

public class Batalla {

    static Scanner sc = new Scanner(System.in);

    private ArrayList<Personaje> heroes = new ArrayList<>();
    private ArrayList<Personaje> villans = new ArrayList<>();

    private int rounds = 0;


    public void showMenu() {

        boolean takeData = true;

        do {
            Table.instance()
                    .addRow("Menu")
                    .addRow("1", "Añadir personaje")
                    .addRow("2", "Mostrar lista")
                    .addRow("3", "Iniciar batalla")
                    .addRow("4", "Generar personajes automaticamente")
                    .addRow("0", "Salir")
                    .print();

            System.out.println("Seleccione una Opción:");

            // Verificar que no le de enter porque si,
            // ya que al dar enter este tira error
            // entonces que lo detecte como si fuera una opción incorrecta
            int option = -3;
            String input = sc.nextLine();

            if ( !input.isEmpty() )
            {
                option = Integer.parseInt(input);
            }

            //Comprobando la opcion si está disponible o no
            switch ( option) {
                case 0:
                    takeData = false;
                    break;
                case 1: this.anadirPersonaje(); break;
                case 2: this.mostrarLista(); break;
                case 3:
                    if ( this.heroes.isEmpty() ) {
                        MC.title.outlineY("Necesitas Heroes para poder jugar");
                    }else if ( this.villans.isEmpty() ) {
                        MC.title.outlineY("Necesitas villanos para poder jugar");
                    }else{
                        this.rounds = 0;
                        this.iniciarBatalla();
                    }
                    break;
                case 4: this.randomPersonajes(); break;
                default:
                    MC.title.outlineY("Seleccione una opción correcta");
                    break;
            }
        }while (takeData);

        MC.title.outline("MUCHAS GRACIAS");
    }

    public void mostrarLista() {
        Table table = new Table();

        table.addRow("Lista personajes")
                .addRow("Buenos");

        for (Personaje personaje : this.heroes) {
            table.addRow(personaje.toString());
        }

        table.addRow("Malos");

        for (Personaje personaje : this.villans) {
            table.addRow(personaje.toString());
        }

        table.print();
    }

    public void anadirPersonaje()
    {

        Personaje personaje = null;

        System.out.println("¿Cúal es el tipo del personaje?");

        int tipo = -1;
        do {
            Table.instance()
                    .addRow("Tipos")
                    .addRow("1", "Caballero")
                    .addRow("2", "Mago")
                    .addRow("3", "Orco")
                    .print();

            System.out.println("Seleccione una opción:");
            tipo = Integer.parseInt(sc.nextLine());

            switch ( tipo )
            {
                case 1: personaje = new Caballero(); break;
                case 2: personaje = new Mago(); break;
                case 3: personaje = new Ogro(); break;
                default:
                    System.out.println("Opción no válida");
                    tipo = -1;
                    break;
            }

        }while ( tipo == -1 );

        System.out.println("Ingrese su nombre del personaje:");
        personaje.setNombre( sc.nextLine() );



        System.out.println("Ingrese la vida de "+personaje.getNombre()+":");
        personaje.setVida( Integer.parseInt( sc.nextLine() ) );

        System.out.println("Ingrese la defensa de "+personaje.getNombre()+":");
        personaje.setDef( Integer.parseInt( sc.nextLine() ) );

        System.out.println("Ingrese el ataque de "+personaje.getNombre()+":");
        personaje.setAtk( Integer.parseInt( sc.nextLine() ) );

        if ( personaje instanceof  Ogro ) {
            this.villans.add((Ogro) personaje);
        }else {
            this.heroes.add(personaje);
        }
    }

    public void iniciarBatalla() {
        //Elige un personae de cada lista
        //En caso devuelva null en cada uno, significa que no queda en la lista y termino la partida
        Personaje bueno = this.getRandPersonaje(this.heroes);

        if (bueno == null) {
            Interface.villanWin( this.rounds, this.villans.size() );

            System.out.println(this.villans.toString());
            return;
        }

        Personaje malo = this.getRandPersonaje( this.villans );
        if (malo == null) {

            Interface.heroWin( this.rounds, this.heroes.size() );
            System.out.println(this.heroes.toString());
            return;
        }

        //Ejecuta la batalla

        this.rounds++;
        MC.printLine();
        System.out.println("\uD83C\uDF00 RONDA "+this.rounds+"\uD83C\uDF00");
        MC.printLine();

        int heroHp = bueno.getVida(), villanHp = malo.getVida();
        //Take por turnos
        bueno.atacar(malo);

        if (!malo.estaVivo())
        {
            System.out.println("############ \uD83D\uDC80 El enemigo fue eliminado \uD83D\uDC80 ############");
            this.villans.remove(malo);
        }else{
            malo.atacar( bueno );

            if ( !bueno.estaVivo() )
            {
                System.out.println("############ \uD83D\uDC94 Nuestro heroe ha caido \uD83D\uDC94 ############");
                this.heroes.remove(bueno);
            }
        }

        Interface.lifeStats(bueno, malo, heroHp, villanHp);

        System.out.println();
        //System.out.println("Enter o Cualquier tecla para continuar");
        //sc.nextLine();
        this.iniciarBatalla();

        // elimina si perdio
        //si no hay nada en la lista termina
    }

    /**
     *
     * @param lista
     * @return Personaje|null
     */
    public Personaje getRandPersonaje( ArrayList<Personaje> lista )
    {
        if ( lista.isEmpty() ) {
            return null;
        }

        // TODO verificar porque random 0 tira error
        int rand = MC.random(0, lista.size() - 1);

        if ( rand < 0)
            return null;

        return lista.get( rand );
    }

    public void randomPersonajes()
    {
        //Al momento de generar los personajes, como este va a tener una defensa fisica sin perder
        // el daño tiene que ser mayor o igual a la defensa maxima para evitar un loop infinito


        for (int i = 0; i < MC.random(1, 6); i++) {
            Personaje personaje;

            switch ( MC.random(1, 2) ){
                case 1: personaje = new Mago(); break;
                default: personaje = new Caballero(); break;
            }

            personaje.setNombre( RandName(personaje) );
            personaje.setAtk( MC.random(20, 40) );
            personaje.setDef( MC.random(10, 20) );
            personaje.setVida( MC.random(10, 100) );

            this.heroes.add(personaje);
        }

        for (int i = 0; i < MC.random(1, 6); i++) {
            Ogro personaje = new Ogro(
                    "Orco " + MC.random(10, 20),
                    MC.random(20, 40),
                    MC.random(10, 20),
                    MC.random(50, 100)
            );

            this.villans.add(personaje);
        }
    }

    /**
     * Funcion helper para generar nombres automaticamente
     * @param personaje
     * @return
     */
    public static String RandName( Personaje personaje )
    {
        if ( personaje instanceof Caballero )
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

        if ( personaje instanceof Mago )
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

        return personaje.getClass().getSimpleName().toUpperCase();
    }
}
