package Hospital;

import java.util.ArrayList;

public class Vista {

    public void verHospital(Hospital h) {
        System.out.println("Datos del hospital: " + h);
    }

    public void verHospitales(ArrayList<Hospital> h) {
        for (Hospital hospital : h) {
            System.out.println("%d. %s - %s - %s - %s"  + hospital);
        }
        /*for (int i = 0; i < h.size(); i++) {
            System.out.println("Datos del Hospital: " + h.get(i));
        }*/
    }
}
