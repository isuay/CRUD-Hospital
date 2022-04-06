package Hospital;

import java.sql.*;

public class DBDoctor {
    
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/Hospital";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "ausias";

    public static void conectar() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public void añadirDoctor(Doctor d) throws SQLException {
        String sql = "INSERT INTO doctores (nombre, direccion, localidad, telefono) VALUES ('" + d.getNombre() + "', '" + d.getTelefono() + "','" + d.getIdHospital()+ "','" + d.getEspecialidad() + "','" + d.getFechaNac() + "')";

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void eliminarDoctor(Doctor d) throws SQLException {
        String sql = "DELETE FROM doctores WHERE id=" + d.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarNombreDoctor(Doctor d) throws SQLException {
        String sql = "UPDATE hospitales SET nombre='" + d.getNombre() + "WHERE id=" + d.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarID_hospi(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET id_hospital='" + d.getIdHospital() + "'" + "WHERE id=" + d.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarTelefonoDoctor(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET telefono='" + d.getTelefono()+ "'" + "WHERE id=" + d.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarEspecialidad(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET especialidad='" + d.getEspecialidad() + "'" + "WHERE id=" + d.getId();

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void obtener() throws SQLException {
        String sql = "SELECT * FROM doctores";
        
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            int id_hospital = rs.getInt("id_hospital");
            String especialidad = rs.getString("especialidad");
            String telefono = rs.getString("telefono");
            String fechaNac = rs.getString("fechaNac"); 
            System.out.println(String.format("%d. %s - %s - %s - %s - %d", id, nombre, telefono, fechaNac, especialidad, id_hospital));
        }
        stm.close();
        rs.close();
        connection.close();
    }

}


