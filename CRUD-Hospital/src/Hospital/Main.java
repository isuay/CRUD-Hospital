package Hospital;

import java.util.*;

public class Main {

    public static void menu() {

        System.out.println("---------MENU---------"
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

    public static void verHospital(ArrayList<Hospital> h) {
        for (int i = 0; i < h.size(); i++) {
            System.out.println("Datos del Hospital: " + h.get(i));
        }
    }

    public static void main(String[] args) {
        int opcion = 0;
        int id;
        String r;
        Scanner in = new Scanner(System.in);
        Hospital h = new Hospital();
        DBHospital db = new DBHospital();
        do {
            menu();
            System.out.print("Indique una opción: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Diga el id del hospital que desea cambiar: ");
                    id = in.nextInt();
                    System.out.print("Diga el nombre que desea usar: ");
                    r = in.nextLine();
                    h.setId(id);
                    h.setNombre(r);
                    db.actualizarNombreHospital(h);
                    break;
                case 2:
                    System.out.print("Diga el id del hospital que desea cambiar: ");
                    id = in.nextInt();
                    System.out.print("Diga el dirección que desea usar: ");
                    r = in.nextLine();
                    h.setId(id);
                    h.setDireccion(r);
                    db.actualizarDireccionHospital(h);
                    break;
                case 3:
                    System.out.print("Diga el id del hospital que desea cambiar: ");
                    id = in.nextInt();
                    System.out.print("Diga el telefono que desea usar: ");
                    r = in.nextLine();
                    h.setId(id);
                    h.setTelefono(r);
                    db.actualizarTelefonoHospital(h);
                    break;
                case 4:
                    System.out.print("Diga el id del hospital que desea cambiar: ");
                    id = in.nextInt();
                    System.out.print("Diga la localidad que desea usar: ");
                    r = in.nextLine();
                    h.setId(id);
                    h.setLocalidad(r);
                    db.actualizarLocalidadHospital(h);
                    break;
                case 5:
                    System.out.print("Diga el id del hospital que desea cambiar: ");
                    id = in.nextInt();
                    System.out.print("Diga el nombre que desea usar: ");
                    r = in.nextLine();
                    h.setNombre(r);
                    System.out.print("Diga la dirección que desea usar: ");
                    r = in.nextLine();
                    h.setDireccion(r);
                    System.out.print("Diga el telefono que desea usar: ");
                    r = in.nextLine();
                    h.setTelefono(r);
                    System.out.print("Diga la localidad que desea usar: ");
                    r = in.nextLine();
                    h.setLocalidad(r);
                    h.setId(id);
                    db.actualizarHospital(h);
                    break;
                case 6:
                    in.nextLine();
                    System.out.print("Diga el nombre que desea usar: ");
                    r = in.nextLine();
                    h.setNombre(r);
                    System.out.print("Diga la dirección que desea usar: ");
                    r = in.nextLine();
                    h.setDireccion(r);
                    System.out.print("Diga el telefono que desea usar: ");
                    r = in.nextLine();
                    h.setTelefono(r);
                    System.out.print("Diga la localidad que desea usar: ");
                    r = in.nextLine();
                    h.setLocalidad(r);
                    db.añadirHospital(h);
                    break;
                case 7:
                    System.out.print("Diga el id del hospital que desea cambiar: ");
                    id = in.nextInt();
                    h.setId(id);
                    db.eliminarHospital(h);
                    break;
                case 8:
                    ArrayList<Hospital> hospitales = new ArrayList<Hospital>();
                    hospitales = db.obtener();
                    verHospital(hospitales);
                    break;
            }
        } while (opcion != 9);

    }

}
