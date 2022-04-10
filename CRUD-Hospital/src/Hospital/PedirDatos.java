package Hospital;

import java.util.*;

/**
 *
 * @author Jose, Iris
 */
public class PedirDatos {

    /**
     * Constructor por defecto.
     */
    private PedirDatos() {
    }

    /**
     * Método que te pide el id que deseaas cambiar.
     * @return El id que deseas cambiar.
     */
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
        } while (!bien);
        return id;
    }

    /**
     * Método que devuelve el String de lo que le pidas por el mensaje.
     * @param mensaje Mensaje que le muestras al usuario.
     * @return Devuelve el String que haya puesto el usuario.
     */
    public static String pedirString(String mensaje) {
        Scanner in = new Scanner(System.in);

        System.out.print(mensaje);
        return in.nextLine();
    }

    /**
     * Método que te pide todos los datos del hospital.
     * @param h Objeto Hospital.
     * @return Devuelve el objeto Hospital.
     */
    public static Hospital pedirAllStrings(Hospital h) {
        String r;
        r = pedirString("Diga el nombre que desea usar: ");
        h.setNombre(r);
        r = pedirString("Diga la dirección que desea usar: ");
        h.setDireccion(r);
        r = pedirString("Diga el telefono que desea usar: ");
        h.setTelefono(r);
        r = pedirString("Diga la localidad que desea usar: ");
        h.setLocalidad(r);

        return h;
    }

    /**
     * Método que te pide todos los datos del doctor.
     * @param d Objeto Doctor.
     * @return Devuelve el objeto Doctor.
     */
    public static Doctor pedirAllStringsDoctor(Doctor d) {
        String r = pedirString("Diga el nombre que desea usar: ");
        d.setNombre(r);
        r = pedirString("Diga la telefono que desea usar: ");
        d.setTelefono(r);
        r = pedirString("Diga la fecha de nacimiento que desea usar (aaaa/mm/dd): ");
        d.setFechaNac(r);
        r = pedirString("Diga la especialidad que desea usar: ");
        d.setEspecialidad(r);
        r = pedirString("Diga el id del hospital que desea usar: ");
        int idHospital = Integer.parseInt(r);
        d.setIdHospital(idHospital);

        return d;
    }
}
