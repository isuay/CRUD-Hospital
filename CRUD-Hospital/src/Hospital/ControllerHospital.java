package Hospital;

import java.sql.*;
import java.util.*;

public class ControllerHospital {

    private Vista vista = new Vista();

    public ControllerHospital() {
    }

    public void añadirHospital(Hospital h) throws SQLException {
        DBHospital db = new DBHospital();
        db.añadirHospital(h);
    }

    public void verHospitales() throws SQLException {
        ArrayList<Hospital> hospitales = new ArrayList<Hospital>();
        DBHospital db = new DBHospital();
        //hospitales = db.obtener();
        vista.verHospitales(hospitales);
    }

}
