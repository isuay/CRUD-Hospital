package Hospital;

import java.sql.SQLException;
import java.util.Scanner;

public class Switch {

    public static void switchHospital() {
        int opcion = 0;
        String r;

        Scanner in = new Scanner(System.in);

        Hospital h = new Hospital();
        ControllerHospital c = new ControllerHospital();
        try {
            do {
                Menus.menuHospital();
                System.out.print("Indique una opción: ");
                opcion = in.nextInt();
                c.conectar();

                switch (opcion) {
                    case 1:
                        h.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el nombre que desea usar: ");

                        h.setNombre(r);
                        c.actualizarNombreHospital(h);
                        break;
                    case 2:
                        h.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el dirección que desea usar: ");
                        h.setDireccion(r);
                        c.actualizarDireccionHospital(h);
                        break;
                    case 3:
                        h.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el telefono que desea usar: ");
                        h.setTelefono(r);
                        c.actualizarTelefonoHospital(h);
                        break;
                    case 4:
                        h.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga la localidad que desea usar: ");
                        h.setLocalidad(r);
                        c.actualizarLocalidadHospital(h);
                        break;
                    case 5:
                        h.setId(PedirDatos.pedirId());
                        h = PedirDatos.pedirAllStrings(h);
                        c.actualizarHospital(h);
                        break;
                    case 6:
                        h = PedirDatos.pedirAllStrings(h);
                        c.añadirHospital(h);
                        break;
                    case 7:
                        h.setId(PedirDatos.pedirId());
                        c.eliminarHospital(h);
                        break;
                    case 8:
                        c.verHospitales();
                        break;
                }
            } while (opcion != 9);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void switchDoctor() {
        int opcion = 0;
        String r;

        Scanner in = new Scanner(System.in);

        Doctor d = new Doctor();
        ControllerDoctor c = new ControllerDoctor();
        try {
            do {
                Menus.menuDoctor();
                System.out.print("Indique una opción: ");
                opcion = in.nextInt();
                c.conectar();

                switch (opcion) {
                    case 1:
                        d.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el nombre que desea usar: ");

                        d.setNombre(r);
                        c.actualizarNombreDoctor(d);
                        break;
                    case 2:
                        d.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el Telefono que desea usar: ");
                        d.setTelefono(r);
                        c.actualizarTelefonoDoctor(d);
                        break;
                    case 3:
                        d.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga la Especialidad que desea usar: ");
                        d.setTelefono(r);
                        c.actualizarEspecialidad(d);
                        break;
                    case 4:
                        d.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el id del Hospital que desea usar: ");
                        int id_hospital = Integer.parseInt(r);
                        d.setIdHospital(id_hospital);
                        c.actualizarID_Hospital(d);
                        break;
                    case 5:
                        d = PedirDatos.pedirAllStringsDoctor(d);
                        c.añadirDoctor(d);
                        break;
                    case 6:
                        d.setId(PedirDatos.pedirId());
                        c.eliminarDoctor(d);
                        break;
                    case 7:
                        c.verDoctores();
                        break;
                }
            } while (opcion != 8);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
