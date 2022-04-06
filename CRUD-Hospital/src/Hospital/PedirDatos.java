package Hospital;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PedirDatos {

    public static int pedirId() {
        Scanner in = new Scanner(System.in);
        boolean bien = false;
        int id = 0;
        do {
            try {
                System.out.print("Diga el id que desea cambiar: ");
                id = in.nextInt();
                bien = true;
            } catch (InputMismatchException e) {
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
            }
        } while (bien == false);
        return id;
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

    public static Doctor pedirAllStringsDoctor(Doctor d) {
        String r = pedirString("Diga el nombre que desea usar: ");
        d.setNombre(r);
        r = pedirString("Diga la telefono que desea usar: ");
        d.setTelefono(r);
        r = pedirString("Diga la especialidad que desea usar: ");
        d.setEspecialidad(r);
        r = pedirString("Diga el id del hospital que desea usar: ");
        int id_hospital = Integer.parseInt(r);
        d.setIdHospital(id_hospital);
        r = pedirString("Diga la fecha de nacimiento que desea usar (aaaa/mm/dd): ");
        d.setFechaNac(r);

        return d;
    }

}