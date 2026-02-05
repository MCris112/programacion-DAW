
public class AppDb {

    static void main() {

             crearPersona("Cristopher Quiñones", "cristopher@darkredgm.com");
    }

    public static void crearPersona(String nombre, String email) {
        String sql = "INSERT INTO persona (nombre, email) VALUES (?, ?)";
        //TODO
//        try (Connection conn = MCConnection.getConnection();
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//            ps.setString(1, nombre);
//            ps.setString(2, email);
//            ps.executeUpdate();
//            System.out.println("Persona creada.");
//        } catch (SQLException e) {
//            System.err.println("Error al insertar: " + e.getMessage());
//        }
    }
}
