package Hospital;

import java.sql.*;

public class Conexion {

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
