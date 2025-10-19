package Activities;

/**
 * Realiza un programa que muestra tu horario y qué clases tienes hoy
 */
public class Activity2 {

    static void main() {
        String[][] horario = {
                { "8:00", "IPEI", "LMSGI", "GBD", "PROG", "GBD"},
                { "9:00", "SIST.INF", "SIST.INF", "GBD", "ENT.DSA", "Digitalización"},
                { "10:00", "GBD", "SIST.INF", "SIST.INF", "ENT.DESA", "LMSGI"},
                { "11:00", "RECREO", "RECREO", "RECREO", "RECREO", "RECREO"},
                { "11:30", "GBD", "PROG", "SIST.INF", "IPE I", "LMSGI"},
                { "12:30", "PROG", "PROG", "PROG", "GBD", "IPE I"},
                { "1:30", "PROG", "ENT.DESA", "PROG", "Sostenibilidad", "PROG"}
        };
    }

    static String getCourseNameById(int num)
    {
        switch (num)
        {
            case 1:
                return "IPEI";
            case 2:
                return "LMSGI";
            case 3:
                return "SIST.INF";
            case 4:
                return "GBD";
            case 5:
                return "Programación";
            case 6:
                return "ENT.DESA";
            case 7:
                return "Sostenibilidad";
            case 8:
                return "Digitalización";
            case 9:
                return "RECREO";
            default:
                return "UNKNOW";
        }
    }
}
