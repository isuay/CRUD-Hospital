package Hospital;

import java.sql.*;

/**
 *
 * @author Jose, Iris
 */
public class Conexion {

    /**
     * Constructor por defecto.
     */
    private Conexion() {
    }

    /**
     * Método que devuelve la conexión del programa con la base de datos.
     * @return Devuelve un objeto Connection.
     */
    public static Connection conectar() {
        Connection connection = null;
        final String URL = "jdbc:mysql://localhost:3306/Hospital";
        final String USERNAME = "admin";
        final String PASSWORD = "ausias";

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
        }
        return connection;
    }
}
