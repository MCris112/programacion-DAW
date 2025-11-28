import Utilities.Table;

public class Interface {


    public static String percentBars(int percent)
    {
        String result = "[";

        int filledSegments = Math.min(10, percent / 10);
        int emptySegments = 10 - filledSegments;

        for (int i = 0; i < filledSegments; i++) {
            result += "█";
        }

        for (int i = 0; i < emptySegments; i++) {
            result +="░";
        }

        return result + "]";
    }

    public static void lifeStats( Personaje hero, Personaje villan, int heroHp, int villanHp)
    {
        /*
        =================================================
        HERO: Knight              ENEMY: Orc General
        HP: [||||||||||] 100%     HP: [||||||||||] 100%
        =================================================
        (Sin cambios)               (-25 HP)
        */

        int heroHpPercent = hero.getVida()*hero.getMaxHp()/100;
        int villanHpPercent = villan.getVida()*villan.getMaxHp()/100;

        String heroHpText = "(Sin Cambios) / "+ hero.getMaxHp(), villanHpText = "(Sin Cambios) / "+villan.getMaxHp() ;

        if ( heroHp != hero.getVida() )
        {
            heroHpText = "(-"+(heroHp - hero.getVida())+" HP) / "+ hero.getMaxHp();
        }

        if ( villanHp != villan.getVida() )
        {
            villanHpText = "(-"+(villanHp - villan.getVida())+" HP) / "+ villan.getMaxHp();
        }

        Table.instance()
                .addRow("Heroe: "+hero.getNombre(), "Villano: "+villan.getNombre())
                .addRow("HP: "+Interface.percentBars(heroHpPercent)+" "+(heroHpPercent)+"%", "HP: "+Interface.percentBars(villanHpPercent)+" "+villanHpPercent+"%")
                .addRow(heroHpText, villanHpText)
                .print();
    }


    public static void heroWin(int rounds, int heroRemained)
    {
        System.out.println("******************************************************************");
        System.out.println("******************************************************************");
        System.out.println();
        System.out.println("               \uD83C\uDF1F GRAND VICTORY! \uD83C\uDF1F");
        System.out.println("                  ¡GANÓ EL PODER DEL BIEN!");
        System.out.println("             Todos los Orcos fueron eliminados");
        System.out.println("            (Rondas: "+rounds+" | "+ " Vivos: "+heroRemained+")");
        System.out.println();
        System.out.println("******************************************************************");
        System.out.println("******************************************************************");
    }

    public static void villanWin(int rounds, int villanRemained)
    {
        System.out.println("//////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println("                     ❌ ¡LOS ORCOS GANARON!❌");
        System.out.println("              Fin de la batalla... pero no de la guerra");
        System.out.println("                Todos los Heroes fueron eliminados");
        System.out.println("                 (Rondas: "+rounds+" | "+ " Vivos: "+villanRemained+")");
        System.out.println();
        System.out.println("//////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////");
    }
}
