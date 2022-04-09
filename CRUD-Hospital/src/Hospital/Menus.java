package Hospital;

public class Menus {
    
    private Menus(){
    }

    public static void menuHospital() {

        System.out.println("\n---------MENU HOSPITAL---------"
                + "\n1. Cambiar nombre Hospital"
                + "\n2. Cambiar direccion Hospital"
                + "\n3. Cambiar telefono Hospital"
                + "\n4. Cambiar localidad Hospital"
                + "\n5. Cambiar nombre, localidad, direccion y telefono del hospital"
                + "\n6. Añadir hospital"
                + "\n7. Borrar hospital"
                + "\n8. Ver hospitales"
                + "\n9. Salir");
    }

    public static void menu() {
        System.out.println("\n---------MENU---------"
                + "\n 1.Modificar Hospitales"
                + "\n 2.Modificar Doctores"
                + "\n 3.Salir");
    }

    public static void menuDoctor() {
        System.out.println("\n---------MENU DOCTOR---------"
                + "\n1. Cambiar nombre"
                + "\n2. Cambiar Telefono"
                + "\n3. Cambiar Especialidad"
                + "\n4. Cambiar idHospital"
                + "\n5. Añadir Doctor"
                + "\n6. Borrar Doctor"
                + "\n7. Ver Doctores"
                + "\n8. Salir");
    }
}
