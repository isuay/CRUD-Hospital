package Hospital;

import java.sql.SQLException;

public class ControllerDoctor {

    public ControllerDoctor() {
    }

    public void conectar() throws SQLException {
        DBDoctor db = new DBDoctor();
        db.conectar();
    }

    public void añadirDoctor(Doctor d) throws SQLException {
        DBDoctor db = new DBDoctor();
        db.añadirDoctor(d);
    }

    public void actualizarNombreDoctor(Doctor d) throws SQLException {
        DBDoctor db = new DBDoctor();
        db.actualizarNombreDoctor(d);
    }

    public void actualizarTelefonoDoctor(Doctor d) throws SQLException {
        DBDoctor db = new DBDoctor();
        db.actualizarTelefonoDoctor(d);
    }

    public void actualizarEspecialidad(Doctor d) throws SQLException {
        DBDoctor db = new DBDoctor();
        db.actualizarEspecialidad(d);
    }

    public void actualizarID_Hospital(Doctor d) throws SQLException {
        DBDoctor db = new DBDoctor();
        db.actualizarID_hospi(d);
    }

    public void eliminarDoctor(Doctor d) throws SQLException {
        DBDoctor db = new DBDoctor();
        db.eliminarDoctor(d);
    }

    public void verDoctores() throws SQLException {
        DBDoctor db = new DBDoctor();
        db.obtener();
    }

}
