package Hospital;

import java.sql.*;

/**
 *
 * @author Jose, Iris
 */
public class DBDoctor {
    
    private static final String WHERE_ID = "WHERE id=";

    /**
     * Método para añadir un doctor a la base de datos.
     * @param d Objeto Doctor.
     * @throws SQLException
     */
    public void añadirDoctor(Doctor d) throws SQLException {
        String sql = "INSERT INTO doctores (nombre, fechaNac, telefono, especialidad, idHospital) VALUES ('" + d.getNombre() + "', '" + d.getFechaNac()+ "', '" + d.getTelefono()+ "', '" + d.getEspecialidad() + "', " + d.getIdHospital()+ ")";

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que elimina un doctor de la base de datos.
     * @param d Objeto Doctor.
     * @throws SQLException
     */
    public void eliminarDoctor(Doctor d) throws SQLException {
        String sql = "DELETE FROM doctores WHERE id=" + d.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que actualiza el nombre de un doctor.
     * @param d Objeto Doctor.
     * @throws SQLException
     */
    public void actualizarNombreDoctor(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET nombre='" + d.getNombre() + "'" + WHERE_ID + d.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que actualiza el id del Hospital en el que trabaja un doctor.
     * @param d Objeto Doctor.
     * @throws SQLException
     */
    public void actualizarIDHospital(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET idHospital='" + d.getIdHospital() + "'" + WHERE_ID + d.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que actualiza el teléfono de un doctor.
     * @param d Objeto Doctor.
     * @throws SQLException
     */
    public void actualizarTelefonoDoctor(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET telefono='" + d.getTelefono()+ "'" + WHERE_ID + d.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que actualiza la especialidad de un doctor.
     * @param d Objeto doctor.
     * @throws SQLException
     */
    public void actualizarEspecialidad(Doctor d) throws SQLException {
        String sql = "UPDATE doctores SET especialidad='" + d.getEspecialidad() + "'" + WHERE_ID + d.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que muestra todos los doctores que hay en la base de datos.
     * @throws SQLException
     */
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
