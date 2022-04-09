package Hospital;

import java.sql.*;

public class DBDoctor {
    
    private static final String WHERE_ID = "WHERE id=";

    public void añadirDoctor(Doctor d) throws SQLException {
        String sql = "INSERT INTO doctores (nombre, fechaNac, telefono, especialidad, idHospital) VALUES ('" + d.getNombre() + "', '" + d.getFechaNac()+ "', '" + d.getTelefono()+ "', '" + d.getEspecialidad() + "', " + d.getIdHospital()+ ")";

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void eliminarDoctor(Doctor d) throws SQLException {
        String sql = "DELETE FROM doctores WHERE id=" + d.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarNombreDoctor(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET nombre='" + d.getNombre() + "'" + WHERE_ID + d.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarIDHospital(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET idHospital='" + d.getIdHospital() + "'" + WHERE_ID + d.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarTelefonoDoctor(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET telefono='" + d.getTelefono()+ "'" + WHERE_ID + d.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void actualizarEspecialidad(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET especialidad='" + d.getEspecialidad() + "'" + WHERE_ID + d.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    public void obtener() throws SQLException {
        String sql = "SELECT * FROM doctores";
        
        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            int idHospital = rs.getInt("idHospital");
            String especialidad = rs.getString("especialidad");
            String telefono = rs.getString("telefono");
            String fechaNac = rs.getString("fechaNac"); 
            System.out.println(String.format("%d. %s - %s - %s - %s - %d", id, nombre, telefono, fechaNac, especialidad, idHospital));
        }
        stm.close();
        rs.close();
        connection.close();
    }
}
