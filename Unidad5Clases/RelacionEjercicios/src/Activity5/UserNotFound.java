package Activity5;

public class UserNotFound extends RuntimeException {
    public UserNotFound() {
        super("El usuario no existe");
    }
}
