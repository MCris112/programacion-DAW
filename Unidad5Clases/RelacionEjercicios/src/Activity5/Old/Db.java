package Activity5.Old;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Db {

    static String path = "src/Activity5/Old/db.txt";

    Map<String, User> users = new HashMap<>();

    public Db() throws FileNotFoundException {
        Scanner sc = new Scanner( new File(path) );

        while(sc.hasNextLine()) {
            String line = sc.nextLine();

            String[] row = line.split("-");

            User user = new User(row[0], row[1], Integer.parseInt(row[2]) );

            this.users.put( user.getName(), user );
        }
    }

    public boolean attempt(String username, String password)
    {
        User user = users.get(username);

        if(user == null)
            throw new UserNotFound();

        return user.getPassword().equals(password);
    }

    public void consumeTry( String username ) throws IOException {
        User user = users.get(username);

        if(user == null)
            throw new UserNotFound();

        user.setTries( user.getTries()+1 );

        this.save();
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public void save() throws IOException {
        BufferedWriter writer = new BufferedWriter( new FileWriter(path) );

        for (String username : users.keySet()) {
            User user = users.get(username);
            writer.write(username + "-" +  user.getPassword() + "-" + user.getTries() + "\n");
        }

        writer.flush();
        writer.close();
    }
}
