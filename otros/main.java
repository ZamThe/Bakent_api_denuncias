import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/aplicativo";
        String username = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Consulta para roles
            System.out.println("Tabla roles:");
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM roles")) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String descripcion = rs.getString("descripcion");
                    System.out.println("ID: " + id + ", Nombre: " + nombre + ", Descripción: " + descripcion);
                }
            }

            // Consulta para usuarios
            System.out.println("\nTabla usuarios:");
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String usernameUsuario = rs.getString("username");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String passwordUsuario = rs.getString("password");
                    Date fechaNacimiento = rs.getDate("fecha_nacimiento");
                    boolean enabled = rs.getBoolean("enabled");
                    boolean redSocial = rs.getBoolean("red_social");
                    String image = rs.getString("image");
                    System.out.println("ID: " + id + ", Username: " + usernameUsuario + ", Nombre: " + nombre + ", Apellido: " + apellido
                            + ", Password: " + passwordUsuario + ", Fecha Nacimiento: " + fechaNacimiento + ", Enabled: " + enabled
                            + ", Red Social: " + redSocial + ", Imagen: " + image);
                }
            }

            // Puedes continuar con consultas para otras tablas aquí (roles_usuarios, delitos, casos)
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
