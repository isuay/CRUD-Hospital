package Hospital;

import java.sql.*;
import java.util.*;

public class Main {

    public static void menu() {

        System.out.println("\n---------MENU---------"
                + "\n1. Cambiar nombre"
                + "\n2. Cambiar direccion"
                + "\n3. Cambiar telefono"
                + "\n4. Cambiar localidad"
                + "\n5. Cambiar nombre, localidad, direccion y telefono del hospital"
                + "\n6. Añadir hospital"
                + "\n7. Borrar hospital"
                + "\n8. Ver hospitales"
                + "\n9. Salir");
    }

    public static Hospital pedirId(Hospital h) {
        Scanner in = new Scanner(System.in);
        boolean bien = false;
        int id = 0;
        do {
            try {
                System.out.print("Diga el id del hospital que desea cambiar: ");
                id = in.nextInt();
                h.setId(id);
                bien = true;
            } catch (InputMismatchException e) {
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
            }
        } while (bien == false);
        return h;
    }

    public static String pedirString(String mensaje) {
        Scanner in = new Scanner(System.in);

        System.out.print(mensaje);
        String r = in.nextLine();

        return r;
    }

    public static Hospital pedirAllStrings(Hospital h) {
        String r = pedirString("Diga el nombre que desea usar: ");
        h.setNombre(r);
        r = pedirString("Diga la dirección que desea usar: ");
        h.setDireccion(r);
        r = pedirString("Diga la localidad que desea usar: ");
        h.setLocalidad(r);
        r = pedirString("Diga el telefono que desea usar: ");
        h.setTelefono(r);
        
        return h;
    }

    public static void main(String[] args) {
        int opcion = 0;
        int id;
        String r;

        Scanner in = new Scanner(System.in);

        Hospital h = new Hospital();
        //DBHospital db = new DBHospital();
        ControllerHospital c = new ControllerHospital();

        try {
            do {
                menu();
                System.out.print("Indique una opción: ");
                opcion = in.nextInt();
                c.conectar();

                switch (opcion) {
                    case 1:
                        h = pedirId(h);
                        r = pedirString("Diga el nombre que desea usar: ");
                        
                        h.setNombre(r);
                        c.actualizarNombreHospital(h);
                        break;
                    case 2:
                        h = pedirId(h);
                        r = pedirString("Diga el dirección que desea usar: ");
                        h.setDireccion(r);
                        c.actualizarDireccionHospital(h);
                        break;
                    case 3:
                        h = pedirId(h);
                        r = pedirString("Diga el telefono que desea usar: ");
                        h.setTelefono(r);
                        c.actualizarTelefonoHospital(h);
                        break;
                    case 4:
                        h = pedirId(h);
                        r = pedirString("Diga la localidad que desea usar: ");
                        h.setLocalidad(r);
                        c.actualizarLocalidadHospital(h);
                        break;
                    case 5:
                        h = pedirId(h);
                        h = pedirAllStrings(h);
                        c.actualizarHospital(h);
                        break;
                    case 6:
                        h = pedirAllStrings(h);
                        c.añadirHospital(h);
                        break;
                    case 7:
                        h = pedirId(h);
                        c.eliminarHospital(h);
                        break;
                    case 8:
                        //db.obtener();
                        break;
                }
            } while (opcion != 9);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
