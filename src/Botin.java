import java.util.HashMap;
import java.util.Map;

public class Botin {

    public static void main(String[] args) {
        Map<Integer, String> repartir = botin(3, new String[] {"10, 20, 50, 200, 500"});

        System.out.println(repartir.toString());

    }

    public static Map<Integer, String> botin (int ladrones, String[] billetes) {
        Map<Integer, String> botin = new HashMap<>();
        int leToca;
        String billete;
        String reparto;

        for (int i = 0; i < billetes.length; i++) {
            billete = billetes[i];

            //Si devuelve 0, tiene que volver a empezar por el primero.
            leToca = i % ladrones;

            reparto = botin.get(leToca);

            if (botin == null) {
                botin.put(leToca, reparto);
            } else {
                botin.put(leToca, reparto + " " + billete);
            }
        } return botin;


    }
}
