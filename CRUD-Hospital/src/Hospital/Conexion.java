package Hospital;

import java.sql.*;

public class Conexion {

    public static Connection conectar() {
        Connection con = null;
        try {
            String password = "ausias";
            String username = "admin";
            //String url = "jdbc:mysql://localhost:3306/Hospital?user=" + usuario
            //        + "&password=" + password;
            String url = "jdbc:mysql://localhost:3306/Hospital";

            con = DriverManager.getConnection(url, username, password);
            /*if (con != null) {
                System.out.println("Conectado");
            }*/
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
}
