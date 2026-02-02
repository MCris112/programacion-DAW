package Activity2;

public class Empleado {

    private Integer id;
    private String nombre;
    private String[] roles;
    private Boolean activo;

    public Empleado(int id, String nombre, String[] roles, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.roles = roles;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getRoles() {
        return roles;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean isAdmin() {
        boolean admin = false;

        for (int i = 0; i < roles.length; i++) {
            if (roles[i].equals("admin")) {
                admin = true;
            }
        }

        return admin;
    }
}
