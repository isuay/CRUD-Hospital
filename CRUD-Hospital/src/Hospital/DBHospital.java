package Hospital;

import java.sql.*;
import java.util.ArrayList;

public class DBHospital {

    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/Hospital";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "ausias";

    public static void conectar() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public void añadirHospital(Hospital h) throws SQLException {

        //Statement stm = null;
        //Connection con = null;
        String sql = "INSERT INTO hospitales (nombre, direccion, localidad, telefono) VALUES ('" + h.getNombre() + "', '" + h.getDireccion() + "','" + h.getLocalidad() + "','" + h.getTelefono() + "')";
        /*String sql = "INSERT INTO hospitales (nombre, direccion, localidad, telefono) VALUES ('";
        sql += h.getNombre();
        sql += "', '";
        sql += h.getDireccion();
        sql += "','";
        sql += h.getLocalidad();
        sql += "','";
        sql += h.getTelefono();
        sql += "')";*/

        Statement stm = connection.createStatement();
        stm.execute(sql);

        stm.close();
        connection.close();

    }

    public void eliminarHospital(Hospital h) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "DELETE FROM hospitales WHERE id=" + h.getId();

        try {
            con = Conexion.conectar();
            stm = con.createStatement();

            stm.execute(sql);
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void actualizarHospital(Hospital h) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "UPDATE hospitales SET nombre='" + h.getNombre() + "',direccion='" + h.getDireccion() + "',localidad='" + h.getLocalidad() + "',telefono='" + h.getTelefono() + "'" + "WHERE id=" + h.getId();

        try {
            con = Conexion.conectar();
            stm = con.createStatement();

            stm.execute(sql);
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void actualizarNombreHospital(Hospital h) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "UPDATE hospitales SET nombre='" + h.getNombre() + "'" + "WHERE id=" + h.getId();

        try {
            con = Conexion.conectar();
            stm = con.createStatement();

            stm.execute(sql);
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void actualizarDireccionHospital(Hospital h) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "UPDATE hospitales SET direccion='" + h.getDireccion() + "'" + "WHERE id=" + h.getId();

        try {
            con = Conexion.conectar();
            stm = con.createStatement();

            stm.execute(sql);
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void actualizarLocalidadHospital(Hospital h) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "UPDATE hospitales SET localidad='" + h.getLocalidad() + "'" + "WHERE id=" + h.getId();

        try {
            con = Conexion.conectar();
            stm = con.createStatement();

            stm.execute(sql);
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void actualizarTelefonoHospital(Hospital h) {

        Statement stm = null;
        Connection con = null;

        String sql = "UPDATE hospitales SET telefono='" + h.getTelefono() + "'" + "WHERE id=" + h.getId();

        try {
            con = Conexion.conectar();
            stm = con.createStatement();

            stm.execute(sql);
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void obtener() throws SQLException {
        //Connection co = null;
        //Statement stm = null;
        //ResultSet rs = null;
        String sql = "SELECT * FROM hospitales";
        //ArrayList<Hospital> listaHospital = new ArrayList<Hospital>();

        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Hospital h = new Hospital();
            h.setId(rs.getInt("id"));
            h.setNombre(rs.getString("nombre"));
            h.setDireccion(rs.getString("direccion"));
            h.setLocalidad(rs.getString("localidad"));
            h.setTelefono(rs.getString("telefono"));
            //listaHospital.add(h);
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

        //return listaHospital;
    }

}
