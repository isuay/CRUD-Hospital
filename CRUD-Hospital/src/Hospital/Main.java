package Hospital;

import java.sql.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner in = new Scanner(System.in);
        do {
            Menus.menu();
            System.out.print("Indique una opción: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    Switch.switchHospital();
                    break;
                case 2:
                    Switch.switchDoctor();
                    break;
            }
        } while (opcion != 3);
    }

}
