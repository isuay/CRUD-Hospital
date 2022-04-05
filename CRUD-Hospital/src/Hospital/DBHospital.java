package Hospital;

import java.sql.*;

public class DBHospital {

    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/Hospital";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "ausias";

    public static void conectar() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public void añadirHospital(Hospital h) throws SQLException {
        String sql = "INSERT INTO hospitales (nombre, direccion, localidad, telefono) VALUES ('" + h.getNombre() + "', '" + h.getDireccion() + "','" + h.getLocalidad() + "','" + h.getTelefono() + "')";

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void eliminarHospital(Hospital h) throws SQLException {
        String sql = "DELETE FROM hospitales WHERE id=" + h.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarHospital(Hospital h) throws SQLException {
        String sql = "UPDATE hospitales SET nombre='" + h.getNombre() + "',direccion='" + h.getDireccion() + "',localidad='" + h.getLocalidad() + "',telefono='" + h.getTelefono() + "'" + "WHERE id=" + h.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarNombreHospital(Hospital h) throws SQLException {
        String sql = "UPDATE hospitales SET nombre='" + h.getNombre() + "'" + "WHERE id=" + h.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarDireccionHospital(Hospital h) throws SQLException {
        String sql = "UPDATE hospitales SET direccion='" + h.getDireccion() + "'" + "WHERE id=" + h.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarLocalidadHospital(Hospital h) throws SQLException {
        String sql = "UPDATE hospitales SET localidad='" + h.getLocalidad() + "'" + "WHERE id=" + h.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarTelefonoHospital(Hospital h) throws SQLException {
        String sql = "UPDATE hospitales SET telefono='" + h.getTelefono() + "'" + "WHERE id=" + h.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void obtener() throws SQLException {
        String sql = "SELECT * FROM hospitales";
        
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String direccion = rs.getString("direccion");
            String localidad = rs.getString("localidad");
            String telefono = rs.getString("telefono");
            System.out.println(String.format("%d. %s - %s - %s - %s", id, nombre, direccion, localidad, telefono));
        }
        stm.close();
        rs.close();
        connection.close();
    }

}
