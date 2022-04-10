package Hospital;

import java.sql.*;

/**
 *
 * @author Jose, Iris
 */
public class DBHospital {
    
    private static final String WHERE_ID = "WHERE id=";

    /**
     * Método para añadir un hospital a la base de datos.
     * @param h Objeto Hospital.
     * @throws SQLException
     */
    public void añadirHospital(Hospital h) throws SQLException {
        String sql = "INSERT INTO hospitales (nombre, direccion, localidad, telefono) VALUES ('" + h.getNombre() + "', '" + h.getDireccion() + "','" + h.getLocalidad() + "','" + h.getTelefono() + "')";

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que elimina un hospital de la base de datos.
     * @param h Objeto Hospital.
     * @throws SQLException
     */
    public void eliminarHospital(Hospital h) throws SQLException {
        String sql = "DELETE FROM hospitales WHERE id=" + h.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que actualiza el nombre, direccion, localidad y telefono de un hospital.
     * @param h Objeto Hospital
     * @throws SQLException
     */
    public void actualizarHospital(Hospital h) throws SQLException {
        String sql = "UPDATE hospitales SET nombre='" + h.getNombre() + "',direccion='" + h.getDireccion() + "',localidad='" + h.getLocalidad() + "',telefono='" + h.getTelefono() + "'" + WHERE_ID + h.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que actualiza el nombre de un hospital.
     * @param h Objeto Hospitals.
     * @throws SQLException
     */
    public void actualizarNombreHospital(Hospital h) throws SQLException {
        String sql = "UPDATE hospitales SET nombre='" + h.getNombre() + "'" + WHERE_ID + h.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que actualiza la dirección de un hospital.
     * @param h Objeto Hospital.
     * @throws SQLException
     */
    public void actualizarDireccionHospital(Hospital h) throws SQLException {
        String sql = "UPDATE hospitales SET direccion='" + h.getDireccion() + "'" + WHERE_ID + h.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que actualiza la localidad de un hospital. 
     * @param h Objeto Hospital.
     * @throws SQLException
     */
    public void actualizarLocalidadHospital(Hospital h) throws SQLException {
        String sql = "UPDATE hospitales SET localidad='" + h.getLocalidad() + "'" + WHERE_ID + h.getId();

        Connection connection = Conexion.conectar();
        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();
    }

    /**
     * Método que actualiza el teléfono de un hospital.
     * @param h Objeto Hospital.
     * @throws SQLException
     */
    public void actualizarTelefonoHospital(Hospital h) throws SQLException {
        String sql = "UPDATE hospitales SET telefono='" + h.getTelefono() + "'" + WHERE_ID + h.getId();

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
        String sql = "SELECT * FROM hospitales";
        
        Connection connection = Conexion.conectar();
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
