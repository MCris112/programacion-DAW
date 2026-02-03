package Env;

import Utilities.Table;

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

    public Env() {
        try{
            this.load();
        }catch(FileNotFoundException e){
            System.out.println("\u001B[31mNo se encontró el archivo .env\u001B[0m");
        }
    }

    public void load() throws FileNotFoundException {

        Scanner sc = new Scanner( new FileReader(ENV_PATH) );

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            // OMITIR COMENTARIOS
            if ( line.startsWith("#") || line.isEmpty() )
                continue;

            String[] data = line.split("=");

            // Para poder manejar valores nulos
            String value = "";
            if (data.length > 1){
                value =  data[1];
            }

            this.raw.put(data[0], value );
        }

        this.database = new EnvDatabase(
                this.raw.get("DB_DATABASE"),
                this.raw.get("DB_HOST"),
                Integer.parseInt(this.raw.get("DB_PORT")),
                this.raw.get("DB_USERNAME"),
                this.raw.get("DB_PASSWORD")
        );
    }

    public void print()
    {
        Table.instance()
                .addRow("PATH: ", new File(ENV_PATH).getAbsolutePath())
                .addRow("DB_DATABASE: ", this.raw.get("DB_DATABASE"))
                .addRow("DB_HOST: ", this.raw.get("DB_HOST"))
                .addRow("DB_PORT: ", this.raw.get("DB_PORT"))
                .addRow("DB_USERNAME: ", this.raw.get("DB_USERNAME"))
                .addRow("DB_PASSWORD: ", this.raw.get("DB_PASSWORD"))
                .print();
    }

}
