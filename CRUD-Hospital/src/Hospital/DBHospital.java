package Hospital;

import java.sql.*;
import java.util.ArrayList;

public class DBHospital {

    /* public static void conectar() {
        try {

            String url = "jdbc:mysql://localhost:3306/Hospitales";
            String username = "admin";
            String password = "ausias";

            Connection connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }*/
    public void añadirHospital(Hospital h) {

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
        
        try {
            Connection con = Conexion.conectar();
            Statement stm = con.createStatement();

            stm.execute(sql);
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
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

    public ArrayList<Hospital> obtener() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM hospitales";
        ArrayList<Hospital> listaHospital = new ArrayList<Hospital>();
        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Hospital h = new Hospital();
                h.setId(rs.getInt(h.getId()));
                h.setNombre(rs.getString(h.getNombre()));
                h.setDireccion(rs.getString(h.getDireccion()));
                h.setLocalidad(rs.getString(h.getLocalidad()));
                h.setTelefono(rs.getString(h.getTelefono()));
                listaHospital.add(h);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método obtener");
            e.printStackTrace();
        }
        return listaHospital;
    }

}
