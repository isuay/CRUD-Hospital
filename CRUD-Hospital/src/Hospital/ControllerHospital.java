package Hospital;

import java.sql.*;
import java.util.*;

public class ControllerHospital {

    public ControllerHospital() {
    }

    public void conectar() throws SQLException {
        DBHospital db = new DBHospital();
        db.conectar();
    }

    public void añadirHospital(Hospital h) throws SQLException {
        DBHospital db = new DBHospital();
        db.añadirHospital(h);
    }

    public void actualizarHospital(Hospital h) throws SQLException {
        DBHospital db = new DBHospital();
        db.actualizarHospital(h);
    }

    public void actualizarNombreHospital(Hospital h) throws SQLException {
        DBHospital db = new DBHospital();
        db.actualizarNombreHospital(h);
    }

    public void actualizarDireccionHospital(Hospital h) throws SQLException {
        DBHospital db = new DBHospital();
        db.actualizarDireccionHospital(h);
    }

    public void actualizarLocalidadHospital(Hospital h) throws SQLException {
        DBHospital db = new DBHospital();
        db.actualizarLocalidadHospital(h);
    }

    public void actualizarTelefonoHospital(Hospital h) throws SQLException {
        DBHospital db = new DBHospital();
        db.actualizarTelefonoHospital(h);
    }

    public void eliminarHospital(Hospital h) throws SQLException {
        DBHospital db = new DBHospital();
        db.eliminarHospital(h);
    }

    public void verHospitales() throws SQLException {
        DBHospital db = new DBHospital();
        db.obtener();

    }

}
