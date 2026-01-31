package Env;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Env {

    public Map<String,String> raw = new HashMap<String,String>();

    static String ENV_PATH = ".env";

    public EnvDatabase database;

    public Env() throws FileNotFoundException {
        this.load();
    }

    public void load() throws FileNotFoundException {

        Scanner sc = new Scanner( new FileReader(ENV_PATH) );

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            // OMITIR COMENTARIOS
            if ( line.startsWith("#") ) {
                return;
            }

            this.raw.put(line.split("=")[0], line.split("=")[1]);
        }

        this.database = new EnvDatabase(
                this.raw.get("DB_DATABASE"),
                this.raw.get("DB_HOST"),
                Integer.parseInt(this.raw.get("DB_PORT")),
                this.raw.get("DB_USERNAME"),
                this.raw.get("DB_PASSWORD")
        );
    }

}
