package DB.Exceptions;

public class CannotSetAttributeOnModel extends RuntimeException {

    public CannotSetAttributeOnModel(String attrName) {
        super("Cannot set attribute on model ["+attrName+"]");
    }
}
