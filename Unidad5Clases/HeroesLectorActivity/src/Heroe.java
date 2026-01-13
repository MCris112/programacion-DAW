/**
 * {
 *     "superhero":"Batman",
 *     "publisher":"DC Comics",
 *     "alter_ego":"Bruce Wayne",
 *     "first_appearance":"Detective Comics #27",
 *     "characters":"Bruce Wayne"
 *   },
 */
public class Heroe {

    String superhero, publisher, alterEgo, firstAppearance, character;

    public Heroe(String superhero, String publisher, String alterEgo, String firstAppearance, String character) {
        this.superhero = superhero;
        this.publisher = publisher;
        this.alterEgo = alterEgo;
        this.firstAppearance = firstAppearance;
        this.character = character;
    }

    public static void fromJson( String[] data)
    {

    }
    public String getSuperhero() {
        return superhero;
    }

    public void setSuperhero(String superhero) {
        this.superhero = superhero;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAlterEgo() {
        return alterEgo;
    }

    public void setAlterEgo(String alterEgo) {
        this.alterEgo = alterEgo;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
