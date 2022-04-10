package Hospital;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Jose, Iris
 */
public class Switch {

    /**
     * Constructor por defecto.
     */
    private Switch() {
    }

    /**
     * Método que interactúa con el menú del hospital, los métodos del DBHospital y de PedirDatos.
     */
    public static void switchHospital() {
        int opcion = 0;
        String r;

        Scanner in = new Scanner(System.in);

        Hospital h = new Hospital();
        DBHospital db = new DBHospital();
        try {
            do {
                Menus.menuHospital();
                System.out.print("Indique una opción: ");
                opcion = in.nextInt();

                switch (opcion) {
                    case 1:
                        h.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el nombre que desea usar: ");

                        h.setNombre(r);
                        db.actualizarNombreHospital(h);
                        break;
                    case 2:
                        h.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el dirección que desea usar: ");
                        h.setDireccion(r);
                        db.actualizarDireccionHospital(h);
                        break;
                    case 3:
                        h.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el telefono que desea usar: ");
                        h.setTelefono(r);
                        db.actualizarTelefonoHospital(h);
                        break;
                    case 4:
                        h.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga la localidad que desea usar: ");
                        h.setLocalidad(r);
                        db.actualizarLocalidadHospital(h);
                        break;
                    case 5:
                        h.setId(PedirDatos.pedirId());
                        h = PedirDatos.pedirAllStrings(h);
                        db.actualizarHospital(h);
                        break;
                    case 6:
                        h = PedirDatos.pedirAllStrings(h);
                        db.añadirHospital(h);
                        break;
                    case 7:
                        h.setId(PedirDatos.pedirId());
                        db.eliminarHospital(h);
                        break;
                    case 8:
                        System.out.println("\n---------HOSPITALES---------");
                        db.obtener();
                        break;
                    default:
                        break;
                }
            } while (opcion != 9);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * Método que interactúa con el menú de los doctores, los métodos del DBDoctor y de PedirDatos.
     */
    public static void switchDoctor() {
        int opcion = 0;
        String r;

        Scanner in = new Scanner(System.in);

        Doctor d = new Doctor();
        DBDoctor db = new DBDoctor();
        try {
            do {
                Menus.menuDoctor();
                System.out.print("Indique una opción: ");
                opcion = in.nextInt();

                switch (opcion) {
                    case 1:
                        d.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el nombre que desea usar: ");
                        d.setNombre(r);
                        db.actualizarNombreDoctor(d);
                        break;
                    case 2:
                        d.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el telefono que desea usar: ");
                        d.setTelefono(r);
                        db.actualizarTelefonoDoctor(d);
                        break;
                    case 3:
                        d.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga la especialidad que desea usar: ");
                        d.setEspecialidad(r);
                        db.actualizarEspecialidad(d);
                        break;
                    case 4:
                        d.setId(PedirDatos.pedirId());
                        r = PedirDatos.pedirString("Diga el id del Hospital que desea usar: ");
                        int idHospital = Integer.parseInt(r);
                        d.setIdHospital(idHospital);
                        db.actualizarIDHospital(d);
                        break;
                    case 5:
                        d = PedirDatos.pedirAllStringsDoctor(d);
                        db.añadirDoctor(d);
                        break;
                    case 6:
                        d.setId(PedirDatos.pedirId());
                        db.eliminarDoctor(d);
                        break;
                    case 7:
                        System.out.println("\n---------DOCTORES---------");
                        db.obtener();
                        break;
                    default:
                        break;
                }
            } while (opcion != 8);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
