package Activity5.Old;

public class UserNotFound extends RuntimeException {
    public UserNotFound() {
        super("El usuario no existe");
    }
}
