package Activity5;

public class User {

    String name;
    String password;

    int tries;

    public User(String name, String password, int tries) {
        this.name = name;
        this.password = password;
        this.tries = tries;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getTries() {
        return tries;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }
}
